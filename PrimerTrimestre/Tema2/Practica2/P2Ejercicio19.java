/*
  19. Programa que, dado un número entero positivo introducido por teclado, visualice por pantalla todos los
  números primos menores que él. Utiliza la función del ejercicio anterior. Ejemplo:
  Dime un número: 15
  > Los primos menores de 15 son: 1,2,3,5,7,11,13
*/

import java.util.Scanner;

public class P2Ejercicio19 {

  // Funcion que diga si es primo
  public static boolean esPrimo (int num) {
    int divisores = 0;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) divisores++;
    }
    if (divisores == 2 || divisores == 1) return true;
    else return false;
  }
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese un numero entero positivo y te dire todos los primos menores que el:");
    int num = sc.nextInt();

    // Imprimir por pantalla los numeros primos menores que el numero introducido
    System.out.println("Los numeros primos que son menores que " + num + " son:");
    for (int i = 1; i < num; i++) {
      if (esPrimo(i)) System.out.println(i);
    }

    sc.close();

  }

}