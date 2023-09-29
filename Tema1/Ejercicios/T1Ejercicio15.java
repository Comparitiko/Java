/*
  Ejercicio 2
  Escribe un programa que lea un número e indique si es par o impar.
*/

import java.util.Scanner;

class T1Ejercicio15 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir valores
    System.out.println("Ingrese el numero que quieres saber si es par o impar:");
    int num1 = sc.nextInt();

    if (num1 % 2 == 0) {
      System.out.println("El numero " + num1 + " es un numero par");
    } else {
      System.out.println("El numero " + num1 + " es un numero impar");
    }

    sc.close();

  }

}