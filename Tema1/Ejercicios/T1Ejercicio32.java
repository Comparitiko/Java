/*
  Ejercicio 9
  Realizar un ejemplo de menú, donde podemos escoger las distintas opciones (Opción A,
  Opción B, Salir) hasta que seleccionamos la opción de “Salir”.
*/

import java.util.Scanner;

public class T1Ejercicio32 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    String menu = "";
    
    while (menu != "Salir")  {
      System.out.println("1. Ingrese 'Opcion A' para ir a la opcion A");
      System.out.println("2. Ingrese 'Opcion B' para ir a la opcion B");
      System.out.println("3. Ingrese 'Salir' para salir");
      menu = sc.nextLine();

      switch(menu) {
        case "Opcion A":
          System.out.println("Has seleccionado la opcion A");
          break;
        case "Opcion B":
          System.out.println("Has seleccionado la opcion B");
          break;
        case "Salir":
          System.out.println("Saliendo...");
          break;
        default:
          System.out.println("Error, Ingrese una opcion valida, recuerde poner las mayusculas tal como estan en las opciones.");
          break;
      }
      System.out.println(menu);
    }

    sc.close();

  }

}