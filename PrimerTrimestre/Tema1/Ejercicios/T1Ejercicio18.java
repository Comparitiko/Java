/*
  Ejercicio 5
  Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es bisiesto si es un
  número divisible por 4, pero no si es divisible por 100, excepto que también sea divisible por
  400.
*/

import java.util.Scanner;

public class T1Ejercicio18 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir datos por terminal
    System.out.println("Ingrese el año:");
    int anio = sc.nextInt();

    // Comprobar si es bisiesto
    if (anio % 100 == 0 && anio % 400 == 0) {
      System.out.println("El año " + anio + " es bisiesto");
    } else if (anio % 100 == 0) {
      System.out.println("El año " + anio + " no es bisiesto");
    } else if (anio % 4 == 0) {
      System.out.println("El año " + anio + " es bisiesto");
    } else {
      System.out.println("El año " + anio + " no es bisiesto");
    }

    sc.close();

  }

}