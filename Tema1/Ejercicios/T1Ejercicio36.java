/*
  Ejercicio 2
  Suponiendo que hemos introducido una cadena por teclado que representa una frase
  (palabras separadas por espacios), realiza un programa que cuente cuantas palabras tiene.
*/

import java.util.Scanner;

public class T1Ejercicio36 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir valores por terminal
    System.out.println("Ingrese una frase:");
    String frase = sc.nextLine();

    // Separar la frase por cada espacio y contar cuantas palabras hay en el Array
    int numPalabras = frase.split(" ").length;

    // Imprimir por pantalla el numero de palabras
    System.out.println("El numero de palabras de la frase introducida es: " + numPalabras + " palabras");

    sc.close();

  }

}