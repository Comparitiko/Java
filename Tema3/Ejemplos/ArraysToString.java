import java.util.Arrays;

public class ArraysToString {
  
  public static void main(String[] args) {

    int[] notas = new int[2];
    
    System.out.println(Arrays.toString(notas));

    for (int i = 0; i < notas.length; i++) {
      if (i == 0) System.out.print("[" + notas[i] + ", ");
      else if (i == notas.length - 1) System.out.print(notas[i] + "]");
      else System.out.print(notas[i] + ", ");
    }

    System.out.println();

  }

}