package SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio7.Clases.Operarios;

import SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio7.Clases.Operario;

public class MozoAlmacen extends Operario {
  // Props
  private String peligrosidad;

  // Constructors
  public MozoAlmacen(String nombre, int edad, double salario, boolean haceHorasExtra, String peligrosidad) {
    super(nombre, edad, salario, haceHorasExtra);
    this.peligrosidad = peligrosidad;
  }

  // Getters and Setters
  public String getPeligrosidad() {
    return peligrosidad;
  }

  public void setPeligrosidad(String peligrosidad) {
    this.peligrosidad = peligrosidad;
  }

  // Methods

  /**
   * Método que da el plus si cumple con la peligrosidad 2 o 3 y su edad es menor a 30, Además multiplica el plus por 2 si hace horas extra.
   * @return
   */
  public boolean plus () {
    if ((this.peligrosidad.equals("Peligrosidad 2") || this.peligrosidad.equals("Peligrosidad 3")) && this.getEdad() < 30) {
      if (this.isHaceHorasExtra()) this.setPlus(this.getPlus() * 2);
      return true;
    }
    return false;
  }
}
