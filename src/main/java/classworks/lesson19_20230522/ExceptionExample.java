package classworks.lesson19_20230522;

import java.io.FileReader;

public class ExceptionExample {
  public static void main(String[] args) {
    try {
      FileReader reader = new FileReader("123.txt");
    } catch (Exception e) {
      System.out.println("Error");
    }
  }
}
