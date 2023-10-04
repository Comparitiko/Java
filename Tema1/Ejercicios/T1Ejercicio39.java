/*
  Ejercicio 5
  Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos
  cadenas se introducen por teclado.
*/

import java.util.Scanner;

public class T1Ejercicio39 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir cadenas  por terminal
    System.out.println("Ingrese la primera cadena:");
    String cad1 = sc.nextLine();

    System.out.println("Ingrese la segunda cadena:");
    String cad2 = sc.nextLine();

    // Declaracion de variables
    String[] caracteresCad1 = cad1.split("");
    String[] caracteresCad2 = cad2.split("");
    int coincidencias = 0;

    // Comprobacion si la segunda cadena esta dentro de la primera
    for (int i = 0; i != cad1.length(); i++) {
      System.out.print(caracteresCad1[i] + " " + caracteresCad2[coincidencias]);
      System.out.println("");
      if (caracteresCad1[i].equals(caracteresCad2[coincidencias])) {
        coincidencias ++;
      } else {
        coincidencias = 0;
      }
      
      if (coincidencias == cad2.length()) break;
    }

    if (coincidencias == cad2.length()) {
      System.out.println("La segunda cadena introducida esta en la primera cadena");
    } else {
      System.out.println("La segunda cadena introducida no esta en la primera cadena");
    }

    sc.close();

  }

}