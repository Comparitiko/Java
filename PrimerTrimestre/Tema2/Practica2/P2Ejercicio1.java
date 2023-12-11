/*
  1. Crea una función (método) que reciba como parámetros tres números enteros y devuelva el mayor de
  los tres números. Utilizar esa función para el calcular el mayor de cuatro números enteros. Sería así:
  public int mayor (int a, int b, int c) { … }
*/

import java.util.Scanner;

public class P2Ejercicio1 {
  
  public static int mayor (int a, int b, int c) {

    int numMayor = 0;
    // Comprobacion que numero es el mayor
    if (a >= b && a >= c) {
      numMayor =  a;
    } else if (a <= b && c <= b) {
      numMayor = b;
    } else if (c >= a && c >= b) {
      numMayor = c;
    }  
    
    return numMayor;
  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrse el primer numero a comparar");
    int num1 = sc.nextInt();

    System.out.println("Ingrse el segundo numero a comparar");
    int num2 = sc.nextInt();

    System.out.println("Ingrse el tercer numero a comparar");
    int num3 = sc.nextInt();
    
    int numMayor = mayor(num1, num2, num3);

    System.out.println("El numero de los introducidos mas grande es: " + numMayor);

    sc.close();

  }

}