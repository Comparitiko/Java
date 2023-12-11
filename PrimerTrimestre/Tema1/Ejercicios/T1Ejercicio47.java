/*
  Ejercicio 5
  Diseñar el algoritmo correspondiente a un programa, que:
  Crea una tabla bidimensional de longitud 5x5 y nombre ‘diagonal’.
  Carga la tabla de forma que los componentes pertenecientes a la diagonal de la matriz
  tomen el valor 1 y el resto el valor 0.
  Muestra el contenido de la tabla en pantalla. 
*/

public class T1Ejercicio47 {
  
  public static void main(String[] args) {

    // Declaracion de variables
    int[] tabla = new int[25];

    // Dar valores a tabla
    for (int i = 0; i != tabla.length; i++) {
      if (i == 0 || i % 6 == 0) {
        tabla[i] = 1;
      } else {
        tabla[i] = 0;
      }
    }

    // Bucle para crear tabla
    System.out.println("------- Diagonal -------");
    for (int i = 0; i != tabla.length; i++) {
      System.out.print(" | " + tabla[i]);
      if ((i + 1) % 5 == 0) System.out.println(" | ");
    }

  }

}