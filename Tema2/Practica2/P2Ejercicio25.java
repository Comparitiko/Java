/*
  25. Escribe un método, de nombre esFechaValida, que reciba como parámetros tres valores enteros con el
  día, mes y año de una fecha y devuelva un valor booleano que indique si se trata de valores válidos para
  una fecha. Si puedes comprueba también que el año sea bisiesto.
*/

import java.util.Scanner;

public class P2Ejercicio25 {

  public static boolean esFechaValida(int dia, int mes, int anio) {
    switch (mes) {
      case 1, 3, 5, 7, 8, 10, 12:
        if (dia <= 31) return true;
        else return false;
      case 4, 6, 9, 11:
        if (dia <= 30) return true;
        else return false;
      case 2:
        if (anio % 4 == 0 && anio % 100 != 0 && anio % 400 == 0) {
          if (dia <= 29) return true;
          else return false;
        } else {
          if (dia <= 28) return true;
          else return false;
        }
      default:
        return false; 
    }
  }
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir fecha por terminal
    System.out.println("Ingrese el dia:");
    int dia = sc.nextInt();
    
    System.out.println("Ingrese el mes:");
    int mes = sc.nextInt();

    System.out.println("Ingrese el año:");
    int anio = sc.nextInt();

    if (esFechaValida(dia, mes, anio)) System.out.println("La fecha introducida es correcta.");
    else System.out.println("La fecha introducida es incorrecta.");

    sc.close();

  }

}