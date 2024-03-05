package services;

import entities.Asiento;
import entities.Pasajero;
import entities.TipoAsiento;
import entities.TipoTarifa;

import java.util.ArrayList;

public class ReservaVuelo {
  // Props
  private static Integer numeroVuelos = 1;
  private Long id;
  private Vuelo vuelo;
  private ArrayList<Pasajero> pasajeros;
  private TipoTarifa tipoT;
  private TipoAsiento tipoA;

  // Constructor
  public ReservaVuelo(Vuelo vuelo, ArrayList<Pasajero> pasajeros, TipoTarifa tipoT, TipoAsiento tipoA) {
    this.id = (long) numeroVuelos++;
    this.vuelo = vuelo;
    this.pasajeros = pasajeros;
    this.tipoT = tipoT;
    this.tipoA = tipoA;
  }

  // Getters and Setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Vuelo getVuelo() {
    return vuelo;
  }

  public void setVuelo(Vuelo vuelo) {
    this.vuelo = vuelo;
  }

  public ArrayList<Pasajero> getPasajeros() {
    return pasajeros;
  }

  public void setPasajeros(ArrayList<Pasajero> pasajeros) {
    this.pasajeros = pasajeros;
  }

  public TipoTarifa getTipoT() {
    return tipoT;
  }

  public void setTipoT(TipoTarifa tipoT) {
    this.tipoT = tipoT;
  }

  public TipoAsiento getTipoA() {
    return tipoA;
  }

  public void setTipoA(TipoAsiento tipoA) {
    this.tipoA = tipoA;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("ReservaVuelo{");
    sb.append("id=").append(id);
    sb.append(", vuelo=").append(vuelo.getCodigo());
    sb.append("Faltan ").append(vuelo.diasFaltanVuelo()).append(" dias, ");
    sb.append(imprimirBilletes());
    sb.append('}');
    return sb.toString();
  }

  /**
   * Metodo para añadir un pasajero
   * @param pasajero
   */
  public void addPasajero (Pasajero pasajero) {
    this.pasajeros.add(pasajero);
  }

  /**
   * Metodo para eliminar un pasajero
   * @param pasajero
   */
  public void removePasajero (Pasajero pasajero) {
    this.pasajeros.remove(pasajero);
  }

  /**
   * Metodo para sacar los asientos asignados a un pasajero
   * @return asientos
   */
  public ArrayList<Asiento> getAsientos () {
    ArrayList<Asiento> asientosAsignados = new ArrayList<>();
    for (Pasajero pasajero : pasajeros) {
      if (pasajero.getAsiento() != null) asientosAsignados.add(pasajero.getAsiento());
    }
    return asientosAsignados;
  }

  /**
   * Metodo para reservar un asiento si hay disponibles
   * @param pasajero
   * @return true si habia para reservar, false si no
   */
  public Boolean reservaAsiento (Pasajero pasajero) {
    Asiento asientoDisponible = this.vuelo.buscarAsientoDisponible(this.tipoA);
    if (asientoDisponible != null) {
      Pasajero pasajeroCopia = new Pasajero(pasajero);
      vuelo.ocuparAsiento(pasajeroCopia, asientoDisponible);
      this.pasajeros.add(pasajeroCopia);
      return true;
    }
    return false;
  }

  /**
   * Metodo para calcular el precio total
   * de los asientos ocupados en la reserva
   * segun el tipo tarifa hayan escogido
   * @return precioTotal
   */
  public Double calcularPrecioTotal () {
    Double precio = 0.0;
    for (Asiento asiento : this.getAsientos()) {
      Double precioAsiento = asiento.calcularPrecio();
      if (this.tipoT.equals(TipoTarifa.CONFORT)) precioAsiento *= 1.15;
      else if (this.tipoT.equals(TipoTarifa.FLEXIBLE)) precioAsiento *= 1.30;
      else if (this.tipoT.equals(TipoTarifa.OPTIMA)) precioAsiento *= 1.10;
      precio += precioAsiento;
    }
    return precio;
  }

  /**
   * Metodo que imprimer los billetes de los pasajeros, con su informacion y precio
   * @return String
   */
  public String imprimirBilletes () {
    StringBuffer sb = new StringBuffer("Pasajeros: { \n");
    for (Pasajero pasajero : this.pasajeros) {
      sb.append(pasajero).append("\n");
    }
    sb.append("\n }");
    return sb.toString();
  }
}
