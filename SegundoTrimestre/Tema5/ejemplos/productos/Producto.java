package SegundoTrimestre.Tema5.ejemplos.productos;

import java.util.Objects;

public class Producto {
  private double precio;
  private String nombre;

  // Constructor
  public Producto(double precio, String nombre) {
    this.precio = precio;
    this.nombre = nombre;
  }
  public Producto (Producto producto) {
    this.precio = producto.getPrecio();
    this.nombre = producto.getNombre();
  }

  // Getters y Setters
  public double getPrecio() {
    return precio;
  }
  public void setPrecio(double precio) {
    this.precio = precio;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  // Methods

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Producto{");
    sb.append("precio=").append(precio);
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Producto producto = (Producto) o;
    return Objects.equals(nombre, producto.nombre);
  }
}
