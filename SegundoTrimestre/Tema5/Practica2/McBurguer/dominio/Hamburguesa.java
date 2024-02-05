package SegundoTrimestre.Tema5.Practica2.McBurguer.dominio;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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

  /**
   * Cocinar la hamburguesa
   */
  public void cocinar() {
    this.cocinado = true;
  }


  @Override
  /**
   * Obtener el precio de la hamburguesa
   */
  public double obtenerPrecio() {
    double precio = 3.50;
    if (diasParaCaducar() == -1) return precio * 0.50;
    else if (diasParaCaducar() == -2) return precio * 0.40;
    else if (diasParaCaducar() == -3) return precio * 0.30;
    else if (diasParaCaducar() == -4) return precio * 0.20;
    else return precio;
  }

  /**
   * Calcular diferencia de días entre una fecha y otra
   * @return dias diferencia
   */
  private int diasParaCaducar () {
    return (int) ChronoUnit.DAYS.between(LocalDate.now(), this.fechaCaducidad);
  }

  /**
   * Crear una fecha tipo localDate
   * @param date fecha en String con formato dd/mm/yyyy
   * @return devuelve un LocalDate de esa fecha
   */
  private LocalDate crearLocalDate(String date) {
    String[] splitDate = date.split("/");
    StringBuffer sb = new StringBuffer(date.length());
    sb.append(splitDate[2]).append("-");
    sb.append(splitDate[1]).append("-");
    sb.append(splitDate[0]);
    return LocalDate.parse(sb.toString());
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Hamburguesa....... ");
    sb.append(this.obtenerPrecio()).append('€');
    return sb.toString();
  }
}
