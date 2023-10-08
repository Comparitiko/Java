/*
  Ejercicio 1
  Crea un procedimiento EscribirCentrado, que reciba como parámetro un texto y lo escriba
  centrado en pantalla (suponiendo una anchura de 80 columnas; pista: deberás escribir 40 -
  longitud/2 espacios antes del texto). Además, subraya el mensaje utilizando el carácter =
*/

import java.util.Scanner;

public class T1Ejercicio49 {
  
  public static String EscribirCentrado (String args) {
    String textoCentrado = "-------------------------------------------------- " + args + " --------------------------------------------------";
    return textoCentrado;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese un texto y lo devolvere centrado:");
    String texto = EscribirCentrado(sc.nextLine());

    System.out.println("Este es el texto centrado:");
    System.out.println(texto);

    sc.close();

  }

}