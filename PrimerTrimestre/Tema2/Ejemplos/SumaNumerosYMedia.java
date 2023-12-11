import java.util.Scanner;

public class SumaNumerosYMedia {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int num = 1, totalNums = 0;
    double media, suma = 0;

    do {
      System.out.println("Ingrese un numero:");
      num = sc.nextInt();
      suma = suma + num;
      totalNums ++;
    } while (num != 0);

    // Resto 1 para quitar el valor de 0 de totalNums
    media = suma / (totalNums - 1);

    System.out.println("La suma es: " + suma);
    System.out.println("La media es: " + media);

    sc.close();

  }

}