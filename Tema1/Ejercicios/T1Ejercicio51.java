/*
  Ejercicio 3
  Crear una función recursiva que permita calcular el factorial de un número. Realiza un
  programa principal donde se lea un entero y se muestre el resultado del factorial.
*/

import java.util.Scanner;

public class T1Ejercicio51 {
  
  public static long factorial (long num) {
    long factorialNum = 1;

    // Bucle para calcular el factorial del numero introducido
    for (long i = 1; !(i > num); i++) {
      factorialNum = factorialNum * i;
    }
    
    return factorialNum;
  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir valor e ingresarlo en la funcion
    System.out.println("Ingrese el numero al que se le calcule el factorial:");
    long num = factorial(sc.nextInt());

    // Imprimir por pantalla el resultado
    if (num == 0) {
      System.out.println("El resultado del factorial del valor ingresado es tan grande que no se puede calcular");
    } else {
      System.out.println("El factorial del numero ingresado es: " + num);
    }
    

    sc.close();

  }

}