package SegundoTrimestre.Tema7.PracticaClase.services;

import java.util.ArrayList;

public class ServicioEnvio {

  // Props
  private ArrayList<Envio> envios;

  // Constructor

  public ServicioEnvio() {
    this.envios = new ArrayList<Envio>();
  }

  // Methods

  /**
   * Metodo para agregar un envio al servicio
   * @param envio envio a añadir
   */
  public void agregarEnvio(Envio envio) {
    this.envios.add(envio);
  }

  /**
   * Metodo para generar el informe de todos los envios
   * @return String con todo el informe
   */
  public String generarInformeEnvios () {
    StringBuffer sb = new StringBuffer();
    for (Envio envio : this.envios) {
      sb.append(envio.listarProductos()).append(", ");
      sb.append("Costo del envio: ");
      sb.append(envio.calcularCostoEnvio()).append(", ");
      sb.append("Dias transcurridos: ");
      sb.append(envio.diasTranscurridos());
      sb.append("\n");
    }
    return sb.toString();
  }
}
