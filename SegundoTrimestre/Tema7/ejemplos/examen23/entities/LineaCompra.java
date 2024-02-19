package SegundoTrimestre.Tema7.ejemplos.examen23.entities;

import java.util.Objects;

public class LineaCompra {
  // Props
  private int orden; // Número de líneas
  private Producto producto;
  private int cantidad;

  // Constructor
  public LineaCompra(Producto producto, int cantidad) {
    this.producto = producto;
    this.cantidad = cantidad;
  }

  public LineaCompra (LineaCompra lineaCompra) {
    this.producto = lineaCompra.producto;
    this.cantidad = lineaCompra.cantidad;
  }

  // Getters and Setters
  public int getOrden() {
    return orden;
  }

  public void setOrden(int orden) {
    this.orden = orden;
  }

  public Producto getProducto() {
    return producto;
  }

  public void setProducto(Producto producto) {
    this.producto = producto;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  // Methods
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LineaCompra that = (LineaCompra) o;
    return Objects.equals(producto, that.producto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(producto);
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("LineaCompra{");
    sb.append("orden=").append(orden);
    sb.append(", producto=").append(producto);
    sb.append(", cantidad=").append(cantidad);
    sb.append('}');
    return sb.toString();
  }

  /**
   * Metodo para calcular el precio subTotal contando con la cantidad
   * @return subTotal
   */
  public double subTotal () {
    return this.producto.descuento() * cantidad;
  }
}
