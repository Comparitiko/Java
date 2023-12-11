import java.util.Scanner;

public class Divisores {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int numDivisores = 0;

    System.out.println("Ingresa un numero y te dire sus divisores");
    int num = sc.nextInt();

    for (int i = 0; i != num; i++) {
      if (num % (i + 1) == 0) {
        System.out.println(i);
        numDivisores++;
      }
    }

    System.out.println("La cantidad de divisores del numero " + num + " son " + numDivisores);

    sc.close();

  }

}