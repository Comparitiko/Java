package SegundoTrimestre.Tema6.Practica2.McBurguer.dominio;

public abstract class Comida extends Ingrediente {

  // Props
  protected boolean cocinado;

  // Constructors
  public Comida(String nombre, String tipoIngrediente) {
    super(nombre, tipoIngrediente);
    this.cocinado = false;
  }

  // Methods
  @Override
  public abstract double obtenerPrecio();
}
