package SegundoTrimestre.Tema4.Ejemplos;

public class Jugador {
  // Props
  private String nombre;
  private String nick;
  private String email;
  private int edad;
  private int ranking;
  private String juego_favorito;

  // Constructor

  public Jugador() {
  }

  public Jugador(String nombre, String nick, String email, int edad, int ranking, String juego_favorito) {
    this.nombre = nombre;
    this.nick = nick;
    this.email = email;
    this.edad = edad;
    this.ranking = ranking;
    this.juego_favorito = juego_favorito;
  }
  // Getters and Setters

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNick() {
    return nick;
  }

  public void setNick(String nick) {
    this.nick = nick;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getRanking() {
    return ranking;
  }

  public void setRanking(int ranking) {
    this.ranking = ranking;
  }

  public String getJuego_favorito() {
    return juego_favorito;
  }

  public void setJuego_favorito(String juego_favorito) {
    this.juego_favorito = juego_favorito;
  }

  // Methods

}
