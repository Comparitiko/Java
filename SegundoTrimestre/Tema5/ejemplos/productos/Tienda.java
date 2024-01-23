package SegundoTrimestre.Tema5.ejemplos.productos;
import java.util.ArrayList;

import java.util.Objects;

public class Tienda {
  private ArrayList<Producto> productos;
  private String nombre;

  // Constructor
  public Tienda(String nombre) {
    this.productos = new ArrayList<>();
    this.nombre = nombre;
  }

  // Getters y Setters

  public ArrayList<Producto> getProductos() {
    return productos;
  }

  public void setProductos(ArrayList<Producto> productos) {
    this.productos = productos;
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
    final StringBuffer sb = new StringBuffer("Tienda{");
    sb.append("productos=").append(productos);
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Tienda tienda = (Tienda) o;
    return Objects.equals(nombre, tienda.nombre);
  }

  public void addProducto(Producto producto) {
    this.productos.add(producto);
  }
}
