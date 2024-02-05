package SegundoTrimestre.Tema6.Practica2.McBurguer.dominio;

public abstract class Ingrediente {

  // Props
  private String nombre;
  private String tipoIngrediente;

  // Constructor
  public Ingrediente(String nombre, String tipoIngrediente) {
    this.nombre = nombre;
    this.tipoIngrediente = tipoIngrediente;
  }

  // Getters and setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTipoIngrediente() {
    return tipoIngrediente;
  }

  public void setTipoIngrediente(String tipoIngrediente) {
    this.tipoIngrediente = tipoIngrediente;
  }

  // Methods
  public abstract double obtenerPrecio();
}
