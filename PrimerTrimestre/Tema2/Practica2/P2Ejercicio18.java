/*
  18. Diseña un método que indique si un número entero pasado como parámetro es o no un número primo
  (devuelve un boolean). Un número primo es aquel que tiene por divisores el 1 y el propio número,
  únicamente.
*/

import java.util.Scanner;

public class P2Ejercicio18 {

  // Funcion que diga si es primo
  public static boolean esPrimo (int num) {
    int divisores = 0;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) divisores++;
    }
    if (divisores == 2 || divisores == 1) return true;
    else return false;
  }
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir valores pasarlo a la funcion e imprimir resultado
    System.out.println("Ingrese un numero entero positivo y te dire true si es primo y false si no es primo:");
    System.out.println(esPrimo(sc.nextInt()));

    sc.close();

  }

}