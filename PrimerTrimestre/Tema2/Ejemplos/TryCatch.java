import java.util.Scanner;

public class TryCatch {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Ingrese un numero entero");
      int num1 = sc.nextInt();
      if (num1 < 0) throw new Exception("Menor que 0");
      System.out.println((num1 + 5));
    } catch (Exception err) {
      System.out.println("Error: " + err);
    } finally {
      sc.close();
    }

    System.out.println("Sigue despues del error");

  }

}