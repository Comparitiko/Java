package PracticasPersonales.Clases;

public class Alumno {
  
  // Propiedades de la clase
  int id;
  String nombre;
  String apellido;


  // Constructor
  public Alumno(int id, String nombre, String apellido) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
  }
  // Metodos de la clase alumno
  public void mostrarNombre() {
    System.out.println("Mi nombre es: " + this.nombre);
  }
  public void saberAprobado (double nota) {
    if (nota >= 5) System.out.println("Aprobé");
    else System.out.println("No aprobé");
  }
  @Override
  public String toString() {
    return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
  }
  public int getId() {
    return id;
  }
  public String getNombre() {
    return nombre;
  }
  public String getApellido() {
    return apellido;
  }
  public void setId(int id) {
    this.id = id;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }
  
}
