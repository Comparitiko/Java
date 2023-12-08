package PracticasPersonales.PruebasClases;
import PracticasPersonales.Clases.Alumno;

public class PruebaClases {
  public static void main(String[] args) {
    
    Alumno a1 = new Alumno(0, "Gabriel", "Collado");

    System.out.println(a1.toString());

    a1.mostrarNombre();

    a1.saberAprobado(6);
    a1.saberAprobado(1);
    System.out.println(a1.getId());

  }
}
