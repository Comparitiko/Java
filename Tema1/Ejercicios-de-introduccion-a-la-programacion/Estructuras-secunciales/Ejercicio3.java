/*
  Ejercicio 3
  Dados dos números, mostrar la suma, resta, división y multiplicación de ambos
 */

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    double num1, num2;

    // Pedir numeros
    System.out.println("Ingresa el valor del numero 1");
    num1 = sc.nextDouble();
    
    System.out.println("Ingresa el valor del numero 2");
    num2 = sc.nextDouble();

    // Imprimir por terminal la suma, resta, multiplicacion y division
    System.out.println("El resultado de " + num1 + " + " + num2 + " = " + (num1 + num2));
    System.out.println("El resultado de " + num1 + " - " + num2 + " = " + (num1 - num2));
    System.out.println("El resultado de " + num1 + " * " + num2 + " = " + (num1 * num2));
    System.out.println("El resultado de " + num1 + " / " + num2 + " = " + (num1 / num2));

    sc.close();

  }
}
