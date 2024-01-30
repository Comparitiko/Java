package SegundoTrimestre.Tema5.Practica.BladeOfDarkness.Clases;

public class Jugador extends Personaje {
  // Enums
  public enum claseJugador {MAGO, BRUJO, BARBARO, CABALLERO};

  // Props
  private claseJugador clase;
  private int experiencia;
  private Arma armaDerecha;
  private Arma armaIzquierda;

  // Constructor

  public Jugador(String nombre, claseJugador clase) {
    super(nombre, 200, 1);
    this.clase = clase;
    this.experiencia = 0;
    this.armaDerecha = null;
    this.armaIzquierda = null;
  }

  // Getters and Setters
  public claseJugador getClase() {
    return clase;
  }

  public void setClase(claseJugador clase) {
    this.clase = clase;
  }

  public int getExperiencia() {
    return experiencia;
  }

  public void setExperiencia(int experiencia) {
    this.experiencia = experiencia;
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
    sb.append(super.toString()).append(',');
    sb.append("clase=").append(clase);
    sb.append(", experiencia=").append(experiencia);
    sb.append(", armaDerecha=").append(armaDerecha);
    sb.append(", armaIzquierda=").append(armaIzquierda);
    sb.append('}');
    return sb.toString();
  }

  /**
   *
   * @param arma
   * @return
   */
  public boolean equipar(Arma arma) {
    // Equipar un arma empezando por la derecha y siguiendo por la izquierda a no ser que el arma ocupe dos manos
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
    // Metodo para tomar una pocion de maximo 10000 puntos de salud
    this.setSalud(this.getSalud() + puntosS);
    if (this.getSalud() > 10000) this.setSalud(10000);
  }

  public void golpear (Monstruo monstruo) {
    // Metodo que hace golpear a un monstruo segun el daño de las arma.
    if (this.armaDerecha != null) {
      monstruo.reducirVida(this.armaDerecha.getPuntosD());
      if (!this.armaDerecha.isDosManos()) {
        if (this.armaIzquierda != null) {
          monstruo.reducirVida(this.armaIzquierda.getPuntosD());
        }
      }
    }
    // Si el nivel es menor que 10 consigue experiencia y si la experiencia es mayor que 100
    // la va dividiendo entre 100 hasta que sea menor y sube un nivvel por cada division
    if (getNivel() < 10) {
      if (monstruo.reducirVida(0)) {
        this.experiencia += 10 * monstruo.getNivel();
      }
      while (this.experiencia > 100) {
        this.experiencia /= 100;
        subirNivel();
      }
    }
  }
}
