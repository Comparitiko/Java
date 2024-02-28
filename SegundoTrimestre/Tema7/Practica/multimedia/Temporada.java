package SegundoTrimestre.Tema7.Practica.multimedia;

import java.util.ArrayList;
import java.util.Objects;

public class Temporada {

  // Props
  private int numero;
  private Serie serie;
  private ArrayList<Episodio> episodios;

  // Constructors
  public Temporada() {
    this.episodios = new ArrayList<>();
  }

  public Temporada(int numero) {
    this.numero = numero;
    this.episodios = new ArrayList<>();
  }

  // Getters and Setters
  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public Serie getSerie() {
    return serie;
  }

  public void setSerie(Serie serie) {
    this.serie = serie;
  }

  public ArrayList<Episodio> getEpisodios() {
    return episodios;
  }

  public void setEpisodios(ArrayList<Episodio> episodios) {
    this.episodios = episodios;
  }

  /**
   * Metodo para ver el numero de episodios de una temporada
   * @return numero de episodios
   */
  public int getNumeroEpisodios() {
    return this.episodios.size();
  }

  // Methods


  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Temporada{");
    sb.append("numero=").append(numero);
    sb.append(", serie=").append(serie.getTitulo());
    sb.append(", episodios=").append(episodios);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Temporada temporada = (Temporada) o;
    return numero == temporada.numero && Objects.equals(serie, temporada.serie);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numero, serie);
  }

  /**
   * Metodo para añadir un episodio
   * @param episodio añadir
   */
  public void addEpisodio(Episodio episodio) {
    episodio.setTemporada(this);
    episodios.add(episodio);
  }

  /**
   * Metodo para eliminar episodio
   * @param episodio eliminar
   */
  public void delEpisodio (Episodio episodio) {
    episodios.remove(episodio);
  }
}
