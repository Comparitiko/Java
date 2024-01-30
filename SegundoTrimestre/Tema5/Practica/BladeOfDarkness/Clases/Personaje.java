package SegundoTrimestre.Tema5.Practica.BladeOfDarkness.Clases;

abstract class Personaje {
  // Props
  private String nombre;
  private int salud;
  private int nivel;

  // Constructor
  public Personaje(String nombre, int salud, int nivel) {
    this.nombre = nombre;
    this.salud = salud;
    this.nivel = nivel;
  }

  // Getters and Setters
  protected String getNombre() {
    return nombre;
  }

  protected void setNombre(String nombre) {
    this.nombre = nombre;
  }

  protected int getSalud() {
    return salud;
  }

  protected void setSalud(int salud) {
    this.salud = salud;
  }

  protected int getNivel() {
    return nivel;
  }

  protected void setNivel(int nivel) {
    this.nivel = nivel;
  }

  // Methods

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Personaje{");
    sb.append("nombre='").append(nombre).append('\'');
    sb.append(", salud=").append(salud);
    sb.append(", nivel=").append(nivel);
    sb.append('}');
    return sb.toString();
  }

  /**
   *  Método para subir un nivel hasta 10 e ir subiendo la vida segun el nivel
   */
  protected void subirNivel () {
    this.nivel++;
    if (this.nivel > 10) this.nivel = 10;
    else this.salud += (int) (Math.pow(2, this.nivel));
  }

  /**
   * Método para reducir la vida del personaje
   * @param puntosD puntos de daño recibidos por el personaje
   * @return true si el personaje muere y false si no muere
   */
  protected boolean reducirVida (int puntosD) {
    this.salud -= puntosD;
    if (this.salud < 1) {
      this.salud = 0;
      return true;
    } else return false;
  }

  protected abstract void golpear ();
}
