/*
  Ejercicio 1
  Pide una cadena y un carácter por teclado (valida que sea un carácter) y muestra cuantas
  veces aparece el carácter en la cadena.
*/

import java.util.Scanner;

public class T1Ejercicio35 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    String caracter = "", cadena;
    int numRep = 0;

    // Pedir un solo caracter mientras que no sea solo uno se repetira
    while (caracter.length() != 1) {
      System.out.println("Ingrese solo un caracter");
      caracter = sc.nextLine();
      if (caracter.length() != 1) System.out.println("Error: Ingrese un solo caracter");
    }
    // Convertir de string a char
    char charCar = caracter.charAt(0);

    System.out.println("Ingrese una cadena de texto");
    cadena = sc.nextLine();

    // Bucle que vaya aumentando el numero de caracter al que se accede
    for (int i = 0; i < cadena.length(); i++) {
      char charCad = cadena.charAt(i);
      if (charCad == charCar) numRep ++;
    }

    // Imprimir resultado por pantalla
    System.out.println("El numero de veces que aparece el caracter " + charCar + " es: " + numRep + " veces.");

    sc.close();

  }

}
