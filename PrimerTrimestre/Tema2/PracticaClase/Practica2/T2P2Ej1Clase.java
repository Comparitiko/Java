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
  
  // Convertir los digitos en palotes y si es 0 poner un guion solo
  public static void convierteEnPalotes (int n) {

    for (int i = 0; i != n; i++) {

      System.out.print("| ");

    }
    
  }
  
  // Sacar digitos del String pasado por consola y ir pasandolo a la funcion de convertir en palotes
  public static void sacarDigito (String stringNum) {

    String[] arrayString = stringNum.split("");

    for (int i = 0; i != arrayString.length; i++) {

      convierteEnPalotes(Integer.parseInt(arrayString[i]));

      if (Integer.parseInt(arrayString[i]) == 0 || i != arrayString.length - 1) System.out.print("- ");

    }
    

  }

  public static void main(String[] args) {

    // try-catch para pedir el numero a convertir
    try {

      System.out.println("Ingrese el numero que quiere convertir en palotes:");
      sacarDigito(System.console().readLine());
      
      
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }

  }

  
}