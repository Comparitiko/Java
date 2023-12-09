package PracticasPersonales.TipoExamen;

/*
  Calcula ln(x+1) usando esta fórmula.
  Realiza el cálculo hasta que un sumando y el siguiente se diferencien en menos de 0.0001.
  Compruébalo con una calculadora para x = 0.5 
*/

public class TEPractica7 {

  public static void main(String[] args) {
      double x = 0.5;
      double sumaActual = x;
      double terminoActual = x;
      int n = 1;

      while (Math.abs(terminoActual) >= 0.0001) {
          n++;
          terminoActual *= -x / n;
          sumaActual += terminoActual;
      }

      System.out.printf("ln(%.2f + 1) aproximado: %.5f%n", x, sumaActual);
  }
}