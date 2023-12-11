/*
  14. Programa que lea dos números positivos e imprima por pantalla todos los números pares que estén entre
  los dos números dados. También debe indicar cuántos números pares hay en ese intervalo.
*/

import java.util.Scanner;

public class P2Ejercicio14 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    int num1, num2, temp;

    // Pedir los valores para los numeros y que mientras no sea positivo lo siga pidiendo
    do {
      System.out.println("Ingrese un valor positivo para el primer numero");
      num1 = sc.nextInt();
    } while (num1 <= 0);

    do {
      System.out.println("Ingrese un valor positivo para el segundo numero");
      num2 = sc.nextInt();
    } while (num2 <= 0);

    // Comprobar si num1 es mayor que num2 y si num2 es mayor intercambiar los valores
    if (num1 < num2) {
      temp = num1;
      num1 = num2;
      num2 = temp;
    }

    // Bucle para sacar los numeros pares entre num1 y num2
    for (int i = num1; num1 != num2; i++) {
      if (i % 2 == 0) System.out.println(i);
    }

    sc.close();

  }

}