package SegundoTrimestre.Tema5.Practica.BladeOfDarkness.Clases;

import java.util.ArrayList;

public class Partida {
  private Jugador jugador;
  private ArrayList<Monstruo> monstruos;

  // Constructor
  public Partida(Jugador jugador) {
    this.jugador = jugador;
    this.monstruos = new ArrayList<Monstruo>(10);
    this.iniciarPartida();
    this.monstruos.add(new MonstruoFinalNivel("Hola mundo", Monstruo.claseMonstruo.TROLL, 30, 200));
    this.monstruos.add(new MonstruoFinalNivel("Programación", Monstruo.claseMonstruo.DEMONIO, 15, 250));
  }

  /**
   * Metodo que inicializa la partida
   */
  private void iniciarPartida() {
    for (int i = 0; i < 100; i++) {
      this.monstruos.add(new Monstruo("Montruo " + i, Monstruo.claseMonstruo.GOBLIN, 10));
    }
  }

  /**
   * Metodo que busca un posible monstruo y hace que el jugador lo golpee
   * @return
   */
  public boolean turnoJugador () {
    for (Monstruo monstruo: this.monstruos) {
      if (monstruo.getSalud() > 0) {
        this.jugador.golpear(monstruo);
        return false;
      }
    }
    return true;
  }

  /**
   * Metodo que busca un posible monstruo enemigo y si el jugador tiene vida lo golpea
   * @return true si el jugador no tiene vida, false en caso contrario
   */
  public boolean turnoEnemigos () {
    for (Monstruo monstruo: this.monstruos) {
      if (monstruo.getSalud() > 0) {
        monstruo.golpear(this.jugador);
        return jugador.getSalud() < 0;
      }
    }
    return false;
  }

  /**
   * Metodo para saber cuantos monstruos que quedan vivos en la partida
   * @return numero de monstruos que quedan vivos en la partida
   */
  public int numeroDeMonstruos () {
    int numMonstruosDerrotados = 0;
    for (Monstruo monstruo: this.monstruos) {
      if (monstruo.getSalud() == 0) numMonstruosDerrotados++;
    }
    return this.monstruos.size() - numMonstruosDerrotados;
  }
}
