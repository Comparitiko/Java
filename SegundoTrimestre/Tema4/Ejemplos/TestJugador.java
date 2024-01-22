package SegundoTrimestre.Tema4.Ejemplos;

public class TestJugador {
  public static void main(String[] args) {
    Jugador j1 = new Jugador();
    System.out.println(j1);
    Jugador j2 = j1;
    if (j2.equals(j1)) {
      System.out.println("asd");
    }
    try {
      Jugador j3 = (Jugador) j1.clone();
    } catch (CloneNotSupportedException e) {
      System.out.println(e.getMessage());
    }

  }
}
