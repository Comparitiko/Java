package SegundoTrimestre.Tema4.Practicas_Objetos.JuegoAhorcado;

public class Ahorcado {
  // Props
  private static String[] palabras = {
          "programacion",
          "desarrollo",
          "java",
          "python",
          "computadora",
          "tecnologia",
          "android",
          "javascript",
          "html",
          "css",
          "base de datos",
          "algoritmo",
          "inteligencia artificial",
          "redes",
          "seguridad",
          "software",
          "hardware",
          "internet",
          "aplicacion",
          "programador",
          "codigo",
          "git",
          "framework",
          "base de datos",
          "servidor",
          "cliente",
          "interfaz",
          "pantalla",
          "teclado",
          "mouse",
          "variable",
          "metodo",
          "clase",
          "objeto",
          "herencia",
          "polimorfismo",
          "encapsulamiento",
          "abstraccion",
          "compilador",
          "depuracion",
          "rendimiento",
          "optimizacion",
          "escalabilidad",
          "protocolo",
          "almacenamiento",
          "sistema operativo",
          "analisis"
  };
  private String palabraAdivinar;
  private String palabraIntentada;
  private int numFallos;
  private String[] letras;

  // Constructor
  public Ahorcado () {
    this.palabraAdivinar = palabras[genNum(palabras.length)];
    this.palabraIntentada = genGuiones(this.palabraAdivinar.length());
    this.numFallos = 0;
    this.letras = new String[7];
  }

  // Getters and Setters
  public String getPalabraAdivinar() {
    return palabraAdivinar;
  }

  public void setPalabraAdivinar(String palabraAdivinar) {
    this.palabraAdivinar = palabraAdivinar;
  }

  public String getPalabraIntentada() {
    return palabraIntentada;
  }

  public void setPalabraIntentada(String palabraIntentada) {
    this.palabraIntentada = palabraIntentada;
  }

  public int getNumFallos() {
    return numFallos;
  }

  public void setNumFallos(int numFallos) {
    this.numFallos = numFallos;
  }

  // Methods
  private int genNum (int max) {
    return (int) Math.ceil(Math.random() * max);
  }

  private String genGuiones (int longitudPalabra) {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < longitudPalabra; i++) {
      sb.append("-");
    }
    return sb.toString();
  }

  public boolean probarLetra (String letra) {

  }

  public boolean probarPalabra (String palabra) {

  }
}
