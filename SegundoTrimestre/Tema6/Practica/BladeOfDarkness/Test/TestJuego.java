package SegundoTrimestre.Tema6.Practica.BladeOfDarkness.Test;

import SegundoTrimestre.Tema6.Practica.BladeOfDarkness.Clases.Arma;
import SegundoTrimestre.Tema6.Practica.BladeOfDarkness.Clases.Jugador;
import SegundoTrimestre.Tema6.Practica.BladeOfDarkness.Clases.Partida;

public class TestJuego {
  public static void main(String[] args) {
    Jugador j1 = new Jugador("Gabriel", Jugador.claseJugador.MAGO);
    j1.equipar(new Arma("Vara de las edades", Arma.tipoArma.BASTON, 99, true));
    Partida partida = new Partida(j1);
    System.out.println("El jugador se ha tomado una pocion de 10000 de vida");
    j1.tomarPocion(10000);
    System.out.println("En la partida hay " + partida.numeroDeMonstruos() + " monstruos");
    for (int i = 0; i < 30; i++) {
      System.out.println("Turno " + (i + 1));
      if (partida.turnoJugador()) System.out.println("El jugador ha ganado");
      if (partida.turnoEnemigos()) System.out.println("El jugador ha perdido");
    }
    System.out.println("Después de 30 turnos el jugador ha dejado vivos a " + partida.numeroDeMonstruos() + " monstruos");
  }
}
