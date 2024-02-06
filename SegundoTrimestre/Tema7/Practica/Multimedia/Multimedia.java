package SegundoTrimestre.Tema7.Practica.Multimedia;

import java.util.Objects;

public class Multimedia {

  // Props
  protected static long autoIncremento = 1;
  protected long codigo;
  protected String titulo;
  protected boolean plus;
  protected double precio;
  protected Genero.GeneroPelicula genero;

  // Constructors
  public Multimedia () {
    this.codigo = autoIncremento;
    this.titulo = "Titulo " + autoIncremento;
    this.plus = false;
    this.precio = 10;
    autoIncremento++;
  }

  public Multimedia (String titulo, double precio, boolean esPlus) {
    this.codigo = autoIncremento;
    this.titulo = titulo;
    this.plus = esPlus;
    this.precio = precio;
    autoIncremento++;
  }

  // Getters and Setters
  public long getCodigo() {
    return codigo;
  }

  public void setCodigo(long codigo) {
    this.codigo = codigo;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public boolean isPlus() {
    return plus;
  }

  public void setPlus(boolean plus) {
    this.plus = plus;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public Genero.GeneroPelicula getGenero() {
    return genero;
  }

  public void setGenero(Genero.GeneroPelicula genero) {
    this.genero = genero;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Multimedia{");
    sb.append("codigo=").append(codigo);
    sb.append(", titulo='").append(titulo).append('\'');
    sb.append(", plus=").append(plus);
    sb.append(", precio=").append(precio);
    sb.append(", genero=").append(genero);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Multimedia that = (Multimedia) o;
    return codigo == that.codigo;
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo);
  }
}
