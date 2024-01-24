package SegundoTrimestre.Tema5.ejemplos.productos;

public class TestTienda {
  public static void main(String[] args) {
    Producto p1 = new Producto(100, "p1");
    Producto p2 = new Producto(200, "p2");
    Producto p3 = new Producto(300, "p3");
    Tienda t1 = new Tienda("t1");
    t1.addProducto(p1);
    t1.addProducto(p2);
    t1.addProducto(p3);
    System.out.println(t1.getProductos());

    for (Producto pr : t1.getProductos()) {
      System.out.println("Nombre del producto: " + pr.getNombre() + " " + pr.getPrecio());
    }
  }
}
