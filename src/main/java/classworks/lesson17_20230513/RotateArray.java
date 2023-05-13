package classworks.lesson17_20230513;

public class RotateArray {
  public static void main(String[] args) {
    int[][] base = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    printArray(base);
    int[][] rotate = getRotateArray(base);
    printArray(rotate);
  }

  private static void printArray(int[][] base) {
    for (int i = 0; i < base.length; i++) {
      for (int j = 0; j < base.length; j++) {
        System.out.printf("%-5d", base[i][j]);
      }
      System.out.println();
    }
  }

  private static int[][] getRotateArray(int[][] base) {
    int len = base.length;
    int[][] rotateArray = new int[len][len];

    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len; j++) {
        rotateArray[j][len - i - 1] = base[i][j];
      }
    }

    return rotateArray;
  }

}
