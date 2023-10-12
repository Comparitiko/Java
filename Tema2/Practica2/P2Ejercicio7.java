/*
  7. Función que calcule el factorial de un número entero positivo pasado como parámetro
*/

import java.util.Scanner;

public class P2Ejercicio7 {
  
  public static void factorial (int num) {
    long factorial = 1;

    // Bucle para calcular el factorial
    for (int i = 1; i <= num; i++) {
      factorial = factorial * i;
    }

    System.out.println("El factorial de " + num + " es " + factorial);
  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir numero y pasarlo a la funcion
    System.out.println("Ingrese el numero al que quiere calcular su factorial:");
    factorial(sc.nextInt());

    sc.close();

  }

}
