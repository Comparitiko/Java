package SegundoTrimestre.Tema5.Practica.EquiposCiclistas.Clases;

public class Velocista extends Ciclista {

  // Props
  private double potenciaPromedio;
  private double velocidadPromedio;

  // Constructors
  public Velocista(int identificador, String nombre) {
    super(identificador, nombre);
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
  public String imprimirTipo() {
    return "Velocista";
  }
}
