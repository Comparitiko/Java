/*
  5. Realiza una función que calcule el máximo de tres números. Pruébala.
*/

public class Ejercicio5RT2 {

  // Funcion que devuelve el numero mayor de 2 valores dados
  public static int numMax2 (int n1, int n2) {

    if (n1 > n2) return n1;
    else return n2;

  }

  // Funcion que devuelve el numero mayor de 3 valores dados
  public static int numMax3 (int n1, int n2, int n3) {

    return numMax2(numMax2(n1, n2), n3);

  }
  
  public static void main(String[] args) {

    try {

      System.out.println("Ingrese el numero 1:");
      int n1 = Integer.parseInt(System.console().readLine());

      System.out.println("Ingrese el numero 1:");
      int n2 = Integer.parseInt(System.console().readLine());

      System.out.println("Ingrese el numero 1:");
      int n3 = Integer.parseInt(System.console().readLine());

      System.out.println("El numero maximo de los valores introducidos es: " + numMax3(n1, n2, n3));
      
    } catch (Exception e) {

      System.out.println("Error: " + e);

    }

  }

}