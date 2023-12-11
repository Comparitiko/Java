/*
  22. Pedir un número entre 1 y 9999 y decir si es capicúa.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class P2Ejercicio22 {

  // Funcion que pasado el numero me devuelve los digitos que tiene
  public static int digitos (int numMod) {
    int digitos = 0;
    
    while (numMod > 0) {
      numMod /= 10;
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
      int numMod = num;
      if (numMod < 1 || numMod > 9999) throw new IllegalArgumentException("El numero tiene que ser entre 1 y 999");

      // Calcular el primer multiplicador segun los digitos que tenga el numero
      multiplicador = ((int) Math.pow(10, digitos(numMod))) / 10;

      // Bucle que vaya calculando el numero
      while (numMod > 0) {
        newNum += (numMod % 10) * multiplicador;
        multiplicador /= 10;
        numMod /= 10;
      }

      // Comprobar si el numero dado la vuelta es el mismo que el num sin modificar
      if (newNum == num) System.out.println("El numero " + num + " es un numero capicúa");
      else System.out.println("El numero " + num + " no es un numero capicúa");

    } catch (IllegalArgumentException err) {
      System.out.println("Error: " + err.getMessage());

    } catch (InputMismatchException err) {
      System.out.println("Error: El numero introducido no es un numero entero");

    } finally {
      sc.close();
      
    }

  }

}