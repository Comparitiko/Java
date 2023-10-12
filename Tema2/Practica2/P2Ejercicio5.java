/*
  5. Programa que pida al usuario un número repetidamente hasta que esté entre 1 y 10.
*/

import java.util.Scanner;

public class P2Ejercicio5 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    int num;

    // Bucle para que se inserte un numero del 1 al 10
    do {
      System.out.println("Ingrese un numero del 1 al 10");
      num = sc.nextInt();
    } while (num < 1 || num > 10);

    sc.close();

  }

}