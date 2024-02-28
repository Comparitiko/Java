package SegundoTrimestre.Tema7.Practica.multimedia;

import java.util.ArrayList;

public class Serie extends Multimedia{
  // Props
  protected ArrayList<Temporada> temporadas;

  // Constructors
  public Serie(String titulo, double precio, boolean esPlus, Genero.GeneroPelicula genero) {
    super(titulo, precio, esPlus, genero);
    this.temporadas = new ArrayList<>();
  }

  // Getters and Setters
  public ArrayList<Temporada> getTemporadas() {
    return temporadas;
  }

  public void setTemporadas(ArrayList<Temporada> temporadas) {
    this.temporadas = temporadas;
  }

  // Methods

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Serie{");
    sb.append("temporadas=").append(temporadas);
    sb.append(", codigo=").append(codigo);
    sb.append(", titulo='").append(titulo).append('\'');
    sb.append(", plus=").append(plus);
    sb.append(", precio=").append(precio);
    sb.append(", genero=").append(genero);
    sb.append('}');
    return sb.toString();
  }

  /**
   * Metodo para ver la cantidad de temporadas de una serie
   * @return numero de temporadas de una serie
   */
  public int numeroTemporadas() {
    return this.temporadas.size();
  }

  /**
   * Metodo para añadir temporadas a una serie
   * @param temporada temporada a añadir
   */
  public void  addTemporada(Temporada temporada) {
    temporada.setSerie(this);
    temporadas.add(temporada);
  }

  /**
   * Metodo para elminar una temporada de la serie
   * @param temporada a eliminar
   */
  public void delTemporada (Temporada temporada) {
    temporadas.remove(temporada);
  }
}