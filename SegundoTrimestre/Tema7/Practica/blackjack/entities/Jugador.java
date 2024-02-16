package SegundoTrimestre.Tema7.Practica.blackjack.entities;

import java.util.ArrayList;

public class Jugador {
  // Props
  private ArrayList<Carta> mano;

  // Constructor
  public Jugador () {
    this.mano = new ArrayList<Carta>(4);
  }

  // Getter
  public ArrayList<Carta> getMano() {
    return mano;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Jugador{");
    sb.append("mano=").append(mano);
    sb.append('}');
    return sb.toString();
  }

  /**
   * Añadir carta a la mano
   * @param carta carta a añadir
   */
  public void nuevaCarta (Carta carta) {
    this.mano.add(carta);
  }

  public int valorMano () {
    int valor = 0;
    for (Carta carta : this.mano) {
      valor += carta.getPalo();
    }
    return valor;
  }
}
