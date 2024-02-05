package SegundoTrimestre.Tema5.Practica2.McBurguer.dominio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class main {

  public static LocalDate crearLocalDate(String date) {
    String[] splitDate = date.split("/");
    StringBuffer sb = new StringBuffer(date.length());
    sb.append(splitDate[2]).append("-");
    sb.append(splitDate[1]).append("-");
    sb.append(splitDate[0]);
    return LocalDate.parse(sb.toString());
  }


  public static void main(String[] args) {
    LocalDate date = crearLocalDate("26/04/2025");
    System.out.println(date);
    System.out.println(ChronoUnit.DAYS.between(date, LocalDate.now()));
  }
}
