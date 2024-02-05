package SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio3;

public class TestLibreria {
  public static void main(String[] args) {
    Libreria libreria1 = new Libreria("Libreria 1");
    for (int i = 0; i < 20; i++) {
      Libro libro = new Libro(i, "Libro " + i, "Autor" + i, 200);
      libreria1.adquirirLibro(libro, (1.5 + i));
      libreria1.venderLibro(libro, libro.getPrecioCompra() * 1.2);
    }

    System.out.println("Las ganancias son: " + libreria1.calcularGanancias());
  }
}
