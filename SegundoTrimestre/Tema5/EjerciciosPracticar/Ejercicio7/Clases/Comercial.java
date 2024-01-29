package SegundoTrimestre.Tema5.EjerciciosPracticar.Ejercicio7.Clases;

public class Comercial extends Empleado {
  // Props
  private double comision;

  // Constructors
  public Comercial(String nombre, int edad, double salario, double comision) {
    super(nombre, edad, salario);
    this.comision = comision;
  }

  // Getters and Setters
  public double getComision() {
    return comision;
  }

  public void setComision(double comision) {
    this.comision = comision;
  }

  // Methods

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Comercial{");
    sb.append("comision=").append(comision);
    sb.append(super.toString());
    sb.append('}');
    return sb.toString();
  }

  /**
   * Metodo que comprueba si el empleado tiene mas de 30 años y tiene una comision mayor a 200.
   * @return true si el empleado tiene mas de 30 años y tiene una comision mayor a 200, false en otro caso.
   */
  public boolean plus () {
    return this.getEdad() > 30 && this.comision > 200;
  }
}
