package SegundoTrimestre.Tema5.Practicas_Objetos.BladeOfDarknss;

public class Arma {
  // Enums
  public enum tipoArma{ESPADA, HACHA, BASTON, ARCO};

  // Props
  private String nombre;
  private tipoArma arma;
  private int puntosD;
  private boolean dosManos;

  // Constructor
  public Arma(String nombre, tipoArma arma, int puntosD, boolean dosManos) {
    this.nombre = nombre;
    this.arma = arma;
    this.puntosD = puntosD;
    this.dosManos = dosManos;
  }

  // Getters and Setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public tipoArma getArma() {
    return arma;
  }

  public void setArma(tipoArma arma) {
    this.arma = arma;
  }

  public int getPuntosD() {
    return puntosD;
  }

  public void setPuntosD(int puntosD) {
    this.puntosD = puntosD;
  }

  public boolean isDosManos() {
    return dosManos;
  }

  public void setDosManos(boolean dosManos) {
    this.dosManos = dosManos;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Arma{");
    sb.append("nombre='").append(nombre).append('\'');
    sb.append(", arma=").append(arma);
    sb.append(", puntosD=").append(puntosD);
    sb.append(", dosManos=").append(dosManos);
    sb.append('}');
    return sb.toString();
  }
}