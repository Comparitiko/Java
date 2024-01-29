package SegundoTrimestre.Tema5.EjerciciosPracticar.Ejercicio4;

import java.util.Objects;

public class Producto {
  // Props
  private int id;
  private String descripcion;
  private double precioUnitario;
  private int cantidad;
  private int stockMaximo;
  private double descuento;

  // Constructors
  public Producto() {
    this.descripcion = "";
  }

  public Producto(int id, String descripcion, double precioUnitario, int cantidad, int stockMaximo, double descuento) {
    this.id = id;
    this.descripcion = descripcion;
    this.precioUnitario = precioUnitario;
    this.cantidad = cantidad;
    this.stockMaximo = stockMaximo;
    this.descuento = descuento;
  }

  // Getters y Setters

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecioUnitario() {
    return precioUnitario;
  }

  public void setPrecioUnitario(double precioUnitario) {
    this.precioUnitario = precioUnitario;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public int getStockMaximo() {
    return stockMaximo;
  }

  public void setStockMaximo(int stockMaximo) {
    this.stockMaximo = stockMaximo;
  }

  public double getDescuento() {
    return descuento;
  }

  public void setDescuento(double descuento) {
    this.descuento = descuento;
  }

  // Methods

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Producto{");
    sb.append("id=").append(id);
    sb.append(", descripcion='").append(descripcion).append('\'');
    sb.append(", precioUnitario=").append(precioUnitario);
    sb.append(", cantidad=").append(cantidad);
    sb.append(", stockMaximo=").append(stockMaximo);
    sb.append(", descuento=").append(descuento);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Producto producto = (Producto) o;
    return id == producto.id;
  }

  /**
   * Metodo que comprueba si el producto al restarle la cantidad de productos que se vende se queda menor que 0
   * @param cantidad cantidad a vender
   * @return true si se puede vender el producto, false en caso contrario
   */
  public boolean vender(int cantidad) {
    if (this.cantidad - cantidad < 0) return false;
    else {
      this.cantidad -= cantidad;
      return true;
    }
  }

  /**
   * Metodo repone la cantidad de producto de este tipo
   * @return cantidad de producto repuesta
   */
  public int reponer() {
    int dif = this.stockMaximo - this.cantidad;
    this.cantidad = this.stockMaximo;
    return dif;
  }
}
