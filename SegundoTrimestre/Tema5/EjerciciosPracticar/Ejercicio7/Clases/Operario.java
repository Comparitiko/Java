package SegundoTrimestre.Tema5.EjerciciosPracticar.Ejercicio7.Clases;

public class Operario extends Empleado {
  // Props
  private boolean haceHorasExtra;

  public Operario(String nombre, int edad, double salario, boolean haceHorasExtra) {
    super(nombre, edad, salario);
    this.haceHorasExtra = haceHorasExtra;
  }
}
