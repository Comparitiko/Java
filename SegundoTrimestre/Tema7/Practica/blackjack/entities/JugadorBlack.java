package SegundoTrimestre.Tema7.Practica.blackjack.entities;

public class JugadorBlack extends Jugador{
  // Constructor
  public JugadorBlack (String nick) {
    super(nick);
  }

  // Methods
  @Override
  public void plantarse() {
    this.estaPlantado = true;
  }

}
