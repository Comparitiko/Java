/*
  24. Búsqueda binaria. El usuario piensa un número, y el programa debe averiguarlo. Pide al usuario que
  piense un número entre el 1 y el 100. El programa mostrará un número por pantalla y preguntará al
  usuario si el número que ha pensado es menor, igual o mayor al número mostrado. Este proceso lo
  repetirá hasta encontrar el número que ha pensado el usuario. Al finalizar el proceso, mostrará el número
  de intentos probados hasta encontrar el número.
*/

import java.util.Scanner;

public class P2Ejercicio24 {

  // Funcion para generar numero
  public static int generarNumero (int menor, int mayor) {

    int numRan = (int) (Math.random() * (mayor + 1 - menor)) + menor;

    return numRan;

  }
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    int menor = 1, mayor = 100, num = generarNumero(menor, mayor), opcionMenu = 0, intentos = 0;

    System.out.println("Piensa un numero del 1 al 100");

    // Bucle que pide la opcion del menu y segun lo que se ingrese aumentara el menor o reducira el mayor y si se acierta dira el numero de intentos
    do {

      try {
        System.out.println("¿El numero que has pensado es el numero " + num + "?");
        System.out.println("------------ Menú ------------");
        System.out.println("1. El numero " + num + " es menor que el numero pensado");
        System.out.println("2. El numero " + num + " es mayor que el numero pensado");
        System.out.println("3. El numero " + num + " es igual que el numero pensado");
        opcionMenu = sc.nextInt();

        if (opcionMenu < 1 || opcionMenu > 3) throw new IllegalArgumentException("Ingrese una opcion valida");

        if (opcionMenu == 1) {

          menor = num + 1;
          num = generarNumero(menor, mayor);
          intentos++;

        } else if (opcionMenu == 2) {

          mayor = num - 1;
          num = generarNumero(menor, mayor);
          intentos++;

        
        } else if (menor == mayor) {

          System.out.println("El numero que has pensado es el numero " + num + " y lo he acertado en " + intentos + " intentos");

        } else {

          System.out.println("El numero que has pensado es el numero " + num + " y lo he acertado en " + intentos + " intentos");
          
        }

      } catch (IllegalArgumentException err) {
        System.out.println(err.getMessage());
      }

    } while (opcionMenu != 3);

    sc.close();

  }

}
