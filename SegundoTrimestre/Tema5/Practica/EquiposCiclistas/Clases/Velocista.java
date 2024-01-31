package SegundoTrimestre.Tema5.Practica.EquiposCiclistas.Clases;

public class Velocista extends Ciclista {

  // Props
  private double potenciaPromedio;
  private double velocidadPromedio;

  // Constructors
  public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio) {
    super(identificador, nombre);
    this.potenciaPromedio = potenciaPromedio;
    this.velocidadPromedio = velocidadPromedio;
  }

  // Getters and setters
  public double getPotenciaPromedio() {
    return potenciaPromedio;
  }

  public void setPotenciaPromedio(double potenciaPromedio) {
    this.potenciaPromedio = potenciaPromedio;
  }

  public double getVelocidadPromedio() {
    return velocidadPromedio;
  }

  public void setVelocidadPromedio(double velocidadPromedio) {
    this.velocidadPromedio = velocidadPromedio;
  }

  // Methods

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Velocista{");
    sb.append(super.toString());
    sb.append("potenciaPromedio=").append(potenciaPromedio);
    sb.append(", velocidadPromedio=").append(velocidadPromedio);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public String imprimirTipo() {
    return "Velocista";
  }
}
