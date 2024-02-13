package SegundoTrimestre.Tema7.PracticaClase.entities;

public abstract class Producto implements Transportable {

  // Props
  protected String nombre;
  protected double peso;

  // Constructor
  public Producto(String nombre, double peso) {
    this.nombre = nombre;
    this.peso = peso;
  }

  // Getters and Setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Producto{");
    sb.append("nombre='").append(nombre).append('\'');
    sb.append(", peso=").append(peso);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public double calcularCostoEnvio(boolean esInternacional) {
    double costo = 20;
    costo += this.peso * 0.2;
    if (esInternacional) costo += 30;
    return costo;
  }
}