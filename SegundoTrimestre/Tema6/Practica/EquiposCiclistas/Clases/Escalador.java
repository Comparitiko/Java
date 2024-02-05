package SegundoTrimestre.Tema6.Practica.EquiposCiclistas.Clases;

public class Escalador extends Ciclista{

  // Props
  private float potenciaPromedio;
  private float gradoRampaSoportada;

  // Constructors
  public Escalador(int identificador, String nombre, float potenciaPromedio, float gradoRampaSoportada) {
    super(identificador, nombre);
    this.potenciaPromedio = potenciaPromedio;
    this.gradoRampaSoportada = gradoRampaSoportada;
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
  public String toString() {
    final StringBuffer sb = new StringBuffer("Escalador{");
    sb.append(super.toString());
    sb.append("potenciaPromedio=").append(potenciaPromedio);
    sb.append(", gradoRampaSoportada=").append(gradoRampaSoportada);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public String imprimirTipo() {
    return "Escalador";
  }
}
