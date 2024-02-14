package SegundoTrimestre.Tema7.ejemplos.tienda;

public class LineaDetalle {
  private int cantidad;
  private int numero;
  private Producto producto;

  public LineaDetalle(int cantidad, int numero, Producto producto) {
    this.cantidad = cantidad;
    this.numero = numero;
    this.producto = producto;
  }
}
