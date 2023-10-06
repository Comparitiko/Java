import java.util.Scanner;

public class ViajeEstudios {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el numero de alumnos:");
    int numAlumnos = sc.nextInt();

    if (numAlumnos >= 100) {
      System.out.println("El precio por cada alumno para " + numAlumnos + " alumnos el coste del viaje es " + (numAlumnos * 65) + " euros");  
    } else if (numAlumnos >= 50 && numAlumnos <= 99) {
      System.out.println("El precio por cada alumno para " + numAlumnos + " alumnos el coste del viaje es " + (numAlumnos * 70) + " euros");
    } else if (numAlumnos >= 30 && numAlumnos <= 49) {
      System.out.println("El precio por cada alumno para " + numAlumnos + " alumnos el coste del viaje es " + (numAlumnos * 95) + " euros");
    } else {
      System.out.println("El precio por cada alumno para " + numAlumnos + " alumnos el coste del viaje es 4000 euros");
    }
    sc.close();

  }

}