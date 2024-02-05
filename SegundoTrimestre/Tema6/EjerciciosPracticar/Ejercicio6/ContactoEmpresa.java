package SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio6;

public class ContactoEmpresa extends Contacto {

  // Props
  private String cif;
  private String email;

  // Constructors
  public ContactoEmpresa(String nombre, int telefono, String cif, String email) {
    super(nombre, telefono);
    this.cif = cif;
    this.email = email;
  }

  // Getters and Setters
  public String getCif() {
    return cif;
  }

  public void setCif(String cif) {
    this.cif = cif;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  // Methods
  @Override
  public String pintar() {
    StringBuffer sb = new StringBuffer(super.pintar());
    sb.append(", CIF: ").append(this.cif);
    sb.append(", Email: ").append(this.email);
    return sb.toString();
  }
}
