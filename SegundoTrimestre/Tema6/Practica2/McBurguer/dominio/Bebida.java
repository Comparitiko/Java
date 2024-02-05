package SegundoTrimestre.Tema6.Practica2.McBurguer.dominio;

public class Bebida extends Ingrediente {

  // Props
  private boolean refrigerada;

  // Constructor
  public Bebida(String nombre, String tipoIngrediente) {
    super(nombre, tipoIngrediente);
    this.refrigerada = false;
  }

  // Methods

  /**
   * Meter en la nevera la bebida para refrescar
   */
  public void meterEnNevera () {
    this.refrigerada = true;
  }

  /**
   * Sacar de la nevera para que no este fria
   */
  public void sacarDeNevera () {
    this.refrigerada = false;
  }

  /**
   * Metodo para calcular el precio
   * @return precio de la bebida
   */
  @Override
  public double obtenerPrecio() {
    if (this.refrigerada) return 1.50;
    else return 1;
  }
}
