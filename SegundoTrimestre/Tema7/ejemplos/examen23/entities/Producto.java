package SegundoTrimestre.Tema7.ejemplos.examen23.entities;

import java.util.Objects;

public abstract class Producto implements Descontable{
  // Props
  protected static int codigos = 1;
  protected int codigo;
  protected String nombre;
  protected String descripcion;
  protected double precio;
  protected int unidadesStock;

  // Constructor
  public Producto(String nombre, String descripcion, double precio, int unidadesStock) {
    this.codigo = codigos++;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
    this.unidadesStock = unidadesStock;
  }

  public Producto (Producto producto)  {
    this.codigo = codigos++;
    this.nombre = producto.getNombre();
    this.descripcion = producto.getDescripcion();
    this.precio = producto.getPrecio();
    this.unidadesStock = producto.getUnidadesStock();
  }

  // Getters and Setters
  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getUnidadesStock() {
    return unidadesStock;
  }

  public void setUnidadesStock(int unidadesStock) {
    this.unidadesStock = unidadesStock;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Producto{");
    sb.append("codigo='").append(codigo).append('\'');
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append(", descripcion='").append(descripcion).append('\'');
    sb.append(", precio=").append(precio);
    sb.append(", unidadesStock=").append(unidadesStock);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    Producto producto = (Producto) o;
    return Objects.equals(codigo, producto.codigo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo);
  }

  @Override
  public abstract double descuento();
}
