package SegundoTrimestre.Tema5.EjerciciosPracticar.Ejercicio3;
import java.util.ArrayList;

public class Libreria {

  // Props
  private ArrayList<Libro> libros = new ArrayList<>(1000);
  private String nombre;

  // Constructors
  public Libreria(String nombre) {
    this.nombre = nombre;
  }

  // Methods

  /**
   * Añade un libro a la lista de libros.
   * @param libro el libro a añadir.
   * @param precioCompra el precio de la compra.
   */
  public void adquirirLibro(Libro libro, double precioCompra) {
    libros.add(libro);
    libro.setPrecioCompra(precioCompra);
  }

  /**
   * Pone un libro de la lista de libros como vendido.
   * @param libro Libro a poner como vendido.
   * @param precioVenta precio de la venta.
   */
  public void venderLibro (Libro libro, double precioVenta) {
    libro.setPrecioVenta(precioVenta);
    libro.setVendido(true);
  }

  public double calcularGanancias () {
    double ganancia = 0;
    for (Libro libro : libros) {
      if (libro.isVendido()) {
        ganancia += libro.getPrecioVenta() - libro.getPrecioCompra();
      }
    }
    return ganancia;
  }
}
