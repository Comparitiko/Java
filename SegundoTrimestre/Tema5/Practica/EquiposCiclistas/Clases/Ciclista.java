package SegundoTrimestre.Tema5.Practica.EquiposCiclistas.Clases;

public abstract class Ciclista {

  // Props
  private int identificador;
  private String nombre;
  private  double tiempoAcumuladoCarrera;

  // Constructors
  public Ciclista(int identificador, String nombre) {
    this.identificador = identificador;
    this.nombre = nombre;
    this.tiempoAcumuladoCarrera = 0;
  }

  // Getters and setters
  public int getIdentificador() {
    return identificador;
  }

  public void setIdentificador(int identificador) {
    this.identificador = identificador;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getTiempoAcumuladoCarrera() {
    return tiempoAcumuladoCarrera;
  }

  public void setTiempoAcumuladoCarrera(double tiempoAcumuladoCarrera) {
    this.tiempoAcumuladoCarrera = tiempoAcumuladoCarrera;
  }

  // Methods
  public abstract String imprimirTipo();
}
