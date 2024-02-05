package SegundoTrimestre.Tema6.Practica.BladeOfDarkness.Clases;

public class Monstruo extends Personaje {
  // Enums
  public enum claseMonstruo {GOBLIN, TROLL, SKRALL, DEMONIO, FANTASMA};

  // Props
  protected claseMonstruo clase;
  protected int puntosD;

  // Constructor

  public Monstruo(String nombre, claseMonstruo clase, int puntosD) {
    super(nombre, 100, 1);
    this.clase = clase;
    this.puntosD = puntosD;
  }

  // Getters and Setters
  public claseMonstruo getClase() {
    return clase;
  }

  public void setClase(claseMonstruo clase) {
    this.clase = clase;
  }

  public int getPuntosD() {
    return puntosD;
  }

  public void setPuntosD(int puntosD) {
    this.puntosD = puntosD;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Monstruo{");
    sb.append(super.toString());
    sb.append(", clase=").append(clase);
    sb.append(", puntosD=").append(puntosD);
    sb.append('}');
    return sb.toString();
  }

  /**
   * Metodo para golpear a un personaje
   * @param personaje personaje al que se golpea
   */
  @Override
  public void golpear (Personaje personaje) {
    // Metodo para golpear a un jugador
    personaje.reducirVida(this.puntosD);
  }
}
