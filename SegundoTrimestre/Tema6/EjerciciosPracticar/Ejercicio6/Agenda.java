package SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio6;
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
   * @param contactoAux contacto para comprobar.
   * @return true si existe el contacto, false en caso contrario
   */
  public boolean existeContacto(Contacto contactoAux) {
    return this.contactos.contains(contactoAux);
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

  /**
   * Metodo para listar todos los contactos
   * @return string con todos los contactos
   */
  public String listarContactos() {
    StringBuffer sb = new StringBuffer();
    for (Contacto contacto : this.contactos) {
      sb.append(contacto.pintar()).append("\n");
    }
    return sb.toString();
  }

  /**
   * Metodo para buscar un contacto por su nombre
   * @param nombre nombre del contacto a buscar
   * @return el número de telefono del contacto
   */
  public int buscarContacto(String nombre) {
    for (Contacto contacto : this.contactos) {
      if (contacto.getNombre().equals(nombre)) return contacto.getTelefono();
    }
    return -1;
  }

  /**
   * Metodo para eliminar un contacto
   *
   * @param contactoAux contacto a eliminar
   */
  public void eliminarContacto(Contacto contactoAux) {
    this.contactos.remove(contactoAux);
  }
}
