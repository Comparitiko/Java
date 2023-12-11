/*
  Ejercicio 5
  Escribe un programa que dados dos números, uno real (base) y un entero positivo
  (exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el operador
  de potencia.
*/

import java.util.Scanner;

class T1Ejercicio28 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    //Declaracion de variables
    int repeticiones = 0;
    double res = 0;

    //Pedir base y exponente
    System.out.println("Inserte la base de la potencia:");
    double base = sc.nextDouble();

    System.out.println("Inserte un numero enterto positivo mayor que 0, sera el exponente:");
    int exponente = sc.nextInt();

    // Bucle que hasta que no sea mayor que 0 siga dando un error y permita al usuario ingresar otro numero 
    while (exponente <= 0) {
      System.out.println("Error: Inserte un valor positivo mayor que 0");
      exponente = sc.nextInt();
    }

    // Bucle para multiplicar la base n veces, la n es igual al exponente
    while (repeticiones != exponente) {
      System.out.println(repeticiones);
      if (repeticiones == 1) {
        res = base * base;
      } else {
        res = res * base;
      }
      repeticiones ++;
    }

    // Imprimir resultado por terminal
    System.out.println("El resultado de la potencia es: " + res);

    sc.close();

  }

}