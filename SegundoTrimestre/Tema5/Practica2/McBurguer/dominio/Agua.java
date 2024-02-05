package SegundoTrimestre.Tema5.Practica2.McBurguer.dominio;

public class Agua extends Bebida{

  // Constructors
  public Agua() {
    super("Agua", "Bebida");
  }

  // Methods

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Agua....... ");
    sb.append(this.obtenerPrecio()).append('€');
    return sb.toString();
  }
}
