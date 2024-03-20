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
    NotasCurso notas3 = new NotasCurso(EtapaEducativa.FP_SUPERIOR, "DAW", 2, "2023");
    NotasCurso notas4 = new NotasCurso(EtapaEducativa.FP_MEDIO, "Instalaciones de telecomunicaciones", 2, "2023");

    for (int i = 1; i <= 6; i++) {
      notas1.addNota("Asignatura " + i, Math.random() * 10);
      notas2.addNota("Asignatura " + i, Math.random() * 10);
      notas3.addNota("Asignatura " + i, Math.random() * 10);
      notas4.addNota("Asignatura " + i, Math.random() * 10);
    }

    for (int i = 1; i <= 3; i++) {

      Expediente exp = new Expediente(new Estudiante(generarDNI(), "Alumno" + i, "Apellido"+i, ahora.minusYears(20),
            "Calle 2 n " + i, "Cuevas del almanzora", "Alumno" + i, generarTLF()), generarBool());
      if (i == 1) {
        exp.addNotas(notas1);
        exp.addNotas(notas3);
      }
      else if (i == 2) exp.addNotas(notas2);
      else exp.addNotas(notas4);
      centro.addExpediente(exp);
    }

    String opcionMenu = "a";
    while (!opcionMenu.isEmpty()) {
      System.out.println("DNIs de los alumnos");
      centro.getExpedientes().forEach(exp -> System.out.println(exp.getEstudiante().getDni()));
      System.out.println("Ingresa el DNI del alumno que quieres ver el expediente, si no escribes nada se cerrara el programa");
      opcionMenu = sc.nextLine();
      if (opcionMenu.isEmpty()) break;
      Expediente exp = centro.buscarExpediente(opcionMenu.toUpperCase());
      if (exp != null) {
        System.out.println(exp);
      } else {
        System.out.println("El DNI introducido no existe, asegurese de escribirlo correctamente");
      }
    }
    sc.close();
  }
}
