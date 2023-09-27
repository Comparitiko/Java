/*
  Ejercicio 6
  Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas
  horas y minutos corresponde.
  Por ejemplo: 1000 minutos son 16 horas y 40 minutos.
*/

import java.util.Scanner;

public class Ejercicio6 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    long firstmins, mins, horas;

    // Pedir minutos por terminal
    System.out.println("Ingresa los minutos:");
    firstmins = sc.nextInt();

    // Calcular horas y minutos dados los mintutos
    horas = firstmins / 60;
    mins = firstmins - (horas * 60);

    // Imprimir por pantalla los resultados
    System.out.println("Dado el valor " + firstmins + " las horas son " + horas + " y los minutos son " + mins);

    sc.close();

  }

}
