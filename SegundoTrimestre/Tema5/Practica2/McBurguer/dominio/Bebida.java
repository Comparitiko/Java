package SegundoTrimestre.Tema5.Practica2.McBurguer.dominio;

public class Bebida extends Ingrediente {

  // Props
  private boolean refrigerada;

  // Constructor
  public Bebida(String nombre, String tipoIngrediente) {
    super(nombre, tipoIngrediente);
    this.refrigerada = false;
  }

  // Methods
  public void meterEnNevera () {
    this.refrigerada = true;
  }

  public void sacarDeNevera () {
    this.refrigerada = false;
  }

  @Override
  public double obtenerPrecio() {
    if (this.refrigerada) return 1.50;
    else return 1;
  }
}
