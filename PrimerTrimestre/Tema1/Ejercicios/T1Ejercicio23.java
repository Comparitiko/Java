/*
  Ejercicio 10
  Escribe un programa que resuelva una ecuación de segundo grado del tipo AX2 + BX + C
*/

import java.util.Scanner;

public class T1Ejercicio23 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir datos por terminal
    System.out.println("Ingrese el valor de A: ");
        double a = sc.nextDouble();
        
        System.out.println("Ingrese el valor de B: ");
        double b = sc.nextDouble();
        
        System.out.println("Ingrese el valor de C: ");
        double c = sc.nextDouble();
        
        double discriminante = b * b - 4 * a * c;
        
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son x1 = " + x1 + " y x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La solución es x = " + x);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }

    sc.close();

  }

}