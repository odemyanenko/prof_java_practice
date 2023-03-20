package classworks.lesson4_20230320.xor;

public class Main {
  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7, 5, 3, 1};

    System.out.println(getSearchNumber(arr));
  }

  private static int getSearchNumber(int[] arr) {
    int searchNumber = 0;
    for (int j : arr) {
      searchNumber = searchNumber ^ j;
    }
    return searchNumber;
  }
}
