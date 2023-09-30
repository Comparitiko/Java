/*
  Ejercicio 2
  Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a
  introducir). El programa debe informar de cuantos números introducidos son mayores que
  0, menores que 0 e iguales a 0.
*/

import java.util.Scanner;

public class T1Ejercicio25 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    int repeticiones = 0, nums0 = 0, numMenos0 = 0, numsMas0 = 0;

    System.out.println("Ingrese la cantidad de numeros a introducir:");
    int cantidadNums = sc.nextInt();

    // Bucle que pida insertar numeros hasta la cantidad introducida arriba
    while (repeticiones != cantidadNums) {
      System.out.println("Inserte un numero:");
      int num = sc.nextInt();

      if (num == 0) {
        nums0++;
      } else if (num > 0) {
        numsMas0 ++;
      } else {
        numMenos0 ++;
      }
      
      repeticiones ++;

    }

    // Imprimir por terminal los resultados dados
    System.out.println("La cantidad de numeros introducidos mayor que 0 es: " + numsMas0);
    System.out.println("La cantidad de numeros introducidos menor que 0 es: " + numMenos0);
    System.out.println("La cantidad de numeros introducidos igual que 0 es: " + nums0);

    sc.close();

  }

}