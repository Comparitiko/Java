/*
  Ejercicio 8
  Escribe un programa que muestre la frecuencia de las vocales en un texto
*/

import java.util.Scanner;

public class T1Ejercicio42 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    String[] vocales = "aeiouAEIOU".split("");
    int res = 0;

    // Pedir valores por terminal
    System.out.println("Ingrese una cadena y te dire cuantas vocales tiene:");
    String[] carCad = sc.nextLine().split("");

    // Bucle para sacar el numero de vocales
    for (int iCarCad = 0; iCarCad != carCad.length; iCarCad++) {

      for (int iVocales = 0; iVocales != vocales.length; iVocales++) {

        if (vocales[iVocales].equals(carCad[iCarCad])) res ++;
      }

    }

    // Imprimir por terminal el resultado
    System.out.println("El numero de vocales es: " + res + " vocales");

    sc.close();

  }

}