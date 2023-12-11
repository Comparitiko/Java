/*
  Ejercicio 9
  Escribe un programa que pida un número entero entre uno y doce e imprima el número de
  días que tiene el mes correspondiente.
*/

import java.util.Scanner;

public class T1Ejercicio22 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir datos por terminal
    System.out.println("Ingrese un numero del 1-12 que representa a un mes:");
    int mes = sc.nextInt();

    // Hacer un switch para que segun el mes me devuelva el numero de dias
    switch (mes) {
      case 1:
        System.out.println("El numero de dias de enero son " + 31);
        break;
      case 2:
        System.out.println("El numero de dias de febrero son " + 28 + " o " + 29 + " depende de si es bisiesto o no");
        break;
      case 3:
        System.out.println("El numero de dias de marzo son " + 31);
        break;
      case 4:
        System.out.println("El numero de dias de abril son " + 30);
        break;
      case 5:
        System.out.println("El numero de dias de mayo son " + 31);
        break;
      case 6:
        System.out.println("El numero de dias de junio son " + 30);
        break;
      case 7:
        System.out.println("El numero de dias de julio son " + 31);
        break;
      case 8:
        System.out.println("El numero de dias de agosto son " + 31);
        break;
      case 9:
        System.out.println("El numero de dias de septiembre son " + 30);
        break;
      case 10:
        System.out.println("El numero de dias de octubre son " + 31);
        break;
      case 11:
        System.out.println("El numero de dias de noviembre son " + 30);
        break;
      case 12:
        System.out.println("El numero de dias de diciembre son " + 31);
        break;
      default:
        System.out.println("ERROR: El numero introducido no pertenece a un mes");
        break;
    }

    sc.close();

  }

}