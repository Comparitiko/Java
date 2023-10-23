import java.util.Scanner;

public class T2Password {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    String password = "";

    while (password.length() <= 10) {
      System.out.println("Ingrese una contraseña");
      password = sc.nextLine();

      if (password.length() <= 10) System.out.println("Error: vuelve a ingresar la contraseña con mas de 10 caracteres");
    }

    sc.close();

  }

}