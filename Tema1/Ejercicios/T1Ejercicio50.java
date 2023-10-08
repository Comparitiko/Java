/*
  Ejercicio 2
  Crea una función “ConvertirEspaciado”, que reciba como parámetro un texto y devuelve
  una cadena con un espacio adicional tras cada letra. Por ejemplo, “Hola, tú” devolverá “H o l
  a , t ú “. Crea un programa principal donde se use dicha función.
*/

import java.util.Scanner;

public class T1Ejercicio50 {
  
  public static String convertirEspaciado (String texto) {
    StringBuilder textoEditado = new StringBuilder();
    for (int i = 0; i != texto.length(); i++) {
      char caracter = texto.charAt(i);

      textoEditado.append(caracter);
      
      if (caracter != ' ') {
        textoEditado.append(' ');
      }
      
    }
    return textoEditado.toString();
  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el texto que quiera:");
    String texto = convertirEspaciado(sc.nextLine());

    System.out.println("El texto añadiendole espacios entre cada caracter quedaria:");
    System.out.println(texto);

    sc.close();

  }

}