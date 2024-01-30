package SegundoTrimestre.Tema5.EjerciciosPracticar.Ejercicio8;

public class TarjetaCredito extends Tarjeta {
  // Props
  private double credito;

  // Constructor
  public TarjetaCredito(String numeroTarjeta, String nombrePropietario, double credito) {
    super(numeroTarjeta, nombrePropietario);
    this.credito = credito;
  }

  // Getters and Setters
  public double getCredito() {
    return credito;
  }

  public void setCredito(double credito) {
    this.credito = credito;
  }

}
