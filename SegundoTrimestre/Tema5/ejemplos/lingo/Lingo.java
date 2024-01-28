package SegundoTrimestre.Tema5.ejemplos.lingo;

import java.util.ArrayList;

public class Lingo {
  private ArrayList<String> palabras = new ArrayList<>();
  private String palabraAcertar;

  public Lingo () {
    this.palabras.add("Lunes");
    this.palabras.add("Martes");
    this.palabras.add("Lingo");
    this.palabras.add("Perro");
    this.palabras.add("Arroz");
    this.palabraAcertar = this.palabras.get(genNumero(this.palabras.size() - 1));
  }

  // Getters and Setters
  public String getPalabraAcertar() {
    return palabraAcertar;
  }

  public void setPalabraAcertar(String palabraAcertar) {
    this.palabraAcertar = palabraAcertar;
  }

  // Methods
  // Generar un numero aleatorio entre min y max
  private int genNumero (int max) {
    return (int) (Math.random() * (max + 1));
  }

  /**
   * Metodo para comprobar si la palabra tiene 5 caracteres y la cantidad de aciertos es correcta
   * @param palabra
   * @return numero de aciertos o 0 si no tiene el mismo tamaño
   */
  public int comprobar (String palabra) {
    if (palabra.length() != 5) {
      System.out.println("La palabra debe tener 5 caracteres");
      return 0;
    }
    int aciertos = 0;
    for (int i = 0; i <5; i++) {
      if (this.palabraAcertar.toLowerCase().charAt(i) != palabra.toLowerCase().charAt(i)) {
        aciertos++;
      }
    }
    return aciertos;
  }
}
