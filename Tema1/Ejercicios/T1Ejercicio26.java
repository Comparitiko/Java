/*
  Ejercicio 3
  Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso
  contrario, el programa termina cuando se introduce un espacio.
*/

import java.util.Scanner;

public class T1Ejercicio26 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    char caracter = 'a';
    String esVocal;

    while (caracter != ' ') {
      System.out.println("Ingrese un caracter");
      String entrada = sc.nextLine();

      caracter = (char) entrada.charAt(0);

      switch (caracter) {
        case 'a':
          esVocal = "VOCAL";
          break;
        case 'e':
          esVocal = "VOCAL";
          break;
        case 'i':
          esVocal = "VOCAL";
          break;
        case 'o':
          esVocal = "VOCAL";
          break;
        case 'u':
          esVocal = "VOCAL";
          break;
        default:
          esVocal = "NO VOCAL";
          break;
      }

      if (caracter != ' ') System.out.println("El caracter " + caracter + " es: " + esVocal);

    }

    sc.close();

  }

}