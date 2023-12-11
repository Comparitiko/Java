/*
  20. Pedir un número entero positivo N. A continuación, introducir por teclado N números enteros. Mostrar
  la media de los N números introducidos, el mayor y el menor.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class P2Ejercicio20 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    int sumaNums = 0, numMenor = 0, numMayor = 0, cantidadNums = 0;

    // Hacer un try catch que controla si se mete positivo o si se mete un double
    try {
      System.out.println("Ingrese un numero entero positivo");
      cantidadNums = sc.nextInt();
      if (cantidadNums <= 0) throw new IllegalArgumentException("El numero introducido no es positvo");

      for (int i = 0; i != cantidadNums; i++) {
        System.out.println("Ingresa un numero");
        int num = sc.nextInt();
        sumaNums = sumaNums + num;

        if (i == 0) {
          numMayor = num;
          numMenor = num;
        }

        if (num <= numMenor) numMenor = num;
        if (num >= numMayor) numMayor = num;

      }

    } catch (IllegalArgumentException err) {
      System.out.println("Error: " + err.getMessage());

    } catch (InputMismatchException err) {
      System.out.println("Error: El numero introducido no es un numero entero");

    } finally {
      sc.close();
      
    }


    System.out.println("La media de los numeros introducidos es: " + sumaNums / cantidadNums);
    System.out.println("El menor de los numeros introducidos es: " + numMenor);
    System.out.println("El mayor de los numeros introducidos es: " + numMayor);

  }

}