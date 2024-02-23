package SegundoTrimestre.Tema7.Practica.blackjack.main;

import SegundoTrimestre.Tema7.Practica.blackjack.entities.JugadorBlack;
import SegundoTrimestre.Tema7.Practica.blackjack.services.Partida;

public class Main {

  public static void menu() {
    System.out.println("¿Que deseas hacer?");
    System.out.println("1. Pedir carta");
    System.out.println("2. Plantarte");
  }

  public static void main(String[] args) {
    Partida p1 = new Partida(new JugadorBlack("Comparitiko"));
    int turnos = 0;

  }
}
