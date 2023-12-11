/*
 Ejercicio 3
  Crea un programa que pida al usuario dos números y muestre su división si el segundo no es
  cero, o un mensaje de aviso en caso contrario.
*/

import java.util.Scanner;

class T1Ejercicio16 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir valores
    System.out.println("Ingrese el primer numero");
    int num1 = sc.nextInt();

    System.out.println("Ingrese el segundo numero");
    int num2 = sc.nextInt();

    // Solucion
    if (num2 != 0) {
      System.out.println("El resultado al hacer la division es: " + (num1 / num2));
    } else {
      System.out.println("Error: El segundo numero ingresado es 0.");
    }


    sc.close();

  }

}