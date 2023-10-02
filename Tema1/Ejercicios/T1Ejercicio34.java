/*
  Ejercicio 12
  Realizar un programa que pida el número de filas a mostrar y comience por la mayor fila
  mostrando tantos asteriscos como la fila actual hasta llegar a cero.
*/

import java.util.Scanner;

public class T1Ejercicio34 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    int asteriscos = 0;

    // Pedir numero de filas
    System.out.println("Ingrese el numero de filas a mostrar");
    int filas = sc.nextInt();

    // Bucle que pinte las filas
    while (filas > 0) {

      while (asteriscos < filas) {
        if (asteriscos == filas - 1) {
          System.out.println("*");
        } else {
          System.out.print("*");
        }
        asteriscos ++;
      }

      asteriscos = 0;
      filas --;
    }

    sc.close();

  }

}