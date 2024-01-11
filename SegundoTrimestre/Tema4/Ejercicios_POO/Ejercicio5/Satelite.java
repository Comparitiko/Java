package SegundoTrimestre.Tema4.Ejercicios_POO.Ejercicio5;

/*
5. Dada la siguiente clase:
  public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distancia_tierra;
    Satelite (double m, double p, double d) {
    meridiano = m;
    paralelo = p;
    distancia_tierra = d;
    }
    Satelite () {
    meridiano=paralelo=distancia_tierra=0;
    }
    public void setPosicion(double m, double p, double d) {
    meridiano = m;
    paralelo = p;
    distancia_tierra = d;
    }
    public void printPosicion() {
    System.out.print("El satélite se encuentra en ");
    System.out.print("el paralelo "+paralelo+" meridiano "+meridiano);
    System.out.print(" a una distancia de la Tierra de"+distancia_tierra+" kms.");
    }
  }

  Modifica la clase Satélite y añádele los siguientes métodos:
    - Metodo void variaAltura(double desplazamiento). Este método acepta un parámetro que
    será positivo o negativo dependiendo de si el satélite tiene que alejarse o acercarse a La Tierra.
    - Método boolean enOrbita(). Este método devolverá false si el satélite está en tierra y true en caso
    contrario.
    - Método void variaPosicion(double variap, double variam). Este método permite
    modificar los atributos de posición (meridiano y paralelo) mediante los parámetros variap y variam. Estos
    parámetros serán valores positivos o negativos relativos que harán al satélite modificar su posición.

 */

public class Satelite {
  // Props
  private double meridiano;
  private double paralelo;
  private double distancia_tierra;

  // Constructors
  Satelite(double m, double p, double d) {
    meridiano = m;
    paralelo = p;
    distancia_tierra = d;
  }

  Satelite() {
    meridiano = paralelo = distancia_tierra = 0;
  }

  public void setPosicion(double m, double p, double d) {
    meridiano = m;
    paralelo = p;
    distancia_tierra = d;
  }
  public void variaAltura(double desplazamiento) {
    this.distancia_tierra += desplazamiento;
  }

  public boolean enOrbita () {
    if (distancia_tierra == 0) return false;
    else return true;
  }

  public void variaPosicion (double variap, double variam) {
    this.meridiano += variam;
    this.paralelo += variap;
  }
}