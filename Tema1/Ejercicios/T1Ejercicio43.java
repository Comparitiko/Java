/*
  Ejercicio 1
  Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector con datos
  leídos por el teclado. Copia los elementos del vector en otro vector, pero en orden inverso, y
  muéstralo por la pantalla.
*/

import java.util.Arrays;
import java.util.Scanner;

public class T1Ejercicio43 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    String[] vector = new String[5];
    String[] vectorInverso = new String[5];

    // Bucle para ingresar valores en el vector
    for (int i = 0; i != vector.length; i++) {
      System.out.println("Ingrese el elemento numero " + (i + 1) + " del vector:");
      vector[i] = sc.nextLine();
    }

    // Bucle para cambiar el orden del vector
    for (int i = 0; i != vectorInverso.length; i++) {
      vectorInverso[i] = vector[(vector.length - 1) - i];
    }

    // Imprimir por terminal el resultado
    System.out.println("La array original es: " + Arrays.toString(vector));
    System.out.println("La array inversa es: " + Arrays.toString(vectorInverso));
    

    sc.close();

  }

}