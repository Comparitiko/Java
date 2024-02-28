package SegundoTrimestre.Tema7.Practica.blackjack.entities;

public class Crupier extends Jugador{
  // Props
  private final int limite;

  // Constructor
  public Crupier () {
    super("Crupier");
    this.limite = 17;
  }

  // Getter
  public int getLimite() {
    return limite;
  }

  // Methods
  @Override
  public void plantarse() {
    if (this.valorMano() >= this.limite) this.estaPlantado = true;
  }

  /**
   * Mostrar primera carta solo
   * @return String con la primera carta
   */
  public String mostrarPrimeraCarta() {
    StringBuffer sb = new StringBuffer("Crupier primera carta: ");
    sb.append(this.mano.getFirst().getNombreCortoCarta());
    return sb.toString();
  }
}
