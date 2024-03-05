package entities;

public class AsientoBusinness extends Asiento {
  // Props
  private Boolean comida;

  // Constructor

  public AsientoBusinness(Long id, Double precioBase, Integer fila, String letra, Boolean comida) {
    super(id, precioBase, fila, letra);
    this.comida = comida;
    this.tipo = TipoAsiento.BUSINESS;
  }

  // Getters and Setters
  public Boolean getComida() {
    return comida;
  }

  public void setComida(Boolean comida) {
    this.comida = comida;
  }

  // Methods

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("AsientoTurista{");
    sb.append(this.getCodigo()).append(", ");
    sb.append(this.calcularPrecio()).append(", ");
    sb.append(this.tipo).append(", ");
    sb.append("comida: ").append(this.comida).append(", ");
    sb.append(this.pasajero.getDniPasaporte());
    sb.append('}');
    return sb.toString();
  }

  /**
   * Metodo que calcula el precio
   * Aumenta un 25% el precio base
   * si incluye comida aumenta 30, si no no
   * @return
   */
  @Override
  public Double calcularPrecio() {
    Double precio = precioBase * 1.25;
    if (this.comida) precio += 30;
    return precio;
  }
}
