import java.util.Arrays;

public class ArraysFill {
  
  public static void main(String[] args) {

    int[] notas = new int[10];

    System.out.println(Arrays.toString(notas));

    Arrays.fill(notas, 5);

    System.out.println(Arrays.toString(notas));
  }

}