/*
 Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for. Házlo
  también con un while.
*/

public class Ejercicio4RT2 {
  
  public static void main(String[] args) {

    // Bucle for para sacar los numeros de 20 en 20
    System.out.println("Bucle for");
    for (int i = 320; i >= 160; i -= 20) {

      System.out.println(i);

    }

    System.out.println();

    // Declarar variable para while
    int n = 320;

    // Bucle while para sacar los numeros de 20 en 20
    System.out.println("Bucle while");
    while (n >= 160) {
      
      System.out.println(n);
      n -= 20;

    }

  }

}