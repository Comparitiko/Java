package SegundoTrimestre.Tema5.Practicas_Objetos.JuegoAhorcado;
import java.util.Scanner;
public class TestAhorcado {


  public static int menu() throws Exception {
    // Funcion que imprime un menu y devuelve un numero del menu
    System.out.println("---- Menu ----");
    System.out.println("1. Probar letras");
    System.out.println("2. Probar palabra");

    int opcionMenu = Integer.parseInt((new Scanner(System.in)).nextLine());
    if (opcionMenu < 1 || opcionMenu > 2) throw new Exception("La opcion menu tiene que ser 1 o 2");
    return opcionMenu;
  }

  public static String letterReq () throws Exception {
    // Funcion para pedir una letra
    System.out.println("Ingrese una letra");
    String letter = (new Scanner(System.in).nextLine());
    if (letter.length() > 1 || letter.length() == 0) throw new Exception("Algo ha ocurrido mal, fijese en que ha puesto una sola letra");
    return letter;
  }

  public static void main(String[] args) {
    // Mostrar palabra con guiones
    Ahorcado j1 = new Ahorcado();
    System.out.println("La palabra con guiones es:");
    System.out.println(j1.getPalabraIntentada());

    boolean isGameRunning = true;

    while (isGameRunning) {
      int menuOption;
      try {
        menuOption = menu();
      } catch (Exception e) {
        System.out.println(e.getMessage());
        continue;
      }
      switch (menuOption) {
        case 1:
          // Si la opcion es 1 pedir letra y pasarla a la clase para hacer las comprobaciones de si esta
          String letter;
          try {
            letter = letterReq();
          } catch (Exception e) {
            System.out.println(e.getMessage());
            continue;
          }
          if (j1.probarLetra(letter) && j1.probarPalabra(j1.getPalabraIntentada())) {
            System.out.println("Enhorabuena, has ganado, la palabra era:");
            System.out.println(j1.getPalabraAdivinar());
            isGameRunning = false;
            break;
          }
          if (j1.probarLetra(letter.toLowerCase())) System.out.println("Has acertado la letra");
          else System.out.println("Has fallado la letra");
          break;
        case 2:
          // Si la opcion es 2 pide una palabra y la pasa a la clase para las comprobaciones
          System.out.println("Ingrese la palabra que crea que es");
          String word = new Scanner(System.in).nextLine().toLowerCase();
          if (j1.probarPalabra(word)) {
            System.out.println("Enhorabuena, has acertado la palabra:");
            System.out.println(j1.getPalabraAdivinar());
            isGameRunning = false;
          } else {
            System.out.println("Lo siento has perdido");
            System.out.println("La palabra era:");
            System.out.println(j1.getPalabraAdivinar());
            isGameRunning = false;
          }
          break;
      }
      if (!isGameRunning) break;
      // Poner la palabra  intentada en este momento y mostrar fallos
      System.out.println("La palabra ahora mismo es:");
      System.out.println(j1.getPalabraIntentada());
      System.out.println("Llevas " + j1.getNumFallos() + " fallos");
      // Si los numFallos son 7 romper el bucle y decir la palabra a adivinar
      if (j1.getNumFallos() == 7) {
        System.out.println("Te has quedado sin turnos y has perdido.");
        System.out.println("La palabra era: " + j1.getPalabraAdivinar());
        break;
      }
    }
  }
}
