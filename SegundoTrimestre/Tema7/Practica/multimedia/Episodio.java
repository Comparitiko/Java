package SegundoTrimestre.Tema7.Practica.multimedia;

public class Episodio {
  // Props
  private String titulo;
  private int duracion;
  private Temporada temporada;

  // Constructors
  public Episodio() {
    this.titulo = "";
    this.duracion = 0;
  }

  public Episodio(String titulo, int duracion) {
    this.titulo = titulo;
    this.duracion = duracion;
  }

  // Getters and Setters
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getDuracion() {
    return duracion;
  }

  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }

  public Temporada getTemporada() {
    return temporada;
  }

  public void setTemporada(Temporada temporada) {
    this.temporada = temporada;
  }

  // Methods

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Episodio{");
    sb.append("titulo='").append(titulo).append('\'');
    sb.append(", duracion=").append(duracion);
    sb.append(", temporada=").append(temporada);
    sb.append('}');
    return sb.toString();
  }
}
