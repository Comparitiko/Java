/*
  Ejercicio 7
  Escribe un programa que dada una cadena de texto (hola45mundo44) muestre el resultado
  de sumar todas las cifras numéricas independientes que aparezcan en la cadena.
*/

import java.util.Scanner;

public class T1Ejercicio41 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    int res = 0;
    String[] numeros = "0123456789".split("");

    // Pedir valores por terminal
    System.out.println("Ingrese una cadena:");
    String[] carCad = sc.nextLine().split("");

    // Bucle para sacar las cifras numericas
    for (int iCarCad = 0; iCarCad != carCad.length; iCarCad++) {

      for (int iNum = 0; iNum != numeros.length; iNum++) {

        if (numeros[iNum].equals(carCad[iCarCad])) {
          res = res + (Integer.parseInt(carCad[iCarCad]));
        }
      }

    }

    // Imprimir por terminal el resultado
    System.out.println("La suma de las cifras numericas es: " + res);

    sc.close();

  }

}