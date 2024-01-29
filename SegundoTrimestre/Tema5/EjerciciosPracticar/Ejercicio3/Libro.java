package SegundoTrimestre.Tema5.EjerciciosPracticar.Ejercicio3;

import java.util.Objects;

public class Libro {
  private int ISBN;
  private String titulo;
  private String autor;
  private int numPaginas;
  private double precioCompra;
  private double precioVenta;
  private boolean vendido;

  // Constructors
  public Libro(int ISBN, String titulo, String autor, int numPaginas) {
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.autor = autor;
    this.numPaginas = numPaginas;
    this.vendido = false;
  }

  // Getters y Setters

  public int getISBN() {
    return ISBN;
  }

  public void setISBN(int ISBN) {
    this.ISBN = ISBN;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getNumPaginas() {
    return numPaginas;
  }

  public void setNumPaginas(int numPaginas) {
    this.numPaginas = numPaginas;
  }

  public double getPrecioCompra() {
    return precioCompra;
  }

  public void setPrecioCompra(double precioCompra) {
    this.precioCompra = precioCompra;
  }

  public double getPrecioVenta() {
    return precioVenta;
  }

  public void setPrecioVenta(double precioVenta) {
    this.precioVenta = precioVenta;
  }

  public boolean isVendido() {
    return vendido;
  }

  public void setVendido(boolean vendido) {
    this.vendido = vendido;
  }

  // Methods

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("El libro");
    sb.append(titulo).append(" con ISBN ").append(ISBN);
    sb.append(" creado por el autor ").append(autor);
    sb.append(" tiene ").append(numPaginas).append(" páginas");
  return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Libro libro = (Libro) o;
    return ISBN == libro.ISBN;
  }
}
