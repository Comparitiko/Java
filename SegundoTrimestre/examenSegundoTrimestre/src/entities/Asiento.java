package entities;

import java.util.Objects;

public abstract class Asiento {
  // Props
  protected Long id;
  protected Pasajero pasajero;
  protected Double precioBase;
  protected Integer fila;
  protected String letra;
  protected TipoAsiento tipo;

  // Constructor
  public Asiento(Long id, Double precioBase, Integer fila, String letra) {
    this.id = id;
    this.precioBase = precioBase;
    this.fila = fila;
    this.letra = letra;
  }

  // Getters and Setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Pasajero getPasajero() {
    return pasajero;
  }

  public void setPasajero(Pasajero pasajero) {
    this.pasajero = pasajero;
  }

  public Double getPrecioBase() {
    return precioBase;
  }

  public void setPrecioBase(Double precioBase) {
    this.precioBase = precioBase;
  }

  public Integer getFila() {
    return fila;
  }

  public void setFila(Integer fila) {
    this.fila = fila;
  }

  public String getLetra() {
    return letra;
  }

  public void setLetra(String letra) {
    this.letra = letra;
  }

  public TipoAsiento getTipo() {
    return tipo;
  }

  public void setTipo(TipoAsiento tipo) {
    this.tipo = tipo;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Asiento{");
    sb.append("id=").append(id);
    sb.append(", pasajero=").append(pasajero.getNombre());
    sb.append(", precioBase=").append(precioBase);
    sb.append(", fila=").append(fila);
    sb.append(", letra='").append(letra).append('\'');
    sb.append(", tipo=").append(tipo);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Asiento asiento = (Asiento) o;
    return Objects.equals(id, asiento.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  /**
   * Metodo para crear un codigo juntando la fila y la letra
   * @return codigo de asiento
   */
  public String getCodigo () {
    StringBuffer sb = new StringBuffer(fila).append(letra);
    return sb.toString();
  }

  // Metodo que devuelve el precio del asiento
  public abstract Double calcularPrecio();
}
