package SegundoTrimestre.Tema5.EjerciciosPracticar.Ejercicio6;

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
    if (o == null || getClass() != o.getClass()) return false;
    Contacto contacto = (Contacto) o;
    return Objects.equals(nombre, contacto.nombre);
  }

}
