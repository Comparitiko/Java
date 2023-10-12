/*
  10. Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =
  número de líneas, que se pida por teclado.
  *
  **
  ***
  ****
*/

import java.util.Scanner;

public class P2Ejercicio10 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir numero de filas a pintar
    System.out.println("Ingrese el numero de filas que quieres pintar:");
    int filasTotales = sc.nextInt();

    // Bucles para pintar los asteriscos para cada fila
    for (int i = 1; i <= filasTotales; i++) {
      
      for (int j = 0; j != i; j++) {
        System.out.print("*");
      }

      System.out.println();

    }

    sc.close();

  }

}