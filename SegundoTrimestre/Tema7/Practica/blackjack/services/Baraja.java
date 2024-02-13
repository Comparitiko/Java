package SegundoTrimestre.Tema7.Practica.blackjack.services;

import SegundoTrimestre.Tema7.Practica.blackjack.entities.Carta;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Baraja {
  // Props
  private ArrayList<Carta> baraja;

  // Constructors
  public Baraja() {
    this.baraja = new ArrayList<>(13 * 4);
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Baraja{");
    sb.append("baraja=").append(baraja);
    sb.append('}');
    return sb.toString();
  }

  /**
   * Metodo para repartir la primera carta de la baraja y borrarla
   * @return Carta
   */
  public abstract Carta repartirCarta();

  /**
   * Metodo para sacar una carta aleatoria de la baraja y borrarla
   * @return Carta
   */
  public abstract Carta azar();

  /**
   * Barajar las cartas del ArrayList
   */
  public void  barajar() {
    Collections.shuffle(this.baraja);
  }
}
