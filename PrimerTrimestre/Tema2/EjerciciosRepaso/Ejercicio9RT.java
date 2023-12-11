/*
  9. Realiza un programa que pinte los 50 primeros términos de esta serie: (5n + 2) / n
*/

public class Ejercicio9RT {
  
  public static void main(String[] args) {

    // Bucle que va calculando todas las opciones
    for (int i = 1; i <= 50; i++) {

      System.out.println("El resultado de la operacion (5 * " + i + " + 2) / " + i);
      System.out.println((double) (5 * i + 2) / i);
      System.out.println();

    }

  }

}