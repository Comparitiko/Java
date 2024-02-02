package SegundoTrimestre.Tema5.EjerciciosPracticar.Ejercicio6;
import java.util.Scanner;

public class TestAgenda {

  public static void menu () {
    System.out.println("AGENDA TELÉFONICA");
    System.out.println("------------------");
    System.out.println("1. Añadir un nuevo contacto");
    System.out.println("2. Listar todos los contactos");
    System.out.println("3. Buscar un contacto por su nombre");
    System.out.println("4. Eliminar un contacto");
    System.out.println("5. Salir");
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Agenda agenda = new Agenda();
    while (true) {
      menu();
      int opcion = Integer.parseInt(sc.nextLine());
      if (opcion == 5) break;

      switch (opcion) {
        case 1:
          System.out.println("Ingrese el nombre del contacto");
          String nombre = sc.nextLine();

          System.out.println("Ingrese el número de teléfono del contacto");
          int telefono = Integer.parseInt(sc.nextLine());
          System.out.println("Que tipo de contacto quiere crear");
          System.out.println("1. Empresa");
          System.out.println("2. Personal");
          int tipo = Integer.parseInt(sc.nextLine());
          switch (tipo) {
            case 1:
              System.out.println("Ingrese el CIF");
              String cif = sc.nextLine();
              System.out.println("Ingrese el email");
              String email = sc.nextLine();
              if (agenda.addContacto(new ContactoEmpresa(nombre, telefono, cif, email))) System.out.println("El contacto se añadio correctamente");
              else System.out.println("El contacto ya existe");
              break;
            case 2:
              System.out.println("Ingrese el apodo");
              String apodo = sc.nextLine();
              if (agenda.addContacto(new ContactoPersona(nombre, telefono, apodo))) System.out.println("El contacto se añadio correctamente");
              else System.out.println("El contacto ya existe");
          }
          break;
        case 2:
          System.out.println("Los contactos son:");
          System.out.println(agenda.listarContactos());
          break;
        case 3:
          System.out.println("Ingrese el nombre del contacto");
          String nombreBuscar = sc.nextLine();

          if (agenda.buscarContacto(nombreBuscar) != -1) {
            System.out.println("El número de teléfono del contacto es: " + agenda.buscarContacto(nombreBuscar));
          } else {
            System.out.println("El contacto no existe");
          }
          break;
        case 4:
          System.out.println("Ingrese el nombre del contacto");
          String nombreContacto = sc.nextLine();

          agenda.eliminarContacto(new Contacto(nombreContacto, -1));
          break;
        default:
          System.out.println("Opción no válida");
      }
    }
  }
}
