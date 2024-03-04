package SegundoTrimestre.Tema7.Practica.blackjack.services;

import SegundoTrimestre.Tema7.Practica.blackjack.entities.Carta;

import java.util.ArrayList;

public class BarajaInglesa extends Baraja {

  public static final int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
  public static String[] palos = {"Treboles", "Diamantes", "Corazones", "Picas"};

  // Constructors
  public BarajaInglesa() {
    super();
    this.baraja = new ArrayList<>();
    for (int valor : valores) {
      for (String palo : palos) {
        this.baraja.add(new Carta(valor, palo));
      }
    }
  }

  // Methods
  /**
   * Mostrar los posibles valores de baraja inglesa
   * @return Array con los posibles valores de baraja inglesa
   */
  public static int[] valores () {
    return valores;
  }

  /**
   * Mostrar los posibles palos de baraja inglesa
   * @return Array con los posibles palos de baraja inglesa
   */
  public static String[] palos () {
    return palos;
  }

  /**
   * Generar un número aleatorio entre 0 y valor pasado por parametro
   * @param length int
   * @return Numero random
   */
  private int randomNumber (int length) {
    return (int) Math.ceil(Math.random() * length) - 1;
  }

  /**
   * Repartir la primera carta de la baraja y eliminarla
   * @return una carta
   */
  @Override
  public Carta repartirCarta() {
    Carta carta = this.baraja.getFirst();
    this.baraja.removeFirst();

    return carta;
  }

  /**
   * Repartir una carta aleatoria y eliminarla
   * @return una carta
   */
  @Override
  public Carta azar() {
    Carta carta = this.baraja.get(randomNumber(this.baraja.size()));
    this.baraja.remove(carta);
    return carta;
  }

}
