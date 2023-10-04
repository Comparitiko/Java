/*
  Ejercicio 4
  Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a
  minúsculas y viceversa.
*/

import java.util.Scanner;

public class T1Ejercicio38 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Leer datos por terminal
    System.out.println("Ingrese una cadena de texto:");
    String cadena = sc.nextLine();

    // Declaracion de variables
    String[] caracteres = cadena.split("");

    // Bucle que vean si son mayus o minus
    for (int i = 0; i != cadena.length(); i++) {
      if (caracteres[i] == caracteres[i].toUpperCase()) {
        System.out.print(caracteres[i].toLowerCase());
      } else {
        System.out.print(caracteres[i].toUpperCase());
      }
    }

    sc.close();

  }

}