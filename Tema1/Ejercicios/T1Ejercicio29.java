/*
  Ejercicio 6
  Una empresa tiene el registro de las horas que trabaja diariamente un empleado durante la
  semana (seis días) y requiere determinar el total de éstas, así como el sueldo que recibirá
  por las horas trabajadas.
*/

import java.util.Scanner;

public class T1Ejercicio29 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    int totalHoras = 0;

    // Pedir sueldo por hora trabajada
    System.out.println("Cual sera el sueldo en € que recibira el trabajador por una hora trabajada:");
    double salarioHora = sc.nextDouble();

    // Bucle for para poder ir pidiendo las horas por dia
    for (int dia = 0; dia != 6; dia++) {
      System.out.println("Ingrese las horas trabajadas en el dia " + (dia + 1) + " de la semana:");
      int horasDia = sc.nextInt();

      totalHoras = totalHoras + horasDia;
    }

    // Imprimir por terminal los resultados
    System.out.println("Las horas trabajadas en 6 dias han sido: " + totalHoras + " horas.");
    System.out.println("El total de salario generado durante la semana es de: " + (totalHoras * salarioHora) + "€");

    sc.close();

  }

}