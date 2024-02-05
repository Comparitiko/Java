package SegundoTrimestre.Tema5.Ejercicios_POO.Ejercicio8;

public class Consumo {
  // Props
  private double  kms;
  private double litros;
  private double vmed;
  private double pgas;

  // Constructor
  public Consumo(double kms, double litros, double vmed, double pgas) {
    this.kms = kms;
    this.litros = litros;
    this.vmed = vmed;
    this.pgas = pgas;
  }

  // Getters and Setters
  public void setKms(double kms) {
    this.kms = kms;
  }

  public void setLitros(double litros) {
    this.litros = litros;
  }

  public void setVmed(double vmed) {
    this.vmed = vmed;
  }

  public void setPgas(double pgas) {
    this.pgas = pgas;
  }

  // Methods
  public double getTiempo () {
    return this.kms / this.vmed;
  }

  public double consumoMedio () {
    return 100 * this.litros / this.kms;
  }

  public double consumoEuros () {
    return 100 * this.pgas / this.kms;
  }
}