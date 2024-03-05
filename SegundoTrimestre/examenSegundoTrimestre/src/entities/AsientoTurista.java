package entities;

public class AsientoTurista extends Asiento {
  // Props
  private Boolean ventana;

  // Contructor
  public AsientoTurista(Long id, Double precioBase, Integer fila, String letra, Boolean ventana) {
    super(id, precioBase, fila, letra);
    this.ventana = ventana;
    this.tipo = TipoAsiento.TURISTA;
  }

  // Getters and Setters
  public Boolean getVentana() {
    return ventana;
  }

  public void setVentana(Boolean ventana) {
    this.ventana = ventana;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("AsientoTurista{");
    sb.append(this.getCodigo()).append(", ");
    sb.append(this.calcularPrecio()).append(", ");
    sb.append(this.tipo).append(", ");
    sb.append("ventana: ").append(ventana).append(", ");
    sb.append(this.pasajero.getDniPasaporte());
    sb.append('}');
    return sb.toString();
  }

  /**
   * Metodo que devuelve el precio del asiento
   * dependiendo si esta en ventana o no
   * @return precio
   */
  @Override
  public Double calcularPrecio() {
    if (this.ventana) return precioBase + 10;
    else return precioBase;
  }

}
