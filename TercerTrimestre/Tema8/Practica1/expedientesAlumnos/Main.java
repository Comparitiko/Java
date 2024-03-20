package TercerTrimestre.Tema8.Practica1.expedientesAlumnos;

import TercerTrimestre.Tema8.Practica1.expedientesAlumnos.entities.Estudiante;
import TercerTrimestre.Tema8.Practica1.expedientesAlumnos.entities.EtapaEducativa;
import TercerTrimestre.Tema8.Practica1.expedientesAlumnos.entities.Expediente;
import TercerTrimestre.Tema8.Practica1.expedientesAlumnos.entities.NotasCurso;
import TercerTrimestre.Tema8.Practica1.expedientesAlumnos.services.CentroEducativo;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

  /**
   * Generar un DNI aleatorio
   * @return DNI
   */
  public static String generarDNI() {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < 8; i++) {
      sb.append((int) (Math.random() * 10));
    }
    sb.append((char) ((int)(Math.random() * 26) + 65));
    return sb.toString();
  }

  /**
   * Generar un telefono aleatorio
   * @return
   */
  public static String generarTLF () {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < 9; i++) {
      sb.append((int) (Math.random() * 10));
    }
    return sb.toString();
  }

  /**
   * Funcion para generar un booleano aleatorio
   * @return true o false
   */
  public static Boolean generarBool () {
    return (Math.random() > 0.5);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LocalDate ahora = LocalDate.now();

    CentroEducativo centro = new CentroEducativo(
            "IES Jaroso",
            "Calle 1 n 2",
            "Cuevas del almanzora",
            "950123123",
            "iesjaroso@gmail.com"
    );

    NotasCurso notas1 = new NotasCurso(EtapaEducativa.FP_SUPERIOR, "DAW", 1, "2022");
    NotasCurso notas2 = new NotasCurso(EtapaEducativa.FP_SUPERIOR, "DAW", 2, "2022");

    for (int i = 1; i <= 20; i++) {
      NotasCurso notas;
      if (i % 2 == 0) {
        notas = notas1;
      } else {
        notas = notas2;
      }
      Expediente exp = new Expediente(new Estudiante(generarDNI(), "Alumno" + i, "Apellido"+i, ahora.minusYears(20),
            "Calle 2 n " + i, "Cuevas del almanzora", "Alumno" + i, generarTLF()), generarBool());
      for (int j = 1; j <= 6; j++) {
        notas.addNota("Asignatura " + i, Math.random() * 10);
      }
      exp.addNotas(notas);
      centro.addExpediente(exp);
    }
    System.out.println(centro);
    System.out.println("DNIs de los alumnos");
    centro.getExpedientes().forEach(exp -> System.out.println(exp.getEstudiante().getDni()));
    String opcionMenu = "a";
    while (!opcionMenu.isEmpty()) {
      System.out.println("Ingresa el DNI del alumno que quieres ver el expediente, si no escribes nada se cerrara el programa");
      opcionMenu = sc.nextLine();
      if (opcionMenu.isEmpty()) break;
      Expediente exp = centro.buscarExpediente(opcionMenu);
      if (exp != null) {
        System.out.println(exp);
      } else {
        System.out.println("El DNI introducido no existe, asegurese de escribirlo correctamente");
      }
    }
    sc.close();
  }
}
