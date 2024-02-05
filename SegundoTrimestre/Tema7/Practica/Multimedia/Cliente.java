package SegundoTrimestre.Tema7.Practica.Multimedia;

import java.util.Objects;

public abstract class Cliente {

  // Props
  protected String dni;
  protected String nombre;
  protected String email;
  protected double precioMensual;

  // Constructors
  public Cliente () {
    this.dni = "";
    this.nombre = "";
    this.email = "";
  }

  public Cliente(String dni, String nombre, String email) {
    this.dni = dni;
    this.nombre = nombre;
    this.email = email;
  }

  // Getters y Setters
  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPrecioMensual(double precioMensual) {
    this.precioMensual = precioMensual;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Cliente{");
    sb.append("dni='").append(dni).append('\'');
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append(", email='").append(email).append('\'');
    sb.append(", precioMensual=").append(precioMensual);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    Cliente cliente = (Cliente) o;
    return Objects.equals(dni, cliente.dni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dni);
  }

  public abstract boolean esPro ();
  public abstract double getPrecioMensual ();
}
