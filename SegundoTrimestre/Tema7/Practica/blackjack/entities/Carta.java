package SegundoTrimestre.Tema7.Practica.blackjack.entities;

public class Carta {

  // Props
  private int palo;
  private String figura;

  // Constructors
  public Carta(int palo, String figura) {
    this.palo = palo;
    this.figura = figura;
  }

  public Carta(Carta carta) {
    this.palo = carta.palo;
    this.figura = carta.figura;
  }

  // Getters and Setters
  public int getPalo() {
    return palo;
  }

  public void setPalo(int palo) {
    this.palo = palo;
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
    final StringBuffer sb = new StringBuffer(this.palo);
    sb.append(this.figura);
    return sb.toString();
  }

  /**
   * Metodo para conseguir el nombre corto de la carta
   * @return nombre corto de la carta
   */
  public String getNombreCortoCarta () {
    return this.palo + this.figura;
  }
}
