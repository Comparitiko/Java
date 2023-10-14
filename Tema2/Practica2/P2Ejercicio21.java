/*
  21. Pedir un número entre 1 y 999 y mostrarlo con las cifras al revés. 
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class P2Ejercicio21 {
  
    // Funcion que pasado el numero me devuelve los digitos que tiene
    public static int digitos (int num) {
      int digitos = 0;
      
      while (num > 0) {
        num /= 10;
        digitos++;

      }

      return digitos;

    }
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    int newNum = 0, multiplicador = 1;

    try {

      // Pedir numero por pantalla
      System.out.println("Ingrese un numero entero positivo");
      int num = sc.nextInt();
      if (num < 1 || num > 999) throw new IllegalArgumentException("El numero tiene que ser entre 1 y 999");

      // Calcular el primer multiplicador segun los digitos que tenga el numero
      multiplicador = ((int) Math.pow(10, digitos(num))) / 10;

      // Bucle que vaya calculando el numero
      while (num > 0) {
        newNum += (num % 10) * multiplicador;
        multiplicador /= 10;
        num /= 10;
      }

    } catch (IllegalArgumentException err) {
      System.out.println("Error: " + err.getMessage());

    } catch (InputMismatchException err) {
      System.out.println("Error: El numero introducido no es un numero entero");

    } finally {
      sc.close();
      
    }

    System.out.println("El numero dado la vuelta es: " + newNum);

  }

}