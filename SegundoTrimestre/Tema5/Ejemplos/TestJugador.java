package SegundoTrimestre.Tema5.Ejemplos;

public class TestJugador {
  public static void main(String[] args) {
    Jugador j1 = new Jugador();
    System.out.println(j1);
    Jugador j2 = j1;
    if (j2.equals(j1)) {
      System.out.println("asd");
    }
  }
}
