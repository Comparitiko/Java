/*
  Ejercicio 6
  De una empresa de transporte se quiere guardar el nombre de los conductores que tiene, y
  los kilómetros que conducen cada día de la semana.
  Para guardar esta información se van a utilizar dos arreglos:
  nombre: Vector para guardar los nombres de los conductores.
  kms: Tabla para guardar los kilómetros que realizan cada día de la semana.
  Se quiere generar un nuevo vector (“total_kms”) con los kilómetros totales que realza cada
  conductor.
  Al finalizar se muestra la lista con los nombres de conductores y los kilómetros que ha
  realizado.
*/

import java.util.Scanner;

public class T1Ejercicio48 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    String[] conductores = {"Victor", "Manuel", "Gabriel"};
    int[][] kms = {
      {25, 50, 25, 10, 70},
      {10, 2 ,3 ,0, 20},
      {200, 300, 300, 500 , 900}
    };
    int[] total_Kms = new int[conductores.length];
    int sumKms = 0;

    for (int i = 0; i != conductores.length; i++) {

      // Sumar kms
      for (int j = 0; j != kms[i].length; j++) {
         sumKms = sumKms + kms[i][j];
      }

      total_Kms[i] = sumKms;

      System.out.println("El total de kilometros del conductor " + conductores[i] + " es de: " + total_Kms[i] + " kilometros");

    }


    sc.close();

  }

}