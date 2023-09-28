/*
  Ejercicio 8
  Pide al usuario dos números y muestra la “distancia” entre ellos (el valor absoluto de su
  diferencia, de modo que el resultado sea siempre positivo).
 */

import java.util.Scanner;

public class T1Ejercicio8 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declarar variables
    int numDif;

    // Pedir por terminal los dos numeros
    System.out.println("Ingrese el primer numero");
    int num1 = sc.nextInt();

    System.out.println("Ingrese el segundo numero");
    int num2 = sc.nextInt();

    // Calcular la diferencia entre un numero y otro

    if (num1 > num2) {
      numDif = num1 - num2;
    } else {
      numDif = num2 - num1;
    }

    System.out.println("La diferencia entre los dos numeros es: " + numDif);

    sc.close();
  }

}