/*
  Ejercicio 2
  Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y
  diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar un vector. Para
  simplificarlo vamos a suponer que febrero tiene 28 días.
*/

import java.util.Scanner;

public class T1Ejercicio44 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    int numMes = 0;

    // Bucle para que se inserte un numero correcto
    while (!(numMes >= 1 && numMes <= 12)) {
      System.out.println("Ingrese un numero que coincida con un mes:");
      numMes = sc.nextInt();
      if (!(numMes >= 1 && numMes <= 12)) System.out.println("Error");
    }

    // Switch para saber cuantos dias tiene cada mes e imprimir por terminal el resultado
    switch (numMes) {
      case 1,3,5,7,8,10,12:
        System.out.println(meses[numMes - 1] + " tiene 31 dias");
        break;
      case 4,6,9,11:
        System.out.println(meses[numMes - 1] + " tiene 30 dias");
        break;
      case 2:
        System.out.println(meses[numMes - 1] + " tiene 28 dias");
        break;
    }

    sc.close();

  }

}