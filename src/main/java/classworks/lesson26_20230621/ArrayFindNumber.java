package classworks.lesson26_20230621;

public class ArrayFindNumber {
  public static void main(String[] args) {
    int[][] array = {
            {1, 5, 6, 8, 20},
            {2, 7, 9, 11, 30},
            {4, 9, 14, 18, 40},
            {5, 16, 22, 25, 50},
            {8, 19, 24, 29, 60}
    };

    boolean isExists = isExistsNumber(array, 27);
    System.out.println(isExists);
  }

  public static boolean isExistsNumber(int[][] array, int num) {
    return checkNumberArray(array, 0, array.length - 1, num);
  }

  private static boolean checkNumberArray(int[][] array, int rowIndex, int columnIndex, int num) {
    if (columnIndex < 0 || rowIndex == array.length) {
      return false;
    }
    System.out.print(array[rowIndex][columnIndex] + " ");
    if (array[rowIndex][columnIndex] == num) {
      return true;
    }
    if (array[rowIndex][columnIndex] < num) {
      return checkNumberArray(array, rowIndex + 1, columnIndex, num);
    } else {
      return checkNumberArray(array, rowIndex, columnIndex - 1, num);
    }
  }
}
