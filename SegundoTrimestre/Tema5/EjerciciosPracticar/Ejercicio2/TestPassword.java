package SegundoTrimestre.Tema5.EjerciciosPracticar.Ejercicio2;

public class TestPassword {
  public static void main(String[] args) {
    Password p1 = new Password();
    Password p2 = new Password(10);

    System.out.println("La contraseña 1: " + p1);
    System.out.println("La contraseña 2: " + p2);

    if (p1.esFuerte()) {
      System.out.println("La contraseña 1 es fuerte");
    } else {
      System.out.println("La contraseña 1 no es fuerte");
    }

    if (p2.esFuerte()) {
      System.out.println("La contraseña 2 es fuerte");
    } else {
      System.out.println("La contraseña 2 no es fuerte");
    }
  }
}
