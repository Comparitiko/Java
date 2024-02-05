package SegundoTrimestre.Tema6.ejemplos.lingo;
import java.util.Scanner;

public class TestLingo {
  public static void main(String[] args) {
    Lingo l1 = new Lingo();
    System.out.println(l1.getPalabraAcertar());
    int numFallos = 0;

    while (true) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduce la palabra");
      String palabra = sc.nextLine();
      if (l1.comprobar(palabra) == 5) {
        System.out.println("La palabra es correcta");
        break;
      } else if (numFallos == 5) {
        System.out.println("Has fallado 5 veces");
        break;
      } else {
        System.out.println("La palabra es incorrecta");

      }
    }
  }
}
