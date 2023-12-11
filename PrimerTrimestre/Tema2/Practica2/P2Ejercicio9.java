/*
  9. Crea un método que, dado un número entero pasado como parámetro, devuelva cuántos dígitos lo
  forman. P.ej.: el número 54326 consta de 5 dígitos. Pista: cuántas veces se puede dividir entre 10.
*/

import java.util.Scanner;

public class P2Ejercicio9 {

  public static int digitos (int num) {
    // Declarar digitos a 1 para no contar el ultimo digito
    int digitos = 1;

    // Sacar la cantidad de digitos dividiendo entre 10 hasta que quede un numero menor que 10
    while (!(num < 10)) {
      num = num / 10;
      System.out.println(num);
      digitos++;
    }

    return digitos;

  }
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese un numero y te dire cuantos digitos tiene:");
    int digitos = digitos(sc.nextInt());

    System.out.println("La cantidad de digitos que tiene el numero ingresado es: " + digitos);

    sc.close();

  }

}