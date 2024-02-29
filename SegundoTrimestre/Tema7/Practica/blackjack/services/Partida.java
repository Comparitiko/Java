package SegundoTrimestre.Tema7.Practica.blackjack.services;

import SegundoTrimestre.Tema7.Practica.blackjack.entities.Crupier;
import SegundoTrimestre.Tema7.Practica.blackjack.entities.Jugador;
import SegundoTrimestre.Tema7.Practica.blackjack.entities.JugadorBlack;

public class Partida {
  // Props
  private JugadorBlack jugador;
  private Crupier crupier;
  private BarajaInglesa baraja;

  // Constructor
  public Partida(String nombreJugador) {
    this.jugador = new JugadorBlack(nombreJugador);
    this.crupier = new Crupier();
    this.baraja = new BarajaInglesa();
  }

  // Getters and Setters

  public JugadorBlack getJugador() {
    return jugador;
  }

  public Crupier getCrupier() {
    return crupier;
  }

  public BarajaInglesa getBaraja() {
    return baraja;
  }

  // Methods

  /**
   * Asignar carta a un jugador
   * @param j jugadorBlack o crupier
   */
  public void asignarCarta (Jugador j) {
    j.nuevaCarta(baraja.azar());
  }

  public void iniciarPartida () {
    baraja.barajar();
    jugador.getMano().clear();
    crupier.getMano().clear();
    jugador.nuevaCarta(baraja.repartirCarta());
    crupier.nuevaCarta(baraja.repartirCarta());
    jugador.nuevaCarta(baraja.repartirCarta());
    crupier.nuevaCarta(baraja.repartirCarta());
  }

  /**
   * Metodo para comprobar si se ha pasado de 21 el jugador
   * @param j jugadorBlack o crupier
   * @return true si se ha pasado de 21 y false si no
   */
  public boolean haPerdido (Jugador j) {
    return j.valorMano() > 21;
  }
}
