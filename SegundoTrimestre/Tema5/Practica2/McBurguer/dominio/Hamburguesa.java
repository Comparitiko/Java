package SegundoTrimestre.Tema5.Practica2.McBurguer.dominio;
import java.time.LocalDate

public class Hamburguesa extends Comida{

  // Props
  private String fechaCaducidad;

  // Constructors

  public Hamburguesa(String fechaCaducidad) {
    super();
    this.fechaCaducidad = fechaCaducidad;
  }
}
