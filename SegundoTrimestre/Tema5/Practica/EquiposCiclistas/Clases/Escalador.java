package SegundoTrimestre.Tema5.Practica.EquiposCiclistas.Clases;

public class Escalador extends Ciclista{

  // Props
  private float potenciaPromedio;
  private float gradoRampaSoportada;

  // Constructors
  public Escalador(int identificador, String nombre) {
    super(identificador, nombre);
  }

  // Getters and setters
  public float getPotenciaPromedio() {
    return potenciaPromedio;
  }

  public void setPotenciaPromedio(float potenciaPromedio) {
    this.potenciaPromedio = potenciaPromedio;
  }

  public float getGradoRampaSoportada() {
    return gradoRampaSoportada;
  }

  public void setGradoRampaSoportada(float gradoRampaSoportada) {
    this.gradoRampaSoportada = gradoRampaSoportada;
  }

  // Methods
  @Override
  public String imprimirTipo() {
    return null;
  }
}
