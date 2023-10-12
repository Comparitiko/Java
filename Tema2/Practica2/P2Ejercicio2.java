/*
  Programa que lea un número por teclado e indique si es múltiplo de 2, 3, 5 o 7
*/

import java.util.Scanner;

public class P2Ejercicio2 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese un numero y te dire si es multiplo de 2, 3, 5 o 7:");
    int num = sc.nextInt();

    // Saber si num es multiplo de alguno de los numeros o no.
    if (num % 2 == 0) System.out.println("El numero " + num + " es multiplo de 2.");
    if (num % 3 == 0) System.out.println("El numero " + num + " es multiplo de 3.");
    if (num % 5 == 0) System.out.println("El numero " + num + " es multiplo de 5.");
    if (num % 7 == 0) System.out.println("El numero " + num + " es multiplo de 7.");
    if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0) System.out.println("El numero " + num + " no es multiplo de ninguno de los numero mencionados");

    sc.close();

  }

}