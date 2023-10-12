/*
  8. Programa que imprima la tabla de multiplicar de cualquier número entre el 1 y el 10 introducido por teclado
*/

import java.util.Scanner;

public class P2Ejercicio8 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int tabla;
    
    // Bucle para pedir una tabla del 1 al 10
    do {
      System.out.println("Ingrese un numero que coincida con una tabla del 1 al 10:");
      tabla = sc.nextInt();
    } while (tabla < 1 || tabla > 10);

    sc.close();

    System.out.println("Tabla del " + tabla);

    // Bucle para sacar la tabla
    for (int i = 1; i <= 10; i++) {
      System.out.println(tabla + " X " + i + " = " + (tabla * i));
    }

  }

}