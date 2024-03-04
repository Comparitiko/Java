package SegundoTrimestre.Tema7.Practica.blackjack.main;

import SegundoTrimestre.Tema7.Practica.blackjack.entities.Crupier;
import SegundoTrimestre.Tema7.Practica.blackjack.entities.JugadorBlack;
import SegundoTrimestre.Tema7.Practica.blackjack.services.Partida;

import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Main {

  static Scanner sc = new Scanner(System.in);

  /**
   * Imprimir menuInicial con iniciar partida o cerrar juego
   * @return opcion ingresada
   * @throws Exception si el valor es mayor que 2 o menor que 1
   */
  public static int menuInicial () throws Exception {
    System.out.println("Bienvenido a Blackjack");
    System.out.println("¿Que deseas hacer?");
    System.out.println("1. Iniciar Partida");
    System.out.println("2. Cerrar juego");
    int opcion = Integer.parseInt(sc.nextLine());
    if (opcion < 1 || opcion > 2) throw new Exception();
    return opcion;
  }

  /**
   * Imprimir menu para pedir carta o plantarte
   * @return opcion seleccionada
   * @throws Exception Si la opcion es menor que 1 o mayor que 2
   */
  public static int menu() throws Exception {
    System.out.println("¿Que deseas hacer?");
    System.out.println("1. Pedir carta");
    System.out.println("2. Plantarte");
    int opcion = Integer.parseInt(sc.nextLine());
    if (opcion < 1 || opcion > 2) throw new Exception();
    return opcion;
  }

  /**
   * Funcion para que juegue el crupier la partida hasta que se cumplan ciertas condiciones
   * @param p partida que se esta jugando
   */
  public static void pedirCartaCrupier (Partida p) {
    if (haGanadoCrupier(p)) return;
    p.getCrupier().plantarse();
    while (!p.haPerdido(p.getCrupier()) && !p.getCrupier().isEstaPlantado()) {
      p.asignarCarta(p.getCrupier());
      p.getCrupier().plantarse();
    }
  }

  /**
   * Comprobar si ha ganado el crupier
   * @param p partida que se juega
   * @return true si ha ganado, false si no
   */
  public static boolean haGanadoCrupier (Partida p) {
    if (p.haPerdido(p.getCrupier())) return false;
    else if (p.getCrupier().valorMano() > p.getJugador().valorMano()) return true;
    else if (p.getJugador().valorMano() > 21) return true;
    else return false;
  }

  /**
   * Comprobar si la partida se ha empatado
   * @param p partida que se ha jugado
   * @return true si se ha empatado, false si no
   */
  public static boolean partidaEmpatada (Partida p) {
    return p.getJugador().valorMano() == p.getCrupier().valorMano();
  }

  /**
   * Metodo para que el jugador juegue hasta que se plante o se pase de 21
   * @param p partida que se esta jugando
   */
  public static void pedirCartasJugador (Partida p) {
    boolean primerTurno = true;
    int opcionMenu = 0;

    while (opcionMenu != 2) {
      if (primerTurno) {
        p.iniciarPartida();
        primerTurno = false;
      }
      else {
        System.out.println(p.getCrupier().mostrarPrimeraCarta());
        System.out.println(STR." Cartas jugador: \{p.getJugador()}");
        try {
          opcionMenu = menu();
        } catch (Exception e) {
          System.out.println("Elija una opcion valida");
        }
        if (opcionMenu == 1) {
          p.asignarCarta(p.getJugador());
          if (p.haPerdido(p.getJugador())) return;
          else if (p.getJugador().valorMano() == 21) return;
        } else {
          p.getJugador().plantarse();
        }
      }
    }
  }

  public static void main(String[] args) {
    // ---- WARNING ---- En este ejercicio he usado template Strings, ha habido veces que
    // me ha dado error por el jdk
    System.out.println("Ingresa el nombre del jugador");
    String nombreJugador = sc.nextLine();
    Partida p1 = new Partida(nombreJugador);

    int opcionMenuInicial = 0;

    // Mientras la opcion menu inicial no sea 2  se seguira jugando
    while (opcionMenuInicial != 2) {
      try {
        opcionMenuInicial = menuInicial();
      } catch (Exception e) {
        System.out.println("Ingrese una opcion valida");
      }
      if (opcionMenuInicial == 1) {
        if (p1.getBaraja().getBaraja().isEmpty()) p1.generarNuevaBaraja();
        pedirCartasJugador(p1);
        if (p1.haPerdido(p1.getJugador())) {
          System.out.println(STR."El jugador ha perdido con un valor de cartas de \{p1.getJugador().valorMano()}");
        } else {
          pedirCartaCrupier(p1);
          if (p1.haPerdido(p1.getCrupier())) {
            System.out.println(STR."El crupier ha perdido con un valor de cartas de \{p1.getCrupier().valorMano()}");
          }
        }
        if (partidaEmpatada(p1)) System.out.println("Partida empatada");
        else if (haGanadoCrupier(p1)) System.out.println("El ganador de la partida ha sido el crupier");
        else System.out.println(STR."El ganador de la partida ha sido el jugador \{nombreJugador}");
        System.out.println("Con cartas:");
        System.out.println(STR."Crupier: \{p1.getCrupier()}");
        System.out.println(STR."Jugador: \{p1.getJugador()}");
      }
      else System.out.println("Gracias por jugar.");
    }
  }
}
