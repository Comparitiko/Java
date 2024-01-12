package SegundoTrimestre.Tema4.Practicas_Objetos.BladeOfDarknss;

public class Jugador {
  // Enums
  public enum claseJugador {MAGO, BRUJO, BARBARO, CABALLERO};

  // Props
  private String nombre;
  private claseJugador clase;
  private int nivel;
  private int experiencia;
  private int salud;
  private Arma armaDerecha;
  private Arma armaIzquierda;

  // Constructor

  public Jugador(String nombre, claseJugador clase) {
    this.nombre = nombre;
    this.clase = clase;
    this.nivel = 1;
    this.experiencia = 0;
    this.salud = 200;
    this.armaDerecha = null;
    this.armaIzquierda = null;
  }

  // Getters and Setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public claseJugador getClase() {
    return clase;
  }

  public void setClase(claseJugador clase) {
    this.clase = clase;
  }

  public int getNivel() {
    return nivel;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }

  public int getExperiencia() {
    return experiencia;
  }

  public void setExperiencia(int experiencia) {
    this.experiencia = experiencia;
  }

  public int getSalud() {
    return salud;
  }

  public void setSalud(int salud) {
    this.salud = salud;
  }

  public Arma getArmaDerecha() {
    return armaDerecha;
  }

  public void setArmaDerecha(Arma armaDerecha) {
    this.armaDerecha = armaDerecha;
  }

  public Arma getArmaIzquierda() {
    return armaIzquierda;
  }

  public void setArmaIzquierda(Arma armaIzquierda) {
    this.armaIzquierda = armaIzquierda;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Jugador{");
    sb.append("nombre='").append(nombre).append('\'');
    sb.append(", clase=").append(clase);
    sb.append(", nivel=").append(nivel);
    sb.append(", experiencia=").append(experiencia);
    sb.append(", salud=").append(salud);
    sb.append(", armaDerecha=").append(armaDerecha);
    sb.append(", armaIzquierda=").append(armaIzquierda);
    sb.append('}');
    return sb.toString();
  }

  public void subirNivel() {
    this.nivel++;
    if (this.nivel > 10) this.nivel = 10;
    else this.salud += (int) (Math.pow(2.5, this.nivel));
  }

  public boolean equipar(Arma arma) {
    if (arma.isDosManos() && this.armaIzquierda == null && this.armaDerecha == null) {
      this.armaDerecha = arma;
      this.armaIzquierda = arma;
      return  true;
    } else if (!arma.isDosManos() && this.armaDerecha == null) {
      this.armaDerecha = arma;
      return true;
    } else if (!arma.isDosManos() && this.armaIzquierda == null) {
      this.armaIzquierda = arma;
    }
    return false;
  }

  public void tomarPocion (int puntosS) {
    this.salud += puntosS;
    if (this.salud > 10000) this.salud = 10000;
  }

  public boolean reducirVida (int puntosD) {
    this.salud -= puntosD;
    if (this.salud < 1) {
      this.salud = 0;
      return true;
    } else return false;
  }

  public void golpear (Monstruo monstruo) {
    if (this.armaDerecha.isDosManos()) {

    }
  }
}
