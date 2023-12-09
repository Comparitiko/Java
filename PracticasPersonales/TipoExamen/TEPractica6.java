package PracticasPersonales.TipoExamen;

/*
  [1.5 puntos] Ordenar matrices. Crea una matriz de enteros de dos dimensiones de 50x50
  elementos, rellénala con números aleatorios entre 1 y 500. A continuación, realiza dos
  funciones:
  - ordenaFilas(matriz): que ordene la matriz por filas, cada fila de la matriz quedará
  ordenada de menor a mayor.
  - ordenaColumnas(matriz): que ordene la matriz por columnas, cada columna
  quedará ordenada de menor a mayor, independientemente de las demás.
  Puedes utilizar los algoritmos de ordenación vistos en clase. Muestra la matriz original, la
  matriz ordenada por filas, la matriz ordenada por columnas, la suma de la matriz ordenada
  por filas más la matriz ordenada por columnas. 
*/

import java.util.Arrays;

public class TEPractica6 {
  // Funcion para pintar una matriz en terminal
  public static void pintarMatriz (int[][] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(Arrays.toString(array[i]));
    }
  }
  // Funcion para rellenar un array de numeros aleatorios del 1 al 500
  public static void rellenarArray (int[][] nums) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[0].length; j++) {
        nums[i][j] = (int) (Math.ceil(Math.random() * 500));
      }
    }
  }
  // Funcion para ordenar filas de un array
  public static void ordenaFilas (int[][] nums) {
    for (int i = 0; i < nums.length; i++) {
      Arrays.sort(nums[i]);
    }
  }
  // Funcion que ordena un array por sus columnas
  public static void ordenaColumnas (int[][] nums) {
    int[] columna = new int[nums.length];
    for (int j = 0; j < nums[0].length; j++) {
      // For para ingresar los valores de cada columna en un nuevo array
      for (int i = 0; i < nums.length; i++) {
        columna[i] = nums[i][j];
      }
      // Ordenar array columna
      Arrays.sort(columna);
      for (int i = 0; i < nums.length; i++) {
        nums[i][j] = columna[i];
      }
    }
  }
  
  public static void main(String[] args) {

    int[][] nums = new int[3][3];

    rellenarArray(nums);
    pintarMatriz(nums);
    System.out.println();
    ordenaColumnas(nums);
    pintarMatriz(nums);
    System.out.println();
    ordenaFilas(nums);
    pintarMatriz(nums);

  }

}