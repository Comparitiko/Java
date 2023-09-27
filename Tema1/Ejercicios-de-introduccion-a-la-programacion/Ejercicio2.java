/*
  Ejercicio 2 
  Calcular el perímetro y área de un rectángulo dada su base y su altura.
 */

import java.util.Scanner;

public class Ejercicio2 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    double area, perimetro, base, altura;

    // Pedir base del rectangulo
    System.out.println("Inserte la base del rectangulo:");
    base = sc.nextDouble();

    // Pedir altura del rectangulo
    System.out.println("Inserte la altura del rectangulo");
    altura = sc.nextDouble();

    // Calculo de area
    area = base * altura;

    // Calculo de perimetro
    perimetro = Math.pow(base, 2) + Math.pow(altura, 2);

    // Imprimir resultado por terminal
    System.out.println("El area del rectangulo es: " + area);
    System.out.println("El perimetro del rectangulo es: " + perimetro);

    sc.close();

  }

}
