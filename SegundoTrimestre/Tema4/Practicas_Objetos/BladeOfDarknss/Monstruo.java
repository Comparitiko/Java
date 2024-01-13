package SegundoTrimestre.Tema4.Practicas_Objetos.BladeOfDarknss;

public class Monstruo {
  // Enums
  public enum claseMonstruo {GOBLIN, TROLL, SKRALL, DEMONIO, FANTASMA};

  // Props
  private String nombre;
  private claseMonstruo clase;
  private int nivel;
  private int salud;
  private int puntosD;

  // Constructor

  public Monstruo(String nombre, claseMonstruo clase, int puntosD) {
    this.nombre = nombre;
    this.clase = clase;
    this.nivel = 1;
    this.salud = 100;
    this.puntosD = puntosD;
  }

  // Getters and Setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public claseMonstruo getClase() {
    return clase;
  }

  public void setClase(claseMonstruo clase) {
    this.clase = clase;
  }

  public int getNivel() {
    return nivel;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }

  public int getSalud() {
    return salud;
  }

  public void setSalud(int salud) {
    this.salud = salud;
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
    sb.append("nombre='").append(nombre).append('\'');
    sb.append(", clase=").append(clase);
    sb.append(", nivel=").append(nivel);
    sb.append(", salud=").append(salud);
    sb.append(", puntosD=").append(puntosD);
    sb.append('}');
    return sb.toString();
  }

  public void subirNivel () {
    // Metodo para subir un nivel hasta 10 e ir subiendo la vida segun el nivel
    this.nivel++;
    if (this.nivel > 10) this.nivel = 10;
    else this.salud += (int) (Math.pow(2, this.nivel));
  }

  public boolean reducirVida (int puntosD) {
    // Metodo que hace pierda vida el monstruo y devuelve true si muere, si no devuelve false
    this.salud -= puntosD;
    if (this.salud < 1) {
      this.salud = 0;
      return true;
    } else return false;
  }

  public void golpear (Jugador jugador) {
    // Metodo para golpear a un jugador
    jugador.reducirVida(this.puntosD);
  }
}
