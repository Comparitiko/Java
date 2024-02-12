package SegundoTrimestre.Tema7.PracticaClase.entities;

public class ProductoFragil extends Producto {

  // Props
  private int nivelFragil;

  // Constructor
  public ProductoFragil(String nombre, double peso, int nivelFragil) {
    super(nombre, peso);
    this.nivelFragil = nivelFragil;
  }

  // Methods


  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("ProductoFragil{");
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append(", peso=").append(peso);
    sb.append("nivelFragil=").append(nivelFragil);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public double calcularCostoEnvio(boolean esInternacional) {
    double costo = super.calcularCostoEnvio(esInternacional);
    if (this.nivelFragil == 1) costo += 20;
    else costo += 50;
    return costo;
  }
}
