/*
  Ejercicio 4
  Escribir un programa que imprima todos los números pares entre dos números que se le
  pidan al usuario.
*/

import java.util.Scanner;

public class T1Ejercicio27 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el primer numero:");
    int num1 = sc.nextInt();

    System.out.println("Ingrese el segundo numero:");
    int num2 = sc.nextInt();

    if (num1 > num2) {
      System.out.println("Cambio de variables");
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }

    while (num1 != num2) {

      if (num1  % 2 == 0) {
        System.out.println("El numero " + num1 + " es par");
      }

      num1 ++;

    }

    sc.close();

  }

}