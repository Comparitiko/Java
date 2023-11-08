import java.util.Arrays;

public class ArraysSort {
  
  public static int genNum () {
    return (int) Math.ceil(Math.random() * 10);
  }

  public static void main(String[] args) {

    int[] nums = new int[100];

    for (int i = 0; i < nums.length; i++) {
      nums[i] = genNum();
    }

    System.out.println(Arrays.toString(nums));

    Arrays.sort(nums);

    System.out.println(Arrays.toString(nums));
 
  }

}