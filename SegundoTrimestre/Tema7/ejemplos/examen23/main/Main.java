package SegundoTrimestre.Tema7.ejemplos.examen23.main;

import SegundoTrimestre.Tema7.ejemplos.examen23.entities.*;
import SegundoTrimestre.Tema7.ejemplos.examen23.services.Tienda;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void menu () {
    System.out.println("---- Menu ----");
    System.out.println("1. Mostrar inventario");
    System.out.println("2. Buscar producto");
    System.out.println("3. Mostrar compras");
    System.out.println("4. Mostrar compras por mes");
    System.out.println("5. Hacer compra");
    System.out.println("6. Salir");
  }

  public static Ropa crearRopa() {
    return new Ropa("hola", "ass", 1.4, 10, Talla.XL, "Rojo", TipoRopa.Sudadera);
  }

  public static Zapatilla crearZapatilla() {
    return new Zapatilla("zapa", "ass", 1.4, 10, Numero.N36, Categoria.Baloncesto);
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Tienda t1 = new Tienda();
    Ropa r1 = new Ropa("Camiseta 1",
            "Camiseta sencilla", 24.39,
            10, Talla.XL, "Rojo", TipoRopa.Camiseta);
    Ropa r2 = new Ropa("Pantalon 1",
            "Pantalon sencillo", 10.99,
            20, Talla.S, "Azul", TipoRopa.Pantalon);
    Ropa r3 = new Ropa("Sudadera 2",
            "Sudadera sencilla", 59.99,
            5, Talla.L, "Rojo", TipoRopa.Sudadera);
    Zapatilla z1 = new Zapatilla("Zapatilla 1", "Zapatillas sencillas",
            29.99, 10, Numero.N36, Categoria.Futbol);
    Zapatilla z2 = new Zapatilla("Chancla 1", "Chanclas sencillas",
            59.99, 5, Numero.N48, Categoria.Chanclas);
    Zapatilla z3 = new Zapatilla("Zapatilla 2", "Zapatillas sencillas",
            69.69, 20, Numero.N45, Categoria.Baloncesto);

    t1.addProducto(r1);
    t1.addProducto(r2);
    t1.addProducto(r3);
    t1.addProducto(z1);
    t1.addProducto(z2);
    t1.addProducto(z3);

    int opcion = 0;
    while (opcion != 6) {
      menu();
      System.out.print("Ingrese una opción: ");
      opcion = Integer.parseInt(sc.nextLine());
      switch (opcion) {
        case 1:
          System.out.println(t1.mostrarInventario());
          break;
        case 2:
          System.out.println("Ingrese el texto a buscar en eel nombre de un producto");
          String texto = sc.nextLine();
          ArrayList<Producto> productos = t1.buscarProducto(texto);
          if (productos.size() == 0) System.out.println("El numero de productos con ese texto es 0");
          else {
            for (Producto producto : productos) {
              System.out.println("Nombre: " + producto.getNombre());
              System.out.println("ID: " + producto.getCodigo());
              System.out.println("Precio: " + producto.getPrecio());
              System.out.println();
            }
          }
          break;
        case 3:
          System.out.println(t1.mostrarCompras());
          break;
        case 4:
          System.out.println("Mostrar compras por mes");
          System.out.println("Ingrese el mes a buscar");
          try {
            int mes = Integer.parseInt(sc.nextLine());
            System.out.println(t1.mostrarCompras(mes));
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;
        case 5:
          Compra compra = new Compra();
          int id = 0, cantidad = 0;
          while (true) {
            try {
              System.out.println("Ingrese el id del producto, tiene que ser un numero positivo");
              id = Integer.parseInt(sc.nextLine());
              System.out.println("Ingrese la cantidad a comprar, tiene que ser un numero positivo");
              cantidad = Integer.parseInt(sc.nextLine());
              if (cantidad < 0 || id < 0) throw new Exception();
              break;
            } catch (Exception e) {
              System.out.println("La proxima vez ingrese una id y una cantidad correcta");
            }
            int opcionProducto = 0;
            Producto producto = null;
            while (opcionProducto != 1 && opcionProducto != 2) {
              System.out.println("Que tipo de producto quieres");
              System.out.println("1. Ropa");
              System.out.println("2. Zapatilla");
              System.out.println("Ingrese una opcion");
              try {
                opcionProducto = Integer.parseInt(sc.nextLine());
              } catch (Exception e) {
                System.out.println("Ingrese una opcion valida");
              }
              if (opcionProducto == 1) {
                producto = crearRopa();
                LineaCompra lineaCompra = new LineaCompra(producto, cantidad);
                break;
              } else if (opcionProducto == 2) {
                producto = crearZapatilla();
                LineaCompra lineaCompra = new LineaCompra(producto, cantidad);
                break;
              }
            }

          }

          break;
        case 6:
          System.out.println("Salir");
          break;
        default:
          System.out.println("Opción incorrecta");
      }
    }

  }
}
