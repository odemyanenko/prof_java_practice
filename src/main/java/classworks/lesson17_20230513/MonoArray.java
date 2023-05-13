package classworks.lesson17_20230513;

import java.util.Arrays;

public class MonoArray {
  public static void main(String[] args) {
    int[] base1 = {1, 1, 44, 56, 89, 90};
    int[] base2 = {1, 1, 44, 56, 9, 90};
    int[] base3 = {1, 1, 1, 1, 1, 1};
    int[] base4 = {11, 8, 4, 2, 2, 1};

    System.out.println(Arrays.toString(base1));
    System.out.println("is Mono Array: " + checkIsMonoArray(base1));
    System.out.println(Arrays.toString(base2));
    System.out.println("is Mono Array: " + checkIsMonoArray(base2));
    System.out.println(Arrays.toString(base3));
    System.out.println("is Mono Array: " + checkIsMonoArray(base3));
    System.out.println(Arrays.toString(base4));
    System.out.println("is Mono Array: " + checkIsMonoArray(base4));
  }

  private static boolean checkIsMonoArray(int[] array) {
    boolean isIncrease = false;
    boolean isDecrease = false;

    int start = array[0];

    for (int i = 1; i < array.length; i++) {
      if (start > array[i]){
        isIncrease = true;
      } else if (start < array[i]) {
        isDecrease = true;
      }
      if (isIncrease && isDecrease){
        return false;
      }
      start = array[i];
    }
    return true;
  }
}
