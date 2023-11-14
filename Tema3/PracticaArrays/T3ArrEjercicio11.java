/*
  11. Crear una tabla bidimensional de tamaño 5x5 y rellenarla de forma que los elementos de la diagonal principal
  sean 1 y el resto 0. Mostrarla.
*/

import java.util.Arrays;

public class T3ArrEjercicio11 {
  
  public static void main(String[] args) {

    
    int[][] tabla = new int[5][5];

    // Rellenar el array en diagonal de 1 sin usar contador
    for (int i = 0; i < tabla.length; i++) {
      
      for (int j = 0; j < tabla[i].length; j++) {
        
        if (j == i) tabla[i][j] = 1;

      }

    }

    // Mostrar el Array de arrays en forma de tabla
    for (int i = 0; i < tabla.length; i++) {
      
      System.out.println(Arrays.toString(tabla[i]));

    }

  }

}