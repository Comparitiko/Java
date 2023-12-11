import java.util.Scanner;

public class Potencia {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int res = 1;

    System.out.println("Ingrese la base de la potencia:");
    int base = sc.nextInt();

    System.out.println("Ingresa el exponente de la potencia:");
    int exponente = sc.nextInt();

    for (int i = 0; i != exponente; i++) {
      res = res * base;
    }
    
    System.out.println("El resultado de la potencia es: " + res);

    sc.close();

  }

}