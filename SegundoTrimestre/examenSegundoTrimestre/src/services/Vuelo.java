package services;

import entities.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Objects;

public class Vuelo {
  // Props
  private String codigo;
  private String origen;
  private String destino;
  private LocalDate fecha;
  private LocalTime hora;
  private Double precioBase;
  private Integer asientosDisponibles;
  private ArrayList<Asiento> asientos;

  // Constructor

  public Vuelo(String codigo, String origen, String destino, LocalDate fecha, LocalTime hora, Double precioBase, Integer asientosDisponibles) {
    this.codigo = codigo;
    this.origen = origen;
    this.destino = destino;
    this.fecha = fecha;
    this.hora = hora;
    this.precioBase = precioBase;
    this.asientosDisponibles = asientosDisponibles;
    this.asientos = new ArrayList<>();
    crearAsientos();
  }

  // Getters and Setters
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getOrigen() {
    return origen;
  }

  public void setOrigen(String origen) {
    this.origen = origen;
  }

  public String getDestino() {
    return destino;
  }

  public void setDestino(String destino) {
    this.destino = destino;
  }

  public LocalDate getFecha() {
    return fecha;
  }

  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }

  public LocalTime getHora() {
    return hora;
  }

  public void setHora(LocalTime hora) {
    this.hora = hora;
  }

  public Double getPrecioBase() {
    return precioBase;
  }

  public void setPrecioBase(Double precioBase) {
    this.precioBase = precioBase;
  }

  public Integer getAsientosDisponibles() {
    return asientosDisponibles;
  }

  public void setAsientosDisponibles(Integer asientosDisponibles) {
    this.asientosDisponibles = asientosDisponibles;
  }

  public ArrayList<Asiento> getAsientos() {
    return asientos;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("ClaseVuelo{");
    sb.append("codigo='").append(codigo).append('\'');
    sb.append(", origen='").append(origen).append('\'');
    sb.append(", destino='").append(destino).append('\'');
    sb.append(", fecha=").append(fecha);
    sb.append(", hora=").append(hora);
    sb.append(", precioBase=").append(precioBase);
    sb.append(", asientosDisponibles=").append(asientosDisponibles);
    sb.append(", asientos=").append(asientos);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Vuelo that = (Vuelo) o;
    return Objects.equals(codigo, that.codigo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo);
  }

  /**
   * Metodo para crear los asientos del vuelo
   * Siendo un 30% de tipoBussiness
   */
  private void crearAsientos () {
    Integer numeroAsientosBusiness = (this.asientosDisponibles * 30) / 100;
    for (long i = 0; i < this.asientosDisponibles; i++) {
      Asiento asiento;
      if (i < numeroAsientosBusiness) asiento = new AsientoBusinness(i, this.precioBase, (int) i, "B", true);
      else if (i < (this.asientosDisponibles - numeroAsientosBusiness) / 2) asiento = new AsientoTurista(i, this.precioBase, (int) i, "V", false);
      else asiento = new AsientoTurista(i, this.precioBase, (int) i, "V", true);
    }
  }

  /**
   * Metodo para contar los numeros de asientos disponibles
   * de un tipo
   * @param tipoAsiento tipo a buscar
   * @return numero de asientos
   */
  public Integer verificarDisponibilidad (TipoAsiento tipoAsiento) {
    Integer numAsientos = 0;
    for (Asiento asiento : this.asientos) {
      if (asiento.getTipo().equals(tipoAsiento) && asiento.getPasajero() == null) numAsientos++;
    }
    return numAsientos;
  }

  /**
   * Comprueba si hay asiento disponible de un tipo
   * @param tipoAsiento tipo a encontrar
   * @return asiento si encuentra, null si no encuentra
   */
  public Asiento buscarAsientoDisponible (TipoAsiento tipoAsiento) {
    for (Asiento asiento : this.asientos) {
      if (asiento.getTipo().equals(tipoAsiento) && asiento.getPasajero() == null) return asiento;
    }
    return null;
  }

  /**
   * Metodo para que un pasajero ocupe un asiento
   * si este asiento esta libre
   * @param pasajero pasajero que va a ocupar el asiento
   * @param asiento asiento que va a ocupar el pasajero
   * @return true si lo ha podido ocupar el pasajero el asiento,
   * si no devuelve false
   */
  public boolean ocuparAsiento (Pasajero pasajero, Asiento asiento) {
    if (asiento.getPasajero() == null) {
      pasajero.setAsiento(asiento);
      asiento.setPasajero(pasajero);
      return true;
    } else return false;
  }

  /**
   * Metodo que libera un asiento si el asiento
   * esta ocupado por alguien
   * @param asiento asiento a liberar
   */
  public void liberarAsiento (Asiento asiento) {
    if (asiento.getPasajero() != null) {
      asiento.getPasajero().setAsiento(null);
      asiento.setPasajero(null);
    }
  }

  /**
   * Metodo que saca la cantidad de dias que quedan para el vuelo
   * @return dias para el vuelo
   */
  public Integer diasFaltanVuelo () {
    return (int) ChronoUnit.DAYS.between(LocalDate.now(), this.fecha);
  }

  /**
   * Metodo para crear sacar los pasajeros que hay en el vuelo
   * @return Todos los pasajeros
   */
  public ArrayList<Pasajero> getPasajeros () {
    ArrayList<Pasajero> pasajeros = new ArrayList<>();
    for (Asiento asiento : this.asientos) {
      if (asiento.getPasajero() != null) {
        pasajeros.add(asiento.getPasajero());
      }
    }
    return pasajeros;
  }

}
