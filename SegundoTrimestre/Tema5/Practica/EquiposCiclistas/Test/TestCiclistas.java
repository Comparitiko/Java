package SegundoTrimestre.Tema5.Practica.EquiposCiclistas.Test;

import java.util.Scanner;

public class TestCiclistas {
  /**
   * Imprime un menu y pide la opcion del menu
   * @return opcion del menu
   * @throws Exception si la opcion del menu no coincide con ninguna
   */
  public static int menu () throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("---- Menu ----");
    System.out.println("1. Imprimir datos del equipo");
    System.out.println("2. Añadir un ciclista al equipo");
    System.out.println("3. Calcular el total de tiempos de los ciclistas del equipo");
    System.out.println("4. Listar nombres de los ciclistas");
    System.out.println("5. Buscar ciclista");
    System.out.println("6. Salir");
    int opcionMenu = Integer.parseInt(sc.nextLine());
    if (opcionMenu < 1 || opcionMenu > 6) throw new Exception("Ingrese un numero entre 1 y 6");
    return opcionMenu;
  }

  public static void main(String[] args) {
    int opcionMenu = 0;
    do {
      try {
        opcionMenu = menu();
      } catch (Exception e) {
        System.out.println("Opcion no valida");
        continue;
      }

      switch (opcionMenu) {
        case 1:
          System.out.println("Datos del equipo");
          break;
        case 2:
          System.out.println("Añadir un ciclista al equipo");
          break;
        case 3:
          System.out.println("Calcular el total de tiempos de los ciclistas del equipo");
          break;
        case 4:
          System.out.println("Listar nombres de los ciclistas");
          break;
        case 5:
          System.out.println("Buscar ciclista");
          break;
        case 6:
          System.out.println("Saliendo...");
          break;
      }
    } while (opcionMenu != 6);
  }
}
