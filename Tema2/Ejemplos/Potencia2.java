import java.util.Scanner;

public class Potencia2 {
  
  /**
   * Funcion que devuelva la potencia dada la base y el exponente
   * @param base
   * @param exponente
   * @return base elevado a exponente
   */
  public static double potencia (double base, int exponente) {

    double res = 1;
    
    for (int i = 0; i < exponente; i++) {

      res *= base;

    }

    return res;

  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Ingrese la base de la potencia:");
      double base = Double.parseDouble(sc.nextLine());

      System.out.println("Ingrese el exponente de la potencia:");
      int exponente = Integer.parseInt(sc.nextLine()); 

      // Llamar a la funcion potencia para que la calcule
      double res = potencia(base, exponente);

      System.out.println("El resultado es: " + res);

    } catch (Exception e) {
      System.out.println("Error: " + e);
    } finally {
      sc.close();
    }

  }

}