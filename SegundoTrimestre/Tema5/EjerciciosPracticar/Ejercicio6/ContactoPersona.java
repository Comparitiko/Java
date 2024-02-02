package SegundoTrimestre.Tema5.EjerciciosPracticar.Ejercicio6;

public class ContactoPersona extends Contacto{
  // Props
  private String apodo;

  // Constructors
  public ContactoPersona(String nombre, int telefono, String apodo) {
    super(nombre, telefono);
    this.apodo = apodo;
  }

  // Getters and Setters
  public String getApodo() {
    return apodo;
  }

  public void setApodo(String apodo) {
    this.apodo = apodo;
  }

  // Methods
  @Override
  public String pintar() {
    StringBuffer sb = new StringBuffer(super.pintar());
    sb.append(", Apodo: ").append(this.apodo);
    return sb.toString();
  }
}
