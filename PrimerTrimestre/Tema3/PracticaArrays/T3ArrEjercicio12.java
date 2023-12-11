/*
  12. Crear una matriz “marco” de tamaño 8x6. Una matriz “marco” es aquella que todos sus elementos son 0 salvo los
  de los bordes que deben ser 1. Mostrarla.
*/

import java.util.Arrays;

public class T3ArrEjercicio12 {
  
  public static void main(String[] args) {

    int[][] marco = new int[8][6];

    // Rellenar los bordes del marco de 1
    for (int i = 0; i < marco.length; i++) {
      
      for (int j = 0; j < marco[i].length; j++) {
        
        if (i == 0 || i == marco.length - 1 || j == 0 || j == marco[i].length - 1) marco[i][j] = 1;

      }

    }

    // Mostrar el Array de arrays en forma de marco
    for (int i = 0; i < marco.length; i++) {
      
      System.out.println(Arrays.toString(marco[i]));

    }

  }

}