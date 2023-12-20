package PracticasPersonales.PruebasClases;
import PracticasPersonales.Clases.Alumno;
import PracticasPersonales.Clases.Coche;

public class PruebaClases {

  public static void main(String[] args) {

    Coche co1 = new Coche("Mercedes", "Blanco", "As");
    
    Alumno a1 = new Alumno(0, "Gabriel", "Collado");
    Alumno a2 = new Alumno(1, "Mohamed", "asd");

    System.out.println(a1.getId());

    System.out.println(a2.getId());
    a2.setId(2);
    System.out.println(a2.getId());
    System.out.println(a1.getId());

    System.out.println(a1.toString());

    a1.mostrarNombre();

    System.out.println(co1.getColor());

    a1.saberAprobado(6);
    a1.saberAprobado(1);
    System.out.println(a1.getId());

  }
}
