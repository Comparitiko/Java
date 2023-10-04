/*
  Ejercicio 3
  Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la
  aparición del primer carácter en la cadena por el segundo carácter. 
*/

import java.util.Scanner;

public class T1Ejercicio37 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    String car1 = "", car2 = "";

    System.out.println("Ingrese una cadena de texto:");
    String cadena = sc.nextLine();

    while (car1.length() != 1) {
      System.out.println("Ingrese el caracter que va a ser reemplazado en la cadena:");
      car1 = sc.nextLine();
      if (car1.length() != 1) System.out.println("Error: Ingrese un solo caracter por favor.");
    }

    while (car2.length() != 1) {
      System.out.println("Ingrese el caracter por el que se va a reemplazar el primer caracter introducido:");
      car2 = sc.nextLine();
      if (car2.length() != 1) System.out.println("Error: Ingrese un solo caracter por favor.");
    }

    // Buscar y remplazar caracteres
    String cadenaMod = cadena.replace(car1, car2);

    // Mostrar por teminal resultados
    System.out.println("La cadena modificada de " + cadena + " cambiandole " + car1 + " por " + car2 + " es: " + cadenaMod);

    sc.close();

  }

}