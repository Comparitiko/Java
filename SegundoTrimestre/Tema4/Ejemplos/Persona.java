package SegundoTrimestre.Tema4.Ejemplos;

public class Persona {
  // Props
  private String nombre;
  private String apellidos;
  private int edad;
  private String ciudad;
  private String email;
  private double altura;

  // Constructor

  public Persona() {
    this.nombre = "Sin nombre";
    this.apellidos = "Sin apellidos";
    this.edad = 0;
    this.ciudad = "Sin ciudad";
    this.email = "Sin email";
    this.altura = 0;
  }

  public Persona(String nombre, String apellidos, int edad, String ciudad, String email, double altura) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
    this.ciudad = ciudad;
    this.email = email;
    this.altura = altura;
  }

  // Getters and setters
  public String getNombre() {
    return nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public int getEdad() {
    return edad;
  }

  public String getCiudad() {
    return ciudad;
  }

  public String getEmail() {
    return email;
  }

  public double getAltura() {
    return altura;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Persona{");
    sb.append("nombre='").append(nombre).append('\'');
    sb.append(", apellidos='").append(apellidos).append('\'');
    sb.append(", edad=").append(edad);
    sb.append(", ciudad='").append(ciudad).append('\'');
    sb.append(", email='").append(email).append('\'');
    sb.append(", altura=").append(altura);
    sb.append('}');
    return sb.toString();
  }
}
