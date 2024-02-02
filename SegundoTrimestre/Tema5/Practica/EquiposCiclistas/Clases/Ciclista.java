package SegundoTrimestre.Tema5.Practica.EquiposCiclistas.Clases;

public abstract class Ciclista {

  // Props
  protected int identificador;
  protected String nombre;
  protected double tiempoAcumuladoCarrera;

  // Constructors
  protected Ciclista(int identificador, String nombre) {
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


  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Ciclista{");
    sb.append("identificador=").append(identificador);
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append(", tiempoAcumuladoCarrera=").append(tiempoAcumuladoCarrera);
    sb.append('}');
    return sb.toString();
  }

  public abstract String imprimirTipo();
}
