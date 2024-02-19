package SegundoTrimestre.Tema7.ejemplos.examen23.entities;

public class Zapatilla extends Producto{
  // Props
  private Numero numero;
  private Categoria categoria;

  // Constructor
  public Zapatilla(String nombre, String descripcion, double precio, int unidadesStock, Numero numero, Categoria categoria) {
    super(nombre, descripcion, precio, unidadesStock);
    this.numero = numero;
    this.categoria = categoria;
  }

  public Zapatilla (Zapatilla zapatilla) {
    super(zapatilla.nombre, zapatilla.descripcion, zapatilla.precio, zapatilla.unidadesStock);
    this.numero = zapatilla.numero;
    this.categoria = zapatilla.categoria;
  }

  // Getters and Setters
  public Numero getNumero() {
    return numero;
  }

  public void setNumero(Numero numero) {
    this.numero = numero;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Zapatilla{");
    sb.append("numero=").append(numero);
    sb.append(", categoria=").append(categoria);
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
    if (this.numero == Numero.N35 || this.numero == Numero.N47
            || this.numero == Numero.N48 || this.numero == Numero.N49
            || this.numero == Numero.N50) descuento = 0.5;
    return this.precio * (1 - descuento);
  }
}
