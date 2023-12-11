/*
  Ejercicio 1
  Crea una aplicación que permita adivinar un número. La aplicación genera un número
  aleatorio del 1 al 100. A continuación, va pidiendo números y va respondiendo si el número
  a adivinar es mayor o menor que el introducido, además de los intentos que te quedan
  (tienes 10 intentos para acertarlo). El programa termina cuando se acierta el número
  (además te dice en cuantos intentos lo has acertado), si se llega al límite de intentos te
  muestra el número que había generado.
*/

import java.util.Scanner;

public class T1Ejercicio24 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    int intentos = 0, num;
    int ranNum = (int) Math.ceil(Math.random() * 100);

    // Bucle while que mientras el numero no sea acertado o no haya llegado a 10 intentos esta funcionando el programa
    while (intentos != 10) {
      System.out.println("Inserte un numero del 1 al 100:");
      num = sc.nextInt();
      
      // If para saber si el numero se ha acertado o es mayor o menor.
      if (num == ranNum) {
        break;
      } else {
        if (num > ranNum) {
          System.out.println("El numero " + num + " es mayor que el numero a adivinar.");
        } else {
          System.out.println("El numero " + num + " es menor que el numero a adivinar.");
        }
        intentos ++;
      }
      
    }
    
    // If para saber si ha sido acertado o has llegado a 10 intentos
    if (intentos == 10) {
      System.out.println("No has conseguido acertar el numero en 10 intentos el numero era: " + ranNum);
    } else {
      System.out.println("Has acertado el numero " + ranNum + " en " + intentos + " intentos ");
    }

    sc.close();

  }

}