/*
  Ejercicio 4
  Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
  Recordar que la fórmula para la conversión es:     C = (F-32)*5/9
 */

import java.util.Scanner;

public class T1Ejercicio4 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    // Declaracion de variables
    double gradosF;

    // Pedir grados fahrenheit por terminal
    System.out.println("Ingresa los grados Fahrenheit que hace en tu ciudad");
    gradosF = sc.nextDouble();

    // Imprimir por terminal el resultado
    System.out.println("Los grados Fahrenheit en tu ciudad son " + gradosF + " y en grados Celsius son: " + ((gradosF - 32) * 5 / 9));

    sc.close();

  }

}
