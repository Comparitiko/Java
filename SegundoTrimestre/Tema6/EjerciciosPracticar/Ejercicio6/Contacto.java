package SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio6;

import java.util.Objects;

public class Contacto {

  // Props
  private String nombre;
  private int telefono;

  // Constructors
  public Contacto(String nombre, int telefono) {
    this.nombre = nombre;
    this.telefono = telefono;
  }

  // Getters and Setters


  public String getNombre() {
    return nombre;
  }

  public int getTelefono() {
    return telefono;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Contacto{");
    sb.append("nombre='").append(nombre).append('\'');
    sb.append(", telefono=").append(telefono);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    Contacto contacto = (Contacto) o;
    return Objects.equals(nombre, contacto.nombre);
  }

  public String pintar() {
    StringBuffer sb = new StringBuffer("Nombre: ").append(this.nombre);
    sb.append(", Teléfono: ").append(this.telefono);
    return sb.toString();
  }

}
