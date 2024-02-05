package SegundoTrimestre.Tema6.Practica2.McBurguer.dominio;

public class Cola extends Bebida{

  // Constructors
  public Cola() {
    super("Cola", "Bebida");
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Cola......... ");
    sb.append(this.obtenerPrecio()).append('€');
    return sb.toString();
  }
}
