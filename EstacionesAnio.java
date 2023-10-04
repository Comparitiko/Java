import java.util.Scanner;

public class EstacionesAnio {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir valores por terminal
    System.out.println("Ingrese el numero de un mes:");
    int numMes = sc.nextInt();

    // Segun mes poner estacion
    switch (numMes) {
      case 12, 1 , 2:
        System.out.println("Invierno");
        break;
      case 3, 4, 5:
        System.out.println("Primavera");
        break;
      case 6, 7, 8:
        System.out.println("Verano");
        break;
      case 9, 10, 11:
        System.out.println("Otoño");
        break;
      default:
        System.out.println("Error: numero de mes no existe");
    }

    sc.close();

  }

}