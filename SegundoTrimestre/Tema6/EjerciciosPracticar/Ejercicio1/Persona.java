package SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio1;

import java.util.Objects;

public class Persona {

  public enum Sexo {H, M, O}

  private String nombre;
  private int edad;
  private String dni;
  private Sexo sexo;
  private double peso;
  private double altura;

  // Constructors

  public Persona() {
    this.nombre = "";
    this.dni = "";
    this.sexo = Sexo.H;
  }

  public Persona(String nombre, String dni, Sexo sexo) {
    this.nombre = nombre;
    this.dni = dni;
    this.sexo = sexo;
  }

  public Persona(String nombre, int edad, String dni, Sexo sexo, double peso, double altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.dni = dni;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
  }

  public Persona (Persona p) {
    this.nombre = p.getNombre();
    this.edad = p.getEdad();
    this.dni = p.getDni();
    this.sexo = p.getSexo();
    this.peso = p.getPeso();
    this.altura = p.getAltura();
  }

  // Getters and setters

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

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public Sexo getSexo() {
    return sexo;
  }

  public void setSexo(Sexo sexo) {
    this.sexo = sexo;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  // Methods

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Persona{");
    sb.append("nombre='").append(nombre).append('\'');
    sb.append(", edad=").append(edad);
    sb.append(", dni='").append(dni).append('\'');
    sb.append(", sexo=").append(sexo);
    sb.append(", peso=").append(peso);
    sb.append(", altura=").append(altura);
    sb.append('}');
    return sb.toString();
  }

  /**
   * Metodo para calcular el imc segun el peso y altura de la persona
   * @return si devuelve -1 la persona tiene sobrepeso, si devuelve 0 esta en su peso ideal
   * y si devuelve 1 esta por debajo de su peso ideal
   */
  public int calcularIMC() {
    double imc = this.peso / Math.pow(this.altura, 2);
    if (imc > 25) return -1;
    else if (imc <= 25 && imc >= 20) return 0;
    else return 1;
  }

  /**
   * Metodo para saber si la persona es mayor de edad
   * @return true si la persona es mayor de edad
   */
  public boolean esMayorDeEdad () {
    return this.edad >= 18;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Persona persona = (Persona) o;
    return Objects.equals(dni, persona.dni);
  }
}
