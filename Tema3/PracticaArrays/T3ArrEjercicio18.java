/*
  18. Escribe un programa que genere al azar 20 números enteros comprendidos entre 0 y 9. Estos números se deben
  introducir en un array de 4 filas por 5 columnas.
  El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La
  suma total debe aparecer en la esquina inferior derecha.
*/

import java.util.Arrays;

public class T3ArrEjercicio18 {

  // Funcion que genera un numero del 0 al 9
  public static int genNum () {
    return (int) Math.ceil(Math.random() * 10) - 1;
  }
  
  public static void main(String[] args) {

    int[][] nums = new int[5][6];
    int sumaFilas = 0, sumaColumnas = 0;

    // Bucle para ingresar los valores en el array y sumar las filas
    for (int i = 0; i < nums.length - 1; i++) {
      
      for (int j = 0; j < nums[i].length; j++) {

        if (j != nums[i].length - 2) {

          int numGenerado = genNum();
          sumaFilas += numGenerado;
          nums[i][j] = numGenerado;
          System.out.println(sumaFilas);

        } else {

          nums[i][j] = sumaFilas;
          sumaFilas = 0;

        }

      }

    }
    System.out.println();
    // Bucle para sumar las columnas y poner el total
    for (int i = 0; i < nums[i].length; i++) {
      
      for (int j = 0; j < nums.length; j++) {
        
        if (j != nums.length - 1) {

          sumaColumnas += nums[j][i];
          System.out.println(sumaColumnas);

        } else {

          nums[j][i] = sumaColumnas;
          sumaColumnas = 0;

        }

      }

    }

    // Bucle para mostrar el array
    for (int i = 0; i < nums.length; i++) {
      
      Arrays.toString(nums[i]);

    }

  }

}