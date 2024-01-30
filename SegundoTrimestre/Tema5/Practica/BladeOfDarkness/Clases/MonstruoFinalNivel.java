package SegundoTrimestre.Tema5.Practica.BladeOfDarkness.Clases;

public class MonstruoFinalNivel extends Monstruo {

  // Props
  private int golpeEspecial;
  private int usosGolpeEspecial;

  // Constructors
  public MonstruoFinalNivel(String nombre, claseMonstruo clase,int puntosD, int golpeEspecial) {
    super(nombre, clase, puntosD);
    this.golpeEspecial = golpeEspecial;
    this.usosGolpeEspecial = 3;
  }

  /**
   * Metodo para golpear a un personaje usando un posible golpe especial
   * @param personaje personaje al que se golpea
   */
  @Override
  public void golpear(Personaje personaje) {
    if (this.usosGolpeEspecial > 0) {
      personaje.reducirVida(this.golpeEspecial);
      this.usosGolpeEspecial--;
    }

  }
}
