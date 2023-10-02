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
    int menu = 0;
    
    while (menu != 3)  {

      System.out.println("1. Ingrese '1' para ir a la opcion A");
      System.out.println("2. Ingrese '2' para ir a la opcion B");
      System.out.println("3. Ingrese '3' para salir");
      menu = sc.nextInt();

      if (menu == 1) {
        System.out.println("Has seleccionado la opcion A");
      } else if (menu == 2) {
        System.out.println("Has seleccionado la opcion B");
      } else if (menu == 3) {
        System.out.println("Saliendo...");
      } else {
        System.out.println("Error, Ingrese una opcion valida, recuerde poner las mayusculas tal como estan en las opciones.");
      }

      System.out.println(menu);

    }

    sc.close();

  }

}