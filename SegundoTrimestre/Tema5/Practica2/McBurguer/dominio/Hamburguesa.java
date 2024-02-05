package SegundoTrimestre.Tema5.Practica2.McBurguer.dominio;
import java.time.LocalDate;

/*
El precio de una hamburguesa es de 3,50 €.
Si falta 1 día para que caduque, se le hará un descuento del 50 %.
Si faltan 2 días para que caduque, se le hará un descuento del 40 %.
Si faltan 3 días para que caduque, se le hará un descuento del 30 %.
Si faltan 4 días para que caduque, se le hará un descuento del 20 %.
*/

public class Hamburguesa extends Comida{

  // Props
  private LocalDate fechaCaducidad;

  // Constructors
  public Hamburguesa(String fechaCaducidad) {
    super("Hamburguesa", "Comida");
    this.fechaCaducidad = crearLocalDate(fechaCaducidad);
  }

  // Methods
  public void cocinar() {
    this.cocinado = true;
  }


  @Override
  public double obtenerPrecio() {
    double precio = 3.50;
    return precio;
  }

  public void compararFecha () {
    System.out.println();
  }

  private LocalDate crearLocalDate(String date) {
    String[] splitDate = date.split("/");
    StringBuffer sb = new StringBuffer(date.length());
    sb.append(splitDate[2]).append("-");
    sb.append(splitDate[1]).append("-");
    sb.append(splitDate[0]);
    return LocalDate.parse(sb.toString());
  }
}
