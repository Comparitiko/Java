package SegundoTrimestre.Tema5.Practica.EquiposCiclistas.Clases;

public class Contrarrelojista extends Ciclista{

  // Props
  private double velocidadMaxima;

  // Constructors
  public Contrarrelojista(int identificador, String nombre) {
    super(identificador, nombre);
  }

  // Getters and setters
  public double getVelocidadMaxima() {
    return velocidadMaxima;
  }

  public void setVelocidadMaxima(double velocidadMaxima) {
    this.velocidadMaxima = velocidadMaxima;
  }

  // Methods
  @Override
  public String imprimirTipo() {
    return "Contrarrelojista";
  }
}
