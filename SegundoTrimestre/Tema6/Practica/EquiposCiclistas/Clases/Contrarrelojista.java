package SegundoTrimestre.Tema6.Practica.EquiposCiclistas.Clases;

public class Contrarrelojista extends Ciclista{

  // Props
  private double velocidadMaxima;

  // Constructors
  public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
    super(identificador, nombre);
    this.velocidadMaxima = velocidadMaxima;
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
  public String toString() {
    final StringBuffer sb = new StringBuffer("Contrarrelojista{");
    sb.append(super.toString());
    sb.append("velocidadMaxima=").append(velocidadMaxima);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public String imprimirTipo() {
    return "Contrarrelojista";
  }
}
