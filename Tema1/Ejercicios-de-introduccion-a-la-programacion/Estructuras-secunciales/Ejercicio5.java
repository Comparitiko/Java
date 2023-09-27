/*
  Ejercicio 5
  Calcular la media de tres números pedidos por teclado.
 */

import java.util.Scanner;

public class Ejercicio5 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declarar variables
    double num1, num2, num3;

    // Pedir valores
    System.out.println("Ingresa el valor del primer numero");
    num1 = sc.nextDouble();

    System.out.println("Ingresa el valor del segundo numero");
    num2 = sc.nextDouble();

    System.out.println("Ingresa el valor del tercer numero");
    num3 = sc.nextDouble();

    // Imprimir resultado por terminal
    System.out.println("La media de los numeros " + num1 + ", " + num2 + " y " + num3 + " es igual a: " + ((num1 + num2 + num3) / 3));

    sc.close();

  }

}
