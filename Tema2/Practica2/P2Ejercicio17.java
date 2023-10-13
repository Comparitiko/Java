/*
  17. Programa que lea un entero positivo introducido por el usuario y que muestre por pantalla todos sus
  divisores. 
*/

import java.util.Scanner;

public class P2Ejercicio17 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir valor
    System.out.println("Ingrese un numero entero positivo");
    int num = sc.nextInt();

    // Bucle que imprima por pantalla los divisores
    System.out.println("Los divisores del numero " + num + " son:");
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) System.out.println(i);
    }

    sc.close();

  }

}