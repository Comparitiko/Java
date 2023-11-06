public class Arrays1 {

  public static int genNota () {
    return (int) Math.ceil(Math.random() * 11) - 1;
  }
  
  public static void main(String[] args) {

    int[] notas = new int[10000];

    // Rellenar array
    for (int i = 0; i != notas.length; i++) {

      notas[i] = genNota();

    }

    // Recorrer al reves
    for (int i = notas.length - 1; i > 0; i--) {

      System.out.println(notas[i]);

    }

    System.out.println(notas[2]);

    int tamanio = 50;
    double[] precios = new double[tamanio];

    System.out.println(precios.length);

    String[] nombres = new String[10];

    nombres[0] = "asd";

    System.out.println(nombres[0]);

  }

}