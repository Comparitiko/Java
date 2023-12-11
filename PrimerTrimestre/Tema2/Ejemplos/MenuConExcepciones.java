import java.util.Scanner;

public class MenuConExcepciones {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int opcionMenu = 0;

    
    while (opcionMenu != 3) {

      System.out.println(opcionMenu);

      System.out.println("---- Menu ----");
      System.out.println("1. Saludo anonimo");
      System.out.println("2. Saludo con nombre");
      System.out.println("3. Salir");

      try {  
        
        opcionMenu = Integer.parseInt(sc.nextLine());

      } catch (Exception e) {

        System.out.println("Error: " + e);

      }

      switch (opcionMenu) {
          case 1:
            System.out.println("Hola persona anonima");
            break;
          case 2:
            System.out.println("Ingrese su nombre");
            String nombre = sc.nextLine();

            System.out.println("Hola " + nombre);
            break;
          case 3:
            System.out.println("Saliendo...");
            break;
          default:
            System.out.println("Ingrese un valor correcto");
            break;
        }

    }
    sc.close();
  }
}