package SegundoTrimestre.Tema7.ejemplos.examen23.entities;

public class Ropa extends Producto{
  // Props
  private Talla talla;
  private String color;
  private TipoRopa tipoRopa;

  // Constructor


  public Ropa(String nombre, String descripcion, double precio, int unidadesStock, Talla talla, String color, TipoRopa tipoRopa) {
    super(nombre, descripcion, precio, unidadesStock);
    this.talla = talla;
    this.color = color;
    this.tipoRopa = tipoRopa;
  }

  public Ropa (Ropa ropa) {
    super(ropa);
    this.talla = ropa.getTalla();
    this.color = ropa.getColor();
    this.tipoRopa = ropa.getTipoRopa();
  }

  // Getters and Setters
  public Talla getTalla() {
    return talla;
  }

  public void setTalla(Talla talla) {
    this.talla = talla;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public TipoRopa getTipoRopa() {
    return tipoRopa;
  }

  public void setTipoRopa(TipoRopa tipoRopa) {
    this.tipoRopa = tipoRopa;
  }

  // Methods

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Ropa{");
    sb.append("talla=").append(talla);
    sb.append(", color='").append(color).append('\'');
    sb.append(", tipoRopa=").append(tipoRopa);
    sb.append(", codigo=").append(codigo);
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append(", descripcion='").append(descripcion).append('\'');
    sb.append(", precio=").append(precio);
    sb.append(", unidadesStock=").append(unidadesStock);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public double descuento() {
    double descuento = 0.3;
    if (this.talla == Talla.XS || this.talla == Talla.XXL) descuento = 0.5;
    return this.precio * (1 - descuento);
  }
}
