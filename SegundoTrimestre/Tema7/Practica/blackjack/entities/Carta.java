package SegundoTrimestre.Tema7.Practica.blackjack.entities;

import java.util.Objects;

public class Carta {

  // Props
  private int valor;
  private String figura;

  // Constructors
  public Carta(int valor, String figura) {
    this.valor = valor;
    this.figura = figura;
  }

  public Carta(Carta carta) {
    this.valor = carta.valor;
    this.figura = carta.figura;
  }

  // Getters and Setters
  public int getValor() {
    return valor;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }

  public String getFigura() {
    return figura;
  }

  public void setFigura(String figura) {
    this.figura = figura;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer(this.valor);
    sb.append(this.figura);
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Carta carta = (Carta) o;
    return valor == carta.valor && Objects.equals(figura, carta.figura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valor, figura);
  }

  /**
   * Metodo para conseguir el nombre corto de la carta
   * @return nombre corto de la carta
   */
  public String getNombreCortoCarta () {
    return this.valor + this.figura;
  }
}
