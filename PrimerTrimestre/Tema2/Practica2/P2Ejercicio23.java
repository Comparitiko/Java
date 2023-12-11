/*
  23. Pedir el día, mes y año de una fecha y mostrar la fecha del día siguiente (sin años bisiestos). Hacer
  primero una función para determinar que la fecha introducida es correcta.
*/

import java.util.Scanner;

public class P2Ejercicio23 {

    public static boolean esFechaValida(int dia, int mes) {
      switch (mes) {
        case 1, 3, 5, 7, 8, 10, 12:
          if (dia <= 31) return true;
          else return false;
        case 4, 6, 9, 11:
          if (dia <= 30) return true;
          else return false;
        case 2:
          if (dia <= 28) return true;
          else return false;
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

    // Comprobar si la fecha es correcta y si es correcta añadir un dia
    if (esFechaValida(dia, mes)) {
      
      switch (mes) {
        case 1, 3, 5, 7, 8, 10:
          if (dia == 31) {
            dia = 1;
            mes++;
          } else {
            dia++;
          }
          break;
        case 4, 6, 9, 11:
          if (dia == 30) {
            dia = 1;
            mes++;
          } else {
            dia++;
          }
          break;
        case 2:
          if (dia == 28) {
            dia = 1;
            mes++;
          } else {
            dia++;
          }
          break;
        case 12:
          if (dia == 31) {
            dia = 1;
            mes = 1;
            anio++;
          } else {
            dia++;
          }
          break;
      }

      System.out.println("La fecha siguiente de la introducida es " + dia + "/" + mes + "/" + anio);
      
    } else {
      System.out.println("La fecha introducida es incorrecta");
    }
    
    sc.close();

  }

}