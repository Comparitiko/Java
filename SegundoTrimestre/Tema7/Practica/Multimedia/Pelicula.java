package SegundoTrimestre.Tema7.Practica.Multimedia;

public class Pelicula extends Multimedia{

  // Props
  private int duracion;

  // Constructors
  public Pelicula(String titulo, double precio, boolean esPlus, int duracion) {
    super(titulo, precio, esPlus);
    this.duracion = duracion;
  }

  // Getters and Setters
  public int getDuracion() {
    return duracion;
  }

  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }

  // Methods

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Pelicula{");
    sb.append("duracion=").append(duracion);
    sb.append(", codigo=").append(codigo);
    sb.append(", titulo='").append(titulo).append('\'');
    sb.append(", plus=").append(plus);
    sb.append(", precio=").append(precio);
    sb.append(", genero=").append(genero);
    sb.append('}');
    return sb.toString();
  }
}
