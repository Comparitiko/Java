import java.util.Scanner;

public class MezclaColores {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese un color de entre rojo verde y amarillo:");
    String color1 = sc.nextLine();

    if (color1.equals("rojo") || color1.equals("verde") || color1.equals("azul")) {

      System.out.println("Ingrese otro color de entre rojo verde o amarillo:");
      String color2 = sc.nextLine();

      if (color2.equals("rojo") || color2.equals("verde") || color2.equals("azul")) {

        if (color1.equals("rojo") && color2.equals("verde")) {
          System.out.println("La mezcla de los colores " + color1 + " y " + color2 + " es amarillo");
        } else if (color1.equals("azul") && color2.equals("verde")) {
          System.out.println("La mezcla de los colores " + color1 + " y " + color2 + " es cyan");
        } else if (color1.equals("verde") && color2.equals("rojo")) {
          System.out.println("La mezcla de los colores " + color1 + " y " + color2 + " es amarillo");
        } else if (color1.equals("azul") && color2.equals("rojo")) {
          System.out.println("La mezcla de los colores " + color1 + " y " + color2 + " es magenta");
        } else if (color1.equals("rojo") && color2.equals("azul")) {
          System.out.println("La mezcla de los colores " + color1 + " y " + color2 + " es magenta");
        } else if (color1.equals("verde") && color2.equals("azul")) {
          System.out.println("La mezcla de los colores " + color1 + " y " + color2 + " es cyan");
        } else {
          System.out.println("La mezcla de dos colores iguales es el mismo color por lo tanto es: " + color1);
        }

      } else {
        System.out.println("Error: Color numero 2 introducido incorrectamente");
      }

    } else {
      System.out.println("Error: Color numero 1 introducido incorrectamente");
    }

    sc.close();

  }

}