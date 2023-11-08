public class EjemploRef {
  
  public static void sumarValor (int[] notas, int valor) {
    for (int i = 0; i < notas.length; i++) {
      notas[i] = notas[i] + valor;
    }
  }

  public static void main(String[] args) {

    int[] notas = {5, 4, 6, 4, 5, 9};
    int valor = 3;

    for (int i = 0; i < notas.length; i++) {
      System.out.println(notas[i]);
    }

    System.out.println();
    sumarValor(notas, valor);

    for (int i = 0; i < notas.length; i++) {
      System.out.println(notas[i]);
    }

  }

}