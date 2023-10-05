import java.util.Scanner;

public class IfModo {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir datos por terminal
    System.out.println("Ingrese un numero del 1 al 5 para iniciar un modo:");
    int nivel = sc.nextInt();

    // Imprimir por pantalla segun el nivel seleccionado
    if (nivel == 1) {
     System.out.println("Has elegido el nivel iniciado");
    } else if (nivel == 2) {
      System.out.println("Has elegido el nivel amateur");
    } else if (nivel == 3) {
      System.out.println("Has elegido el nivel profesional");
    } else if (nivel == 4) {
      System.out.println("Has elegido el nivel experto");
    } else if (nivel == 5) {
      System.out.println("Has elegido el modo dios");
    } else {
      System.out.println("Nivel incorrecto");
    }
    
    sc.close();

  }

}