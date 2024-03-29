package SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio7.Clases.Operarios;

import SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio7.Clases.Operario;

public class Repartidor extends Operario {
  // Props
  private String zona;

  // Constructors
  public Repartidor(String nombre, int edad, double salario, boolean haceHorasExtra, String zona) {
    super(nombre, edad, salario, haceHorasExtra);
    this.zona = zona;
  }

  // Getters and Setters
  public String getZona() {
    return zona;
  }

  public void setZona(String zona) {
    this.zona = zona;
  }

  // Methods

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Repartidor{");
    sb.append("zona='").append(zona).append('\'');
    sb.append(super.toString());
    sb.append('}');
    return sb.toString();
  }

  /**
   * Metodo que comprueba si el empleado tiene menos de 25 años y trabaja en la zona 3 y si cumple con que hace horas extra aumenta el plus
   * @return true si el empleado tiene menos de 25 años y trabaja en zona 3, false en otro caso.
   */
  public boolean plus () {
    if (this.getEdad() < 25 && this.zona.equals("Zona 3")) {
      if (this.isHaceHorasExtra()) this.setPlus(this.getPlus() * 2);
      return true;
    }
    return false;
  }
}
