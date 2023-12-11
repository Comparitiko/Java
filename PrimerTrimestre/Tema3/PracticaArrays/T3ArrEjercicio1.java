/*
  1. Programa Java que guarda en un array 20 números enteros que se generen aleatoriamente entre -100 y 100. A
  continuación, se recorre el array y calcula cuántos números son positivos y cuántos negativos.
*/

import java.util.Arrays;

public class T3ArrEjercicio1 {

  // Generar un numero aleatorio
  public static int genNum(int min, int max) {

    return  (int) ((Math.random() * (max - min + 2) + min - 1));

  }
  
  public static void main(String[] args) {

    // Declaracion de variables
    int[] nums = new int[20];
    int numPositivos = 0, numNegativos = 0;

    // Bucle que rellena el array de numeros aleatorios
    for (int i = 0; i < nums.length; i++) {

      nums[i] = genNum(-100, 100);
      
      // Si el numero es mayor que 0 añadir un positivo, si es menor que 0 añadir negativo
      if (nums[i] > 0) numPositivos++;
      if (nums[i] < 0) numNegativos++;

    }

    // Imprimir por pantalla resultados
    System.out.println("La cantidad de numeros positivos en el array es: " + numPositivos);
    System.out.println("La cantidad de numeros negativos en el array es: " + numNegativos);
    System.out.println("El array de los numeros generados es: " + Arrays.toString(nums));

  }

}