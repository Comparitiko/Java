package SegundoTrimestre.Tema5.Practica.EquiposCiclistas.Test;

import SegundoTrimestre.Tema5.Practica.EquiposCiclistas.Clases.*;

import java.util.Scanner;

public class TestCiclistas {

  static Scanner sc = new Scanner(System.in);

  /**
   * Imprime un menu y pide la opcion del menu
   * @return opcion del menu
   * @throws Exception si la opcion del menu no coincide con ninguna
   */
  public static int menu () throws Exception {
    System.out.println("---- Menu ----");
    System.out.println("1. Imprimir datos del equipo");
    System.out.println("2. Añadir un ciclista al equipo");
    System.out.println("3. Calcular el total de tiempos de los ciclistas del equipo");
    System.out.println("4. Listar nombres de los ciclistas");
    System.out.println("5. Buscar ciclista");
    System.out.println("6. Salir");
    int opcionMenu = Integer.parseInt(sc.nextLine());
    sc.close();
    if (opcionMenu < 1 || opcionMenu > 6) throw new Exception("Ingrese un numero entre 1 y 6");
    return opcionMenu;
  }

  /**
   * Pide los datos del ciclista a ser añadido al equipo
   */
  public static void aniadirCiclista() {

    System.out.println("Ingresa el identificador del ciclista");
    int identificadorCiclista = Integer.parseInt(TestCiclistas.sc.nextLine());
    System.out.println("Ingresa el nombre del ciclista");
    String nombreCiclista = TestCiclistas.sc.nextLine();

    int opcionTipoCiclista = 0;

    do {
      try {
        opcionTipoCiclista = menuAgregarTipoCiclista();
      } catch (Exception e) {
        System.out.println("Opcion no valida");
        continue;
      }

      switch (opcionTipoCiclista) {
        case 1:
          new Escalador(identificadorCiclista, nombreCiclista);
          break;
        case 2:
          new Velocista(identificadorCiclista, nombreCiclista);
          break;
        case 3:
          new Contrarrelojista(identificadorCiclista, nombreCiclista);
          break;
      }

    } while (opcionTipoCiclista < 1 || opcionTipoCiclista > 3);
  }

  /**
   * Muestra un menu para agregar un tipo de ciclista
   * @return opcion del menu elegida
   * @throws Exception si la opcion del menu no coincide con ninguna
   */
  public static int menuAgregarTipoCiclista() throws Exception {
    System.out.println("-- Tipo Ciclista --");
    System.out.println("1. Escalador");
    System.out.println("2. Velocista");
    System.out.println("3. Contrarrelojista");
    int opcionTipoCiclista = Integer.parseInt(TestCiclistas.sc.nextLine());
    if (opcionTipoCiclista < 1 || opcionTipoCiclista > 3) throw new Exception("Ingrese un numero que coincida con el tipo");
    return opcionTipoCiclista;
  }

  public static void main(String[] args) {

    Equipo equipo = new Equipo("Equipo 1", "España");
    int opcionMenu = 0;
    // Bucle para que vaya saliendo el menu hasta pulsar 6
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
          System.out.println(equipo);
          break;
        case 2:
          System.out.println("Añadir un ciclista al equipo");
          aniadirCiclista();
          break;
        case 3:
          System.out.println("Calcular el total de tiempos de los ciclistas del equipo");
          System.out.println(equipo.calcularTiemposCarrera());
          break;
        case 4:
          System.out.println("Listar nombres de los ciclistas");
          System.out.println(equipo.listarCiclistas());
          break;
        case 5:
          System.out.println("Buscar ciclista");
          System.out.println("Ingrese el identificador del ciclista a buscar");
          System.out.println(equipo.buscarCiclista(Integer.parseInt(sc.nextLine())));
          break;
        case 6:
          System.out.println("Saliendo...");
          break;
      }
    } while (opcionMenu != 6);
    TestCiclistas.sc.close();
  }
}
