/*
  Ejercicio 13
  Escribir un algoritmo para calcular la nota final de un estudiante, considerando que: por
  cada respuesta correcta 5 puntos, por una incorrecta -1 y por respuestas en blanco 0.
  Imprime el resultado obtenido por el estudiante.
*/

import java.util.Scanner;

public class T1Ejercicio13 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    double notaFinal;

    // Pedir datos por terminal
    System.out.println("Ingrese el numero de respuestas correctas");
    int rCorrectas = sc.nextInt();

    System.out.println("Ingrese el numero de respuestas incorrectas");
    int rIncorrectas = sc.nextInt();

    System.out.println("Ingrese el numero de respuestas en blanco");
    int rBlanco = sc.nextInt();

    // Calculo de nota final
    double totalPuntos = (rBlanco + rCorrectas + rIncorrectas) * 5;
    notaFinal = (((rCorrectas * 5) + (rIncorrectas * (-1)) + (rBlanco * 0)) / totalPuntos) * 10;

    // Imprimir datos por terminal
    System.out.println("La nota final es: " + notaFinal);

    sc.close();

  }

}
// No finalizado