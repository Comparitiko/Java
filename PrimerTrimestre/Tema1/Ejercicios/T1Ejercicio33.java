/*
  Ejercicio 11
  Mostrar en pantalla los N primeros número primos. Se pide por teclado la cantidad de
  números primos que queremos mostrar
*/

import java.util.Scanner;

public class T1Ejercicio33 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    int divisor = 1, num = 1, numDivisores = 0, numPrimos = 0;

    // Pedir numero primos que queremos
    System.out.println("Ingrese el numero de primos que quiere mostrar por pantalla:");
    int numPrimosTotales = sc.nextInt();

    System.out.println("Calculando los primeros " + numPrimosTotales + " numeros primos");

    // Bucle que va sacando numeros primos
    while (numPrimos < numPrimosTotales) {

      while (divisor <= num) {
        if (num % divisor == 0) numDivisores ++;
        divisor ++;
      }

      if (numDivisores == 2) {
        System.out.println(num);
        numPrimos ++;
      }

      num ++;
      numDivisores = 0;
      divisor = 1;

    }

    sc.close();

  }

}