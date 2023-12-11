/*
  Ejercicio 4
  Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base y el
  exponente. Pueden ocurrir tres cosas: 
    El exponente sea positivo, sólo tienes que imprimir la potencia.
    El exponente sea 0, el resultado es 1.
    El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
*/

import java.util.Scanner;

public class T1Ejercicio17 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    double res;

    // Pedir datos por terminal
    System.out.println("Ingrese la base:");
    int base = sc.nextInt();

    System.out.println("Ingrese el exponente:");
    int exponente = sc.nextInt();

    if (exponente < 0) {
      res = 1/ Math.pow(base, (-exponente));
    } else if (exponente == 0) {
      res = 1;
    } else {
      res = Math.pow(base, exponente);
    }

    // Imprimir datos por terminal
    System.out.println("El resultado de lo insertado es: " + res);

    sc.close();

  }

}