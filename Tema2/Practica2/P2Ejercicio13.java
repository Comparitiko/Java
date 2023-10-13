/*
  13. Programa que muestre por pantalla los números del 1 al 100 sin mostrar los que sean múltiplos de 5.
*/

public class P2Ejercicio13 {
  
  public static void main(String[] args) {

    // Bucle que muestre todos los numeros que no sean multiplos de 5
    for (int i = 1; i <= 100; i++) {
      if (i % 5 != 0) System.out.println(i);
    }

  }

}