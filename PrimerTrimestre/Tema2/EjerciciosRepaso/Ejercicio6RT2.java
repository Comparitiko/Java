/*
  6. Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la forma:
  suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de suspensos, el número
  de suficientes, el número de bienes, etc.
*/

public class Ejercicio6RT2 {

  // Generar un numero y devolverlo
  public static int generarNum () {

    return (int) Math.ceil(Math.random() * 10);

  }
  
  public static void main(String[] args) {

    int nSuspenso = 0, nSuficiente = 0, nBien = 0, nNotable = 0, nSobresaliente = 0;

    for (int i = 0; i != 20; i++) {

      int num = generarNum();

      switch (num) {
        case 1, 2, 3, 4:
          System.out.println("En el " + i + "º examen has sacado un " + num + ", has suspendido");
          nSuspenso++;
          break;
        case 5:
          System.out.println("En el " + i + "º examen has sacado un " + num + ", por lo tanto es un suficiente");
          nSuficiente++;
          break;
        case 6:
          System.out.println("En el " + i + "º examen has sacado un " + num + ", por lo tanto es un bien");
          nBien++;
          break;
        case 7, 8:
          System.out.println("En el " + i + "º examen has sacado un " + num + ", por lo tanto es un notable");
          nNotable++;
          break;
        default:
          System.out.println("En el " + i + "º examen has sacado un " + num + ", por lo tanto es un sobresaliente");
          nSobresaliente++;
          break;
      }

    }

    System.out.println();

    System.out.println("El numero de suspensos es de: " + nSuspenso);
    System.out.println("El numero de suficientes es de: " + nSuficiente);
    System.out.println("El numero de bienes es de: " + nBien);
    System.out.println("El numero de notables es de: " + nNotable);
    System.out.println("El numero de sobresalientes es de: " + nSobresaliente);

  }

}