import java.util.Scanner;

public class AccederSistema {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    String usuario, contrasenia;

    // Pedir datos por terminal
    System.out.println("Ingrese el nombre usuario:");
    usuario = sc.nextLine();

    System.out.println("Ingrese la contraseña:");
    contrasenia = sc.nextLine();

    if (usuario.equals("pepe") && contrasenia.equals("12345678")) {
      System.out.println("Has entrado al sistema");
    } else {
      System.out.println("Error");
    }

    sc.close();

  }

}