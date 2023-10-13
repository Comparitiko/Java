/*
  15. Programa que lea números hasta que le den el cero, y que diga cuál ha sido el mayor y cuál el menor de
  los números introducidos (sin tener en cuenta el cero).
*/

import java.util.Scanner;

public class P2Ejercicio15 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    int num, numMayor, numMenor;

    System.out.println("Ingrese un numero:");
    num = sc.nextInt();

    numMayor = num;
    numMenor = num;

    // Bucle para seguir pidiendo numeros e ir cambiando el valor de numMayor y numMenor
    do {
      System.out.println("Ingrese un numero:");
      num = sc.nextInt();
      if (num != 0) {
        if (num >= numMayor) numMayor = num;
        if (num <= numMenor) numMenor = num;
      }
    } while (num != 0);

    // Imprimir por terminal numMayor y numMenor
    System.out.println("El numero menor de los introducidos es: " + numMenor);
    System.out.println("El numero mayor de los introducidos es: " + numMayor);

    sc.close();

  }

}