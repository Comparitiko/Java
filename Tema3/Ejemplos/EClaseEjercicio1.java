import java.util.Arrays;

public class EClaseEjercicio1 {
  
  public static void main(String[] args) {

    int[] nums = new int[20];

    // Rellenar con 1 el array
    Arrays.fill(nums, 1);

    // Cambiar valor si la posicion es 0 o par
    for (int i = 0; i < nums.length; i += 2) {
      nums[i] = - 1;
    }

    System.out.println(Arrays.toString(nums));

  }

}