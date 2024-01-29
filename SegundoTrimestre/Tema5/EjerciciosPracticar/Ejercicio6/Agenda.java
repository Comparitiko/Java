package SegundoTrimestre.Tema5.EjerciciosPracticar.Ejercicio6;
import java.util.ArrayList;

public class Agenda {

  // Props
  private ArrayList<Contacto> contactos;

  // Methods
  public Agenda() {
    this.contactos = new ArrayList<Contacto>();
  }

  /**
   * Comprueba si existe un contacto con el mismo nombre.
   * @param contacto contacto para comprobar.
   * @return true si existe el contacto, false en caso contrario
   */
  public boolean existeContacto(Contacto contacto) {
    for (Contacto contacto : this.contactos) {
      if (contacto.equals(contacto)) return true;
    }
    return false;
  }

  /**
   * Comprueba si existe el contacto y si no lo añade al arrayList
   * @param contacto contacto a añadir
   * @return true si se añadio el contacto, false en caso contrario
   */
  public boolean addContacto(Contacto contacto) {
    if (!this.existeContacto(contacto)) {
      this.contactos.add(contacto);
      return true;
    }
    return false;
  }

  public String listarContactos() {
    StringBuffer sb = new StringBuffer();
    for (Contacto contacto : this.contactos) {
      sb.append(contacto.toString() + "\n");
    }
    return sb.toString();
  }
}
