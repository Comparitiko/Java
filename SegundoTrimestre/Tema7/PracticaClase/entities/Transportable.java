package SegundoTrimestre.Tema7.PracticaClase.entities;

public interface Transportable {
  /**
   * Metodo para calcular costo de envio de objeto tranporatble
   * @param esInternacional boolean para saber si es internacional
   * @return costo del envio del objeto
   */
  public double calcularCostoEnvio (boolean esInternacional);
}
