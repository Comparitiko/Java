package SegundoTrimestre.Tema7.PracticaClase.services;

import SegundoTrimestre.Tema7.PracticaClase.entities.Transportable;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Envio {

  // Props
  private ArrayList<Transportable> transportables;
  private boolean esInternacional;
  private LocalDate fechaSalida;
  private LocalDate fechaLlegada;

  // Constructor
  public Envio (boolean esInternacional) {
    this.transportables = new ArrayList<>();
    this.fechaSalida = LocalDate.now();
    this.fechaLlegada = null;
    this.esInternacional = esInternacional;
  }

  // Getters and Setters

  public ArrayList<Transportable> getTransportables() {
    return transportables;
  }

  public LocalDate getFechaSalida() {
    return fechaSalida;
  }

  public LocalDate getFechaLlegada() {
    return fechaLlegada;
  }

  public void setFechaLlegada(LocalDate fechaLlegada) {
    this.fechaLlegada = fechaLlegada;
  }

  // Methods

  /**
   * Metodo para añadir un objeto transportable
   * @param item objeto a añadir
   */
  public void agregarTransportable (Transportable item) {
    this.transportables.add(item);
  }

  /**
   * Metodo para calcular el costo de todo el envio
   * @return total costo envio
   */
  public double calcularCostoEnvio() {
    double costo = 0;
    for (Transportable item : this.transportables) {
      costo += item.calcularCostoEnvio(this.esInternacional);
    }
    return costo;
  }

  /**
   * Metodo para listar la informacion de todos los productos
   * @return String con toda la informacion
   */
  public String listarProductos () {
    StringBuffer sb = new StringBuffer();
    for (Transportable item : this.transportables) {
      sb.append(item.toString());
      sb.append("Precio= ").append(item.calcularCostoEnvio(this.esInternacional));
      sb.append("\n");
    }
    return sb.toString();
  }

  /**
   * Dias transcurridos entre que salio del almacen y llego al destino
   * @return
   */
  public int diasTranscurridos () {
    return Period.between(this.fechaSalida, this.fechaLlegada).getDays();
  }
}
