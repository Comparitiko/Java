/*
  16. Programa que lea por teclado una serie de números enteros hasta que introduzca el -1 y obtenga su
  media. Deberá mostrarla por pantalla.
*/

import java.util.Scanner;

public class P2Ejercicio16 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    int cantidadNums = 0, sumaNums = 0;
    int num;

    // Bucle que pida numeros y si no es -1 prepara la media
    do {
      System.out.println("Ingrese una nota que se añadira a la media");
      num = sc.nextInt();
      if (num != -1) {
        sumaNums += num;
        cantidadNums++;
      }
    } while (num != -1);

    // Imprimir por terminal la media de los numeros introducidos
    System.out.println("La media de los numero ingresados es: " + (sumaNums / cantidadNums));

    sc.close();

  }

}