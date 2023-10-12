import java.util.Scanner;

public class Dados {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int intentos = 1, dado1 = 0, dado2 = 0;

    System.out.println("Ingrese el numero en el que se tienen que repetir los dados:");
    int numDados = sc.nextInt();

    while (dado1 != numDados && dado2 != numDados) {
      dado1 = (int) Math.ceil(Math.random() * 6);
      dado2 = (int) Math.ceil(Math.random() * 6);
      if (dado1 != numDados && dado2 != numDados) intentos++;
    }

    System.out.println("La cantidad de intentos para sacar el numero " + numDados + " ha sido de " + intentos + " intentos." );

    sc.close();

  }

}