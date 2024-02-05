package SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio2;

public class Password {
  // Props
  private int longitud;
  private String contrasenia;

  // Constructors
  public Password () {
    this.longitud = 8;
    this.contrasenia = generatePassword();
  }

  public Password (int longitud) {
    this.longitud = longitud;
    this.contrasenia = generatePassword();
  }

  public Password (Password p1) {
    this.longitud = p1.getLongitud();
    this.contrasenia = p1.getContrasenia();
  }

  // Getters and Setters
  public int getLongitud() {
    return longitud;
  }

  public void setLongitud(int longitud) {
    this.longitud = longitud;
  }

  public String getContrasenia() {
    return contrasenia;
  }

  // Methods

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Password{");
    sb.append("longitud=").append(longitud);
    sb.append(", contrasenia='").append(contrasenia).append('\'');
    sb.append('}');
    return sb.toString();
  }

  /**
   * Generar una contraseña aleatoria segun la longitud de la contraseña.
   * @return String con la contraseña aleatoria
   */
  private String generatePassword () {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < this.longitud; i++) {
      sb.append((char) generateRanNumber(48, 122));
    }
    return sb.toString();
  }

  /**
   * Generar un numero aleatorio entre el numero minimo y el numero maximo.
   * @param min numero minimo para generar el numero aleatorio
   * @param max numero maximo para generar el numero aleatorio
   * @return Devuelve el numero aleatorio
   */
  private int generateRanNumber (int min, int max) {
    return (int) (Math.random() * (max - min + 1)) + min;
  }

  /**
   * Metodo que comprueba si la contraseña es fuerte.
   * @return true si la contraseña es fuerte, false en caso contrario.
   */
  public boolean esFuerte () {
    int mayus = 0, minus = 0, nums = 0, simbolos = 0;
    for (int i = 0; i < this.contrasenia.length(); i++) {
      if ((int) this.contrasenia.charAt(i) >= 65 && this.contrasenia.charAt(i) <= 90) mayus++;
      else if (this.contrasenia.charAt(i) >= 97 && this.contrasenia.charAt(i) <= 122) minus++;
      else if (this.contrasenia.charAt(i) >= 48 && this.contrasenia.charAt(i) <= 57) nums++;
      else simbolos++;
    }
    return (mayus >= 1 && minus >= 2 && nums >= 2 && simbolos >= 1 && this.contrasenia.length() >= 8);
  }
}
