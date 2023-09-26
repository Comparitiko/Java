/*
  13. Realiza un programa en Java con una variable entera t la cual contiene un tiempo en segundos y
  queremos conocer este tiempo, pero expresado en horas, minutos y segundos.
 */
public class Ejercicio13 {
  
  public static void main(String[] args) {
    
    // Asignacion y declaracion de variables
    int t = 10000, horas, minutos, segundos;

    // Calcular horas, minutos y segundos
    minutos = t / 60;
    horas = minutos / 60;
    segundos = t - minutos * 60;
    minutos = (t - ((horas * 3600) - segundos)) / 60;

    // Imprimir en terminal la hora en formato h:m:s
    System.out.println(horas + ":" + minutos + ":" + segundos);

  }

}
