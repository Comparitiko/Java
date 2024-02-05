package SegundoTrimestre.Tema5.Practica2.McBurguer.dominio;

import SegundoTrimestre.Tema5.Practica2.McBurguer.interfaces.Cocinable;

public class Patata extends Comida implements Cocinable {

  // Props
  private int estado;

  // Constructors
  public Patata() {
    super("Patata.cruda", "Comida");
    this.estado = CRUDA;
  }

  // Getter and Setters
  public int getEstado() {
    return estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }

  // Methods

  /**
   * Freir patatas
   */
  @Override
  public void freir() {
    this.estado = FRITA;
    this.setNombre("Patatas.fritas");
    this.cocinado = true;
  }

  /**
   * Cocer patata
   */
  @Override
  public void cocer() {
    this.estado = COCIDA;
    this.setNombre("Patata.cocida");
    this.cocinado = true;
  }

  /**
   * Asar patata
   */
  @Override
  public void asar() {
    this.estado = ASADA;
    this.setNombre("Patata.asada");
    this.cocinado = true;
  }

  /**
   * Obtener el precio de la patata
   */
  @Override
  public double obtenerPrecio() {
    return switch (this.estado) {
      case FRITA -> 1.10;
      case COCIDA -> 0.80;
      case ASADA -> 0.90;
      default -> 0;
    };
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer(this.getNombre());
    sb.append("....... ").append(this.obtenerPrecio()).append('€');
    return sb.toString();
  }
}
