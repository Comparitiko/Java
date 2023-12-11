/*
  Ejercicio 10
  Realizar un algoritmo que lea un número y que muestre su raíz cuadrada y su raíz cúbica.
  PSeInt no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿Cómo se
  puede calcular?
 */

import java.util.Scanner;

public class T1Ejercicio10 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    // Declaracion de variables
    double rCuad, rCub;

    // Leer un numero
    System.out.println("Inserte el valor del numero al que quieres que se le calcule la raiz cuadrada y la cubica:");
    double num = sc.nextDouble();

    // Realizar operaciones necesarias
    rCuad = Math.sqrt(num);
    rCub = Math.pow(num, 0.33);

    // Imprimir por pantalla los resultados
    System.out.println("La raiz cuadrada de " + num + " es: " + rCuad);
    System.out.println("La raiz cubica de " + num + " es: " + rCub);

    sc.close();
  }

}
