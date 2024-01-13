package SegundoTrimestre.Tema4.Practicas_Objetos.JuegoAhorcado;

public class Ahorcado {
  // Props
  private static String[] palabras = {
          // Array de palabras que se usan en el juego
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
          "analisis",
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
    // Metodo que devuelve un numero aleatorio segun el numero de palabras en el array
    return (int) Math.ceil(Math.random() * max);
  }

  private String genGuiones (int palabraLenght) {
    // Metodo para generar la palabra con guiones
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < palabraLenght; i++) {
      sb.append("-");
    }
    return sb.toString();
  }

  public boolean probarLetra (String letra) {
    // Metodo para probar la letra, si la letra esta en el array que guarda las letras puestas devuelve false
    // Si has acertado la letra devuelve true, si no devuelve false
    if (isLetterOnArray(letra)) return false;
    int index = 0;
    int tries = 0;
    while (true) {
      index = this.palabraAdivinar.indexOf(letra, index);
      if (tries == 0 && index < 0) {
        this.numFallos++;
        break;
      } else if (index < 0) {
        return true;
      } else {
        changeLetters(index);
      }
      index++;
      tries++;
    }
    addLetterToArray(letra);
    return false;
  }

  public boolean probarPalabra (String palabra) {
    // Si la palabra probada es como la palabra a adivinar devuelve true si no devuelve false
    if (this.palabraAdivinar.equalsIgnoreCase(palabra)) return true;
    else return false;
  }

  private void changeLetters (int index) {
    // Metodo que cambiar la palabra intentada, si ha acertado en algun momento la letra la pone si no pone un guion
    StringBuffer sb = new StringBuffer(this.palabraAdivinar.length());
    char character = this.palabraAdivinar.charAt(index);
    for (int i = 0; i < this.palabraIntentada.length(); i++) {
      if (i == index) sb.append(character);
      else if (this.palabraIntentada.charAt(i) != '-') sb.append(this.palabraIntentada.charAt(i));
      else sb.append("-");
    }
    this.palabraIntentada = sb.toString();
  }

  private boolean isLetterOnArray (String letter) {
    // Comprueba si la letra pasada por parametro esta en el array letras
    for (int i = 0; i < letras.length; i++) {
      if (letras[i] == null) return false;
      else if (letras[i].equals(letter)) return true;
    }
    return false;
  }

  private void addLetterToArray (String letter) {
    // Añade la letra al array
    for (int i = 0; i < letras.length; i++) {
      if (letras[i] == null) {
        letras[i] = letter;
        break;
      }
    }
  }

}
