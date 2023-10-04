import java.util.Scanner;

public class SwitchModo {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir datos por terminal
    System.out.println("Ingrese un numero del 1 al 5");
    int nivel = sc.nextInt();

    // Imprimir por pantalla segun el numero dado
    switch (nivel) {
      case 1:
        System.out.println("Nivel iniciado seleccionado");
        break;
      case 2:
        System.out.println("Nivel amateur seleccionado");
        break;
      case 3:
        System.out.println("Nivel profesional seleccionado");
        break;
      case 4:
        System.out.println("Nivel experto seleccionado");
        break;
      case 5:
        System.out.println("Modo dios seleccionado");
        break;
      default:
        System.out.println("Nivel seleccionado incorrectamente");
    }

    sc.close();

  }

}