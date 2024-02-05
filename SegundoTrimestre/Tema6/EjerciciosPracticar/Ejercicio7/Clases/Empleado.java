package SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio7.Clases;

class Empleado {

  // Props
  private String nombre;
  private int edad;
  private double salario;
  private double plus = 300;

  // Constructors
  protected Empleado(String nombre, int edad, double salario) {
    this.nombre = nombre;
    this.edad = edad;
    this.salario = salario;
  }

  // Getters and Setters

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getPlus() {
    return plus;
  }

  public void setPlus(double plus) {
    this.plus = plus;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Empleado{");
    sb.append("nombre='").append(nombre).append('\'');
    sb.append(", edad=").append(edad);
    sb.append(", salario=").append(salario);
    sb.append(", plus=").append(plus);
    sb.append('}');
    return sb.toString();
  }
}
