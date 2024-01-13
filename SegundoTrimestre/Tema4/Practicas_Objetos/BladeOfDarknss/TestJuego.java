package SegundoTrimestre.Tema4.Practicas_Objetos.BladeOfDarknss;

public class TestJuego {
  public static void main(String[] args) {
    Jugador j1 = new Jugador("Gabriel", Jugador.claseJugador.MAGO);
    Arma a1 = new Arma("Vara de las edades", Arma.tipoArma.BASTON, 20000, true);
    // Equipar el arma si se puede
    if (j1.equipar(a1)) {
      System.out.println("Jugador " + j1.getNombre() + "equipado con: " + a1.getNombre());
    }
    Monstruo m1 = new Monstruo("Nemesis", Monstruo.claseMonstruo.DEMONIO, 40);
    Monstruo m2 = new Monstruo("Minion", Monstruo.claseMonstruo.GOBLIN, 5);
    Monstruo m3 = new Monstruo("Cannon", Monstruo.claseMonstruo.SKRALL, 20);
    Monstruo m4 = new Monstruo("Kevins", Monstruo.claseMonstruo.FANTASMA, 25);
    Monstruo m5 = new Monstruo("Baron Nashor", Monstruo.claseMonstruo.DEMONIO, 1500);
    // Bucles para subir el nivel de los monstruos
    for (int i = 0; i < 10; i++) {
      m5.subirNivel();
    }
    for (int i = 0; i < 5; i++) {
      m4.subirNivel();
    }
    for (int i = 0; i < 8; i++) {
      m1.subirNivel();
    }
    for (int i = 0; i < 3; i++) {
      m3.subirNivel();
    }

    // Primer combate
    System.out.println("Primer combate");
    System.out.println(j1.getNombre() + " VS " + m1.getNombre());
    m1.golpear(j1);
    if (j1.getSalud() < 1) System.out.println(j1.getNombre() + " ha muerto");
    else System.out.println("Al jugador le quedan " + j1.getSalud());
    if (j1.getArmaDerecha() != null) {
      j1.golpear(m1);
      if (m1.getSalud() < 1) {
        System.out.println("El monstruo " + m1.getNombre() + " ha muerto");
      } else {
        System.out.println("Al monstruo le quedan " + m1.getSalud());
      }
    }

    // Segundo combate
    System.out.println("Segundo combate");
    System.out.println(j1.getNombre() + " VS " + m2.getNombre());
    m2.golpear(j1);
    if (j1.getSalud() < 1) System.out.println(j1.getNombre() + " ha muerto");
    else System.out.println("Al jugador le quedan " + j1.getSalud());
    if (j1.getArmaDerecha() != null) {
      j1.golpear(m2);
      if (m2.getSalud() < 1) {
        System.out.println("El monstruo " + m2.getNombre() + " ha muerto");
      } else {
        System.out.println("Al monstruo le quedan " + m2.getSalud());
      }
    }

    // Tercer combate
    System.out.println("Tercer combate");
    System.out.println(j1.getNombre() + " VS " + m3.getNombre());
    m3.golpear(j1);
    if (j1.getSalud() < 1) System.out.println(j1.getNombre() + " ha muerto");
    else System.out.println("Al jugador le quedan " + j1.getSalud());
    if (j1.getArmaDerecha() != null) {
      j1.golpear(m3);
      if (m3.getSalud() < 1) {
        System.out.println("El monstruo " + m3.getNombre() + " ha muerto");
      } else {
        System.out.println("Al monstruo le quedan " + m3.getSalud());
      }
    }

    j1.tomarPocion(5000);

    System.out.println("El nivel actual del jugador 1 es: " + j1.getNivel());

    // Cuarto combate
    System.out.println("Cuarto combate");
    System.out.println(j1.getNombre() + " VS " + m4.getNombre());
    m4.golpear(j1);
    if (j1.getSalud() < 1) System.out.println(j1.getNombre() + " ha muerto");
    else System.out.println("Al jugador le quedan " + j1.getSalud());
    if (j1.getArmaDerecha() != null) {
      j1.golpear(m4);
      if (m1.getSalud() < 1) {
        System.out.println("El monstruo " + m4.getNombre() + " ha muerto");
      } else {
        System.out.println("Al monstruo le quedan " + m4.getSalud());
      }
    }

    j1.tomarPocion(500);
    System.out.println("Tu salud ahora mismo despues de tomar una pocion es: " + j1.getSalud());
    System.out.println(m5.getPuntosD());

    // Final Boss
    System.out.println("Boss Final");
    System.out.println(j1.getNombre() + " VS " + m5.getNombre());
    m5.golpear(j1);
    if (j1.getSalud() < 1) System.out.println(j1.getNombre() + " ha muerto");
    else System.out.println("Al jugador le quedan " + j1.getSalud());
    if (j1.getArmaDerecha() != null) {
      j1.golpear(m5);
      if (m5.getSalud() < 1) {
        System.out.println("El monstruo " + m5.getNombre() + " ha muerto");
      } else {
        System.out.println("Al monstruo le quedan " + m5.getSalud());
      }
    }
    System.out.println(j1.getNombre() + " ha terminado con nivel " + j1.getNivel());
  }
}
