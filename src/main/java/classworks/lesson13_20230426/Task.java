package classworks.lesson13_20230426;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Task {
  public static void main(String[] args) {
    int[] arr = {1, 2, 1};
//    long s = Arrays.stream(arr)
//            .map(el -> el * 10)
//            .count();

    System.out.println(isExistsDuplicate1(arr));
    System.out.println(isExistsDuplicate2(arr));
    System.out.println(isExistsDuplicate3(arr));
  }

  public static boolean isExistsDuplicate1(int[] array){
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] == array[j]) {
          return true;
        }
      }
    }
    return false;
  }

  public static boolean isExistsDuplicate2(int[] array){
    return Arrays.stream(array)
            .distinct().count() != array.length;
  }

  public static boolean isExistsDuplicate3(int[] array){
    Set<Integer> mySet = Arrays.stream(array).boxed().collect(Collectors.toSet());
    return mySet.size() != array.length;
  }
}
