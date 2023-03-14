package classworks.lesson2_20230313.test;

public class Main {
  public static void main(String[] args) {
    int[] numbers = {12, 45, 3, 45, 3, 4, 67, 457, 78};

    int min = Integer.MAX_VALUE;
    int prevMin = Integer.MAX_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (min > numbers[i]) {
        prevMin = min;
        min = numbers[i];
      } else if ((prevMin > numbers[i]) && (numbers[i] != prevMin)) {
        prevMin = numbers[i];
      }
    }

    System.out.println("Min element = " + min);
    System.out.println("Previous Min element = " + prevMin);
  }
}
