package SegundoTrimestre.Tema7.Practica.blackjack.main;

import SegundoTrimestre.Tema7.Practica.blackjack.entities.Crupier;
import SegundoTrimestre.Tema7.Practica.blackjack.entities.JugadorBlack;
import SegundoTrimestre.Tema7.Practica.blackjack.services.Partida;

import java.util.Scanner;

public class Main {

  public static void menuInicial () {
    System.out.println("Bienvenido a Blackjack");
    System.out.println("¿Que deseas hacer?");
    System.out.println("1. Iniciar Partida");
    System.out.println("2. Cerrar juego");
  }

  public static void menu() {
    System.out.println("¿Que deseas hacer?");
    System.out.println("1. Pedir carta");
    System.out.println("2. Plantarte");
  }

  public static void pedirCartaCrupier (Partida p) {
    while (!p.haPerdido(p.getCrupier()) || !p.getCrupier().isEstaPlantado()) {
      p.getCrupier().nuevaCarta(p.getBaraja().repartirCarta());
      p.getCrupier().plantarse();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Partida p1 = new Partida("Gabriel");

    boolean primerTurno = true;
    int opcionMenuInicial = 0;
    int opcionMenu = 0;

    // Mientras la opcion menu inicial no sea 2  se seguira jugando
    while (opcionMenuInicial != 2) {
      menuInicial();
      opcionMenuInicial = Integer.parseInt(sc.nextLine());
      if (opcionMenuInicial == 1) {
        // Mientras que la opcion menu no sea 2 o el jugador no se pase de 21
        // se pedira el menu hasta que el jugador no se plante
        p1.iniciarPartida();
        while (opcionMenu != 2 || p1.getJugador().valorMano() < 21) {
          System.out.println("Crupier");
          System.out.println(p1.getCrupier().mostrarPrimeraCarta());
          System.out.println("Jugador");
          System.out.println(p1.getJugador());
          menu();
          opcionMenu = Integer.parseInt(sc.nextLine());
          if (p1.getJugador().valorMano() == 21) {
            break;
          }
          else if (opcionMenu == 2) {
            p1.getJugador().plantarse();
            break;
          }
          if (opcionMenu == 1) p1.getJugador().nuevaCarta(p1.getBaraja().repartirCarta());
        }
        if (p1.getJugador().valorMano() == 21) {
          System.out.println("El jugador ha ganado la partida");
          break;
        }
        if (p1.haPerdido(p1.getJugador())) System.out.println("El jugador ha perdido");
      }
      pedirCartaCrupier(p1);
    }
  }
}
