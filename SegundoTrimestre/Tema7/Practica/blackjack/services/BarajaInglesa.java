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
    return (int) Math.ceil(Math.random() * length);
  }

  @Override
  public Carta repartirCarta() {
    return null;
  }

  @Override
  public Carta azar() {
    return null;
  }

}
