package SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio5;
import SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio4.Producto;

public class TestTienda {
  public static void main(String[] args) {
    Tienda tienda1 = new Tienda("Tienda 1");
    tienda1.adquirirProd(new Producto(1, "Laptop", 300, 10, 100, 0.25));
    tienda1.adquirirProd(new Producto(2, "Tablet", 200, 10, 100, 0.25));
    tienda1.adquirirProd(new Producto(3, "PC", 1500, 1, 100, 0.25));
    tienda1.adquirirProd(new Producto(4, "Teclado", 27, 10, 100, 0.25));

    System.out.println("Los productos de la tienda 1 son: " + tienda1);

    if (tienda1.venderProd(4)) System.out.println("Se ha vendido el producto con id 4");
    else System.out.println("No se ha podido vender el producto con id 4");

    if (tienda1.venderProd(3)) System.out.println("Se ha vendido el producto con id 3");
    else System.out.println("No se ha podido vender el producto con id 3");

    System.out.println("Despues de las ventas hay beneficios de: " + tienda1.getVentas());

    System.out.println("Los productos de la tienda 1 despues de las ventas son: " + tienda1);

  }
}
