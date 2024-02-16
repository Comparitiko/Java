package SegundoTrimestre.Tema7.Practica.blackjack.services;

import SegundoTrimestre.Tema7.Practica.blackjack.entities.Carta;

public class BarajaInglesa extends Baraja {
  // Constructors
  public BarajaInglesa() {
    super();
  }

  // Methods
  /**
   * Mostrar los posibles valores de baraja inglesa
   * @return Array con los posibles valores de baraja inglesa
   */
  public static ValorBarajaInglesa[] valores () {
    return ValorBarajaInglesa.values();
  }

  /**
   * Mostrar los posibles palos de baraja inglesa
   * @return Array con los posibles palos de baraja inglesa
   */
  public static PaloBarajaInglesa[] palos () {
    return PaloBarajaInglesa.values();
  }

  /**
   * Generar un numero aleatorio entre 0 y valor pasado por parametro
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
