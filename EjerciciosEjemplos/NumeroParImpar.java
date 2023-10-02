import java.util.Scanner;

public class NumeroParImpar {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir datos por terminal
    System.out.println("Ingrese el numero para saber si es par o impar:");
    int num = sc.nextInt();

    // Saber si es par o impar
    if (num % 2 == 0) {
      System.out.println("El numero " + num + " es un numero par");
    } else {
      System.out.println("El numero " + num + " es un numero impar");
    }

    sc.close();

  }

}