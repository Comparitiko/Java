package SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio8;

import java.util.Objects;

public class Tarjeta {
  // Props
  private String numeroTarjeta;
  private String nombrePropietario;

  // Constructor
  public Tarjeta(String numeroTarjeta, String nombrePropietario) {
    this.numeroTarjeta = numeroTarjeta;
    this.nombrePropietario = nombrePropietario;
  }

  // Getters and Setters
  public String getNumeroTarjeta() {
    return numeroTarjeta;
  }

  public void setNumeroTarjeta(String numeroTarjeta) {
    this.numeroTarjeta = numeroTarjeta;
  }

  public String getNombrePropietario() {
    return nombrePropietario;
  }

  public void setNombrePropietario(String nombrePropietario) {
    this.nombrePropietario = nombrePropietario;
  }

  // Methods
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Tarjeta tarjeta = (Tarjeta) o;
    return Objects.equals(numeroTarjeta, tarjeta.numeroTarjeta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroTarjeta);
  }
}
