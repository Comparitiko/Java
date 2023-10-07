/*
  Ejercicio 3
  Programa que declare tres vectores ‘vector1’, ‘vector2’ y ‘vector3’ de cinco enteros cada
  uno, pida valores para ‘vector1’ y ‘vector2’ y calcule vector3=vector1+vector2.
*/

import java.util.Arrays;
import java.util.Scanner;

public class T1Ejercicio45 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de valores
    int[] vector1 = new int[5];
    int[] vector2 = new int[5];
    int[] vector3 = new int[5];

    // Bucle para pedir valores para vector 1 y 2
    for (int i = 0; i != vector1.length; i++) {
      System.out.println("Ingrese el valor " + (i + 1) + " del vector 1");
      vector1[i] = sc.nextInt();

      System.out.println("Ingrese el valor " + (i + 1) + " del vector 2");
      vector2[i] = sc.nextInt();
    }

    // Bucle para calcular el vector 3
    for (int i = 0; i != vector3.length; i++) {
      vector3[i] = vector1[i] + vector2[i];
    }

    // Imprimir por terminal el resultado
    System.out.println(Arrays.toString(vector3));

    sc.close();

  }

}