package homeworks.lesson1_20230312;

import java.util.Scanner;

public class DemoArraySnakeFill {
  public static void main(String[] args) {
    ArrayUtil arrayUtil = new ArrayUtil();
    ArraySnakeFill arraySnakeFill = new ArraySnakeFill();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter, please, size array...");
    int sizeArray = scanner.nextInt();

    int[][] arraySnake = arrayUtil.createArrayBySize(sizeArray);
    int numberFill = 0;
//    for (int j = 0; j < arraySnake.length; j++) {
    for (int j = 0; j < 2; j++) {
      for (int i = 0; i < arraySnake.length - j; i++) {
        numberFill++;
        arraySnake[i][j] = numberFill;
      }
      for (int k = j+1; k < arraySnake.length; k++) {
        numberFill++;
        System.out.println(k);
        arraySnake[arraySnake.length - j - 1][k] = numberFill;
      }

//      for (int z = j+1; k < arraySnake.length; k++) {
//        numberFill++;
//        System.out.println(k);
//        arraySnake[arraySnake.length - j - 1][k] = numberFill;
//      }
    }

    for (int j = 0; j < arraySnake.length; j++) {
      for (int i = 0; i < arraySnake.length; i++) {
        System.out.print(arraySnake[i][j]);
        System.out.print(" ");
      }
      System.out.println(" ");
    }
  }
}
