/*
  16. Crea una matriz de 3x6 números enteros aleatorios no repetidos.
*/

import java.util.Arrays;

public class T3ArrEjercicio16 {

  public static boolean estaEnArray (int[][] array, int num) {
    for (int i = 0; i < array.length; i++) {
      
      for (int j = 0; j < array[i].length; j++) {
        
        if (array[i][j] == num) return true;

      }

    }

    return false;

  }

  public static int genNum () {
    return (int) Math.ceil(Math.random() * 1000);
  }
  
  public static void main(String[] args) {

    int[][] matriz = new int[3][6], copiaMatriz = matriz.clone();

    // Rellenar el array de numeros aleatorios
    for (int i = 0; i < matriz.length; i++) {

      for (int j = 0; j < matriz[i].length; j++) {

        while (true) {
          
          int numGen = genNum();

        }
        

      }
      
    }
    
    for (int i = 0; i < matriz.length; i++) {
      
      System.out.println(Arrays.toString(matriz[i]));

    }

  }

}