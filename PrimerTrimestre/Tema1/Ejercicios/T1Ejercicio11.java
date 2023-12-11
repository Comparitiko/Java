/*
  Ejercicio 11
  Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número
  invertido. Ejemplo, si se introduce 23 que muestre 32.
 */

import java.util.Scanner;

public class T1Ejercicio11 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    int num;

    // Pedir numero
    System.out.println("Ingrese un entero de como maximo 2 cifras: ");
    int fNum = sc.nextInt();

    // Conseguir el numero invertido
    num = fNum;
    int ultimodigito = num % 10;
    int numSinUD = num - ultimodigito;
    int primerDigito = numSinUD / 10;
    

    System.out.println("El numero invertido de " + fNum + " es: " + ultimodigito + primerDigito);

    sc.close();
  }

}