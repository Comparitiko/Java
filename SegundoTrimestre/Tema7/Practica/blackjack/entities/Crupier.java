package SegundoTrimestre.Tema7.Practica.blackjack.entities;

public class Crupier extends Jugador{
  // Props
  private String nombre;
  private int limite;

  // Constructor
  public Crupier () {
    super();
    this.nombre = "Crupier";
    this.limite = 17;
  }
}
