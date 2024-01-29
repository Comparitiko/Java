package SegundoTrimestre.Tema5.EjerciciosPracticar.Ejercicio4;

public class TestProducto {
  public static void main(String[] args) {
    Producto p1 = new Producto(1, "Laptop", 1000, 10, 100, 0.25);

    if (p1.vender(5)) {
      System.out.println("Vendidos 5 laptops");
    } else {
      System.out.println("No se puede vender 5 laptops");
    }

    System.out.println("Cantidad de laptops repuestas: " + p1.reponer());

    if (p1.vender(996)) {
      System.out.println("Vendidos 996 laptops");
    } else {
      System.out.println("No se puede vender 996 laptops");
    }

    if (p1.vender(5)) {
      System.out.println("Vendidos 5 laptops");
    } else {
      System.out.println("No se puede vender 5 laptops");
    }

  }
}
