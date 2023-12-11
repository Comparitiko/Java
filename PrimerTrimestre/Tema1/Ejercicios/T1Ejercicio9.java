/*
  Ejercicio 9
  Pide al usuario dos pares de números (x1,y2) y (x2,y2), que representen dos puntos en el
  plano. Calcula y muestra la distancia entre ellos.
*/

import java.util.Scanner;

public class T1Ejercicio9 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    double distancia;

    // Pedir valores por terminal
    System.out.println("Inserte el valor de x de la primera posicion:");
    double x1 = sc.nextDouble();

    System.out.println("Inserte el valor de y de la primera posicion:");
    double y1 = sc.nextDouble();

    System.out.println("Inserte el valor de x de la segunda posicion:");
    double x2 = sc.nextDouble();
    
    System.out.println("Inserte el valor de y de la segunda posicion:");
    double y2 = sc.nextDouble();

    // Calcular distancia entre los dos puntos
    distancia = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 + y2), 2));

    // Imprimir por terminal la distancia
    System.out.println("La distancia entre los dos puntos introducidos es: " + distancia);

    sc.close();
  }

}