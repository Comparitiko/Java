package SegundoTrimestre.Tema7.Practica.Multimedia;

public class Multimedia {

  // Props
  protected static long numMultimedia = 0;
  protected long codigo;
  protected String titulo;
  protected boolean plus;
  protected double precio;
  protected Genero.GeneroPelicula genero;

  // Constructors
  public Multimedia () {
    this.codigo = numMultimedia++;
    this.titulo = "Titulo " + numMultimedia;
    this.plus = false;
    this.precio = 10;
  }

  public Multimedia ()
}
