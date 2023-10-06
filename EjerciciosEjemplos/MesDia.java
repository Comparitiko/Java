import java.util.Scanner;

public class MesDia {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir valores por terminal
    System.out.println("Ingrese el mes");
    int mes = sc.nextInt();

    System.out.println("Ingrese el dia");
    int dia = sc.nextInt();

    switch (mes) {
      case 1, 3, 5, 7, 8, 10, 12:
        if (dia <= 31 && dia >= 1){
          System.out.println("Fecha correcta");
        } else {
          System.out.println("Fecha incorrecta");
        }
        break;
      case 4, 6, 9, 11:
        if (dia <= 30 && dia >= 1){
          System.out.println("Fecha correcta");
        } else {
          System.out.println("Fecha incorrecta");
        }
        break;
      case 2:
        if (dia <= 28 && dia >= 1){
          System.out.println("Fecha correcta");
        } else {
          System.out.println("Fecha incorrecta");
        }
        break;
      default:
        System.out.println("Fecha incorrecta");
    }

    sc.close();

  }

}