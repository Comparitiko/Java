/*
  Ejercicio 8
  Una empresa les paga a sus empleados con base en las horas trabajadas en la semana.
  Realice un algoritmo para determinar el sueldo semanal de N trabajadores y, además,
  calcule cuánto pagó la empresa por los N empleados.
*/

import java.util.Scanner;

public class T1Ejercicio31 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    int repeticiones = 0;
    double horasTotales = 0;

    //Pedir numero empleados y pago por hora
    System.out.println("¿Cuantos empleados tiene la empresa?");
    int empleados = sc.nextInt();

    System.out.println("¿Cuanto paga la empresa por hora?");
    double precioHora = sc.nextDouble();

    //Bucle que vaya pidiendo el numero de horas de cada trabajador
    while (repeticiones != empleados) {
      System.out.println("Inserte el numero de horas semanales del trabajador numero " + (repeticiones + 1));
      double horas = sc.nextDouble();

      horasTotales = horasTotales + horas;

      System.out.println("El trabajador numero " + (repeticiones + 1) + " un sueldo semanal de: " + (precioHora * horas));
      repeticiones ++;
    }

    // Imprimir por terminal cuanto paga la empresa en total
    System.out.println("La empresa tiene que pagar por tener " + empleados + " empleados un total de: " + (horasTotales * precioHora) + " euros");

    sc.close();

  }

}