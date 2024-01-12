package SegundoTrimestre.Tema4.Practicas_Objetos.JuegoAhorcado;

public class TestAhorcado {

  public static int menu() throws Exception {
    System.out.println("---- Menu ----");
    System.out.println("1. Probar letras");
    System.out.println("2. Probar palabra");
    int opcionMenu = Integer.parseInt(System.console().readLine());
    if (opcionMenu < 1 || opcionMenu > 2)
      throw new Exception("La opcion menu tiene que ser 1 o 2");
    return opcionMenu;
  }

  public static void main(String[] args) {
    Ahorcado j1 = new Ahorcado();
    System.out.println("La palabra con guiones es:");
    System.out.println(j1.getPalabraIntentada());

    boolean isGameRunning = true;

    while (isGameRunning) {
      int opcionMenu;
      try {
        opcionMenu = menu();
      } catch (Exception e) {
        System.out.println("Algo ha ido mal");
        continue;
      }
      System.out.println("Esto no deberia imprimirse si se ha introducido un numero mal");
    }
  }
}
