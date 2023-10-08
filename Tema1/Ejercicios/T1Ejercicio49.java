/*
  Ejercicio 1
  Crea un procedimiento EscribirCentrado, que reciba como parámetro un texto y lo escriba
  centrado en pantalla (suponiendo una anchura de 80 columnas; pista: deberás escribir 40 -
  longitud/2 espacios antes del texto). Además, subraya el mensaje utilizando el carácter =
*/

import java.util.Scanner;

public class T1Ejercicio49 {
  
  public static void EscribirCentrado (String args) {
    System.out.println("Este es el texto centrado:");
    System.out.println("-------------------------------------------------- " + args + " --------------------------------------------------");

    for (int i = 0; i  != 102; i++) {
      if (102 / 2 == i) {
        for (int j = 0; j != args.length(); j++) {
          System.out.print("=");
        }
      } else {
        System.out.print("-");
      }
      
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese un texto y lo devolvere centrado:");
    EscribirCentrado(sc.nextLine());

    sc.close();

  }

}