/*
  Ejercicio 1
  Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no. 
*/

import java.util.Scanner;

class T1Ejercicio14 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Pedir numeros
    System.out.println("Ingrese el primer valor a comparar:");
    int num1 = sc.nextInt();

    System.out.println("Ingrese el segundo valor a comparar:");
    int num2 = sc.nextInt();

    // Comparar numeros
    if (num1 > num2) {
      System.out.println("El valor " + num1 + " es mayor que " + num2);
    } else if (num2 == num1) {
      System.out.println("El valor " + num1 + " es igual que " + num2);
    } else {
      System.out.println("El valor " + num1 + " es menor que " + num2);
    }

    sc.close();

  }

}