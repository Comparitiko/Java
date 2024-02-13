package SegundoTrimestre.Tema7.PracticaClase.entities;

public class ProductoRefrigerado extends Producto{

  // Props
  private int nivelRefrigeracion;

  // Constructor
  public ProductoRefrigerado(String nombre, double peso, int nivelRefrigeracion) {
    super(nombre, peso);
    this.nivelRefrigeracion = nivelRefrigeracion;
  }

  // Methods

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("ProductoRefrigerado{");
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append(", peso=").append(peso);
    sb.append(", nivelRefrigeracion=").append(nivelRefrigeracion);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public double calcularCostoEnvio(boolean esInternacional) {
    double costo = super.calcularCostoEnvio(esInternacional);
    if (this.nivelRefrigeracion == 1) costo += 10;
    else costo += 30;
    return costo;
  }
}
