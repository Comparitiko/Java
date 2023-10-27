/*
  Crea una función con la siguiente cabecera:
  public static void convierteEnPalotes(int n) {...}
  Esta función recibe un parámetro de entrada de tipo entero e imprime por pantalla una
  cadena de caracteres con la conversión del número n al sistema de palotes.
  Por ejemplo:
  El número 470213 (en decimal) se convierte en:
  | | | | - | | | | | | | - - | | - | - | | |
  en el sistema de palotes.
  Fíjate en la representación del número 0 y realiza diferentes pruebas con el 0 situado en
  la primera posición, en una posición intermedia y en la posición final del número.
  El número 2130 (en decimal) se convierte en:
  | | - | - | | | - -
  en el sistema de palotes.
  Utiliza esta función en un programa para comprobar que funciona correctamente.
*/

public class T2P2Ej1Clase {
  
  public static void convierteEnPalotes (int n) {

    while (n % 10 == 0) {

      System.out.print("- ");
      n /= 10;

    }

    while (n != 0) {

      for (int i = 0; i != n % 10; i++) {

        System.out.print("| ");

      }

      System.out.print("- ");
      n /= 10;
    }
    
  }

  public static void main(String[] args) {

    // try-catch para pedir el numero a convertir
    try {

      System.out.println("Ingrese el numero que quiere convertir en palotes:");
      convierteEnPalotes(Integer.parseInt(System.console().readLine()));
      
    } catch (Exception e) {
      System.out.println("Error: " + e);
    }

  }

  
}