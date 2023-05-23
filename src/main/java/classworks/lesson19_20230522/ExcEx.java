package classworks.lesson19_20230522;

import java.io.FileReader;
import java.io.IOException;

public class ExcEx {
  private static void m1() {
    try (FileReader reader = new FileReader("123.txt")) {

    } catch (IOException e) {
      try {
        throw new MyException(ErrorMessage.SMTH_NOT_FOUND);
      } catch (MyException ex) {
        throw new RuntimeException(ex);
      }
    }
    System.out.println("M1");
  }

  private static void m2() {
    m1();
    System.out.println("M2");
  }

  private static void m3() {
    m2();
    System.out.println("M3");
  }

  public static void main(String[] args) {

  }
}