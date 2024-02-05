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

  @Override
  public void freir() {
    this.estado = FRITA;
    this.setNombre("Patatas.fritas");
    this.cocinado = true;
  }

  @Override
  public void cocer() {
    this.estado = COCIDA;
    this.setNombre("Patata.cocida");
    this.cocinado = true;
  }

  @Override
  public void asar() {
    this.estado = ASADA;
    this.setNombre("Patata.asada");
    this.cocinado = true;
  }

  @Override
  public double obtenerPrecio() {
    return switch (this.estado) {
      case FRITA -> 1.10;
      case COCIDA -> 0.80;
      case ASADA -> 0.90;
      default -> 0;
    };
  }

}
