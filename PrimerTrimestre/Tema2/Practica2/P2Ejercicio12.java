/*
  12. Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =
  número de líneas, que se pida por teclado.
     *  
    *** 
   *****
  *******
*/

import java.util.Scanner;

public class P2Ejercicio12 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir numero de filas a pintar
    System.out.println("Ingrese el numero de filas que quieres pintar:");
    int filasTotales = sc.nextInt();

    // Sacar espacios y asteriscos necesarios para la primera fila
    int espacios = (filasTotales - 1) * 2;
    int asteriscos = 1;

    // Bucle para poner la fila
    for (int i = 1; i <= filasTotales; i++) {
      
      // Bucle para poner espacios y asteriscos
      for (int j = 1; j <= espacios + asteriscos; j++) {

        if (j <= espacios / 2) {
          System.out.print(" ");
        } else if (j <= espacios / 2 + asteriscos) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }

      }

      System.out.println();
      espacios -= 2;
      asteriscos += 2;

    }

    sc.close();

  }

}