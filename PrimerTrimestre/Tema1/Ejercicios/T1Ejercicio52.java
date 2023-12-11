/*
  Ejercicio 4
  Crea una función que calcule la sucesión de Fibonacci pidiendo como parámetro cuántos
  números de la sucesión quieres mostrar
*/

import java.util.Scanner;

public class T1Ejercicio52 {
  
  public static void sucesionFibonacci (int rep) {

    long[] fibonacci = new long[rep];

    for (int i = 0; i != rep; i++) {

      if (i < 2) {
        fibonacci[i] = 1;
      } else {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
      }
      
      System.out.println("El numero " + (i + 1) + " de la sucesion de Fibonacci es: " + (fibonacci[i]));
      
    }
  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de numeros quieres que saque de la sucesion de fibonacci");
    sucesionFibonacci(sc.nextInt());

    sc.close();

  }

}
