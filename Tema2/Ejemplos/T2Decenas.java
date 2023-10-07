package Tema2.Ejemplos;
import java.util.Scanner;

public class T2Decenas {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    for (int i = 100; i <= 300; i += 10) {
      System.out.println(i);
    }

    sc.close();

  }

}