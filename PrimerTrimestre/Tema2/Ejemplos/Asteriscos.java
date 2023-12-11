import java.util.Scanner;

public class Asteriscos {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de asteriscos que quieres pintar:");
    int asteriscos = sc.nextInt();

    for (int i = 0; i != asteriscos; i++) {
      if (i != (asteriscos - 1)) {
        System.out.print("*");
      } else {
        System.out.println("*");
      }
    }

    sc.close();

  }

}