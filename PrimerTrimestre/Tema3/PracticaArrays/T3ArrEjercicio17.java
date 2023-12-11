/*
  17. Ordenar matrices. Crea una matriz de enteros de dos dimensiones de 50x50 elementos, rellénala con números
  aleatorios entre 1 y 500. A continuación, realiza dos funciones:
  a.ordenaFilas(matriz): que ordene la matriz por filas, cada fila de la matriz quedará ordenada de menor a
  mayor.
  b.ordenaColumnas(matriz): que ordene la matriz por columnas, cada columna quedará ordenada de
  menor a mayor, independientemente de las demás.

  Filas [5,2,4,6] ==> [2,4,5,6]
  
  Columnas
  [7,6,5]
  [8,9,1]
  [1,2,3]
  =======
  [1,2,1]
  [7,6,3]
  [8,9,5]
*/

import java.util.Arrays;

public class T3ArrEjercicio17 {

  // Funcion que genera un numero del 1 al 500
  public static int genNum () {
    return (int) Math.ceil(Math.random() * 500);
  }

  // Funcion para ordenar las filas de la matriz
  public static void ordenarFilas (int[][] nums) {
    
    for (int i = 0; i < nums.length; i++) {
      Arrays.sort(nums[i]);
    }

  }

  // Funcion para ordenar las columnas de la matriz
  public static void ordenarColumnas (int[][] nums) {

    int[] ArrayColumnas = new int[nums.length];
    
    // Bucle que recorre de columna en columna e inserta la columna entera en un array
    for (int i = 0; i < nums.length; i++) {
      
      for (int j = 0; j < nums[i].length; j++) {

        ArrayColumnas[j] = nums[j][i];
        
      }
      
      Arrays.sort(ArrayColumnas);

      for (int j = 0; j < nums[i].length; j++) {
        
        nums[j][i] = ArrayColumnas[j];

      }

    }

  }
  
  public static void main(String[] args) {

    int[][] nums = new int[50][50];

    // Rellenar el array de numeros aleatorios
    for (int i = 0; i < nums.length; i++) {
      
      for (int j = 0; j < nums[i].length; j++) {
        
        nums[i][j] = genNum();

      }

    }

    // Copiar arrays para ordenar por filas o columnas
    int[][] numsPorFilas = new int[nums.length][nums[0].length], numsPorColumnas = new int[nums.length][nums[0].length];

    for (int i = 0; i < nums.length; i++) {
      
      numsPorFilas[i] = Arrays.copyOf(nums[i], nums.length);
      numsPorColumnas[i] = Arrays.copyOf(nums[i], nums.length);

    }

    // Bucle para imprimir el array de arrays sin ordenar
    System.out.println("El array sin ordenar es: ");
    for (int i = 0; i < nums.length; i++) {
      
      System.out.println(Arrays.toString(nums[i]));

    }

    ordenarFilas(numsPorFilas);

    // Bucle para imprimir el array de arrays ordenado por filas
    System.out.println("El array ordenado por filas es: ");
    for (int i = 0; i < numsPorFilas.length; i++) {
      
      System.out.println(Arrays.toString(numsPorFilas[i]));

    }

    ordenarColumnas(numsPorColumnas);

    // Bucle para imprimir el array de arrays ordenado por columnas
    System.out.println("El array ordenado por columnas es: ");
    for (int i = 0; i < numsPorColumnas.length; i++) {
      
      System.out.println(Arrays.toString(numsPorColumnas[i]));

    }

  }

}