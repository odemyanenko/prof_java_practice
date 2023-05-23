package classworks.lesson19_20230522;

import java.io.FileNotFoundException;

public class MyException extends FileNotFoundException {
  public MyException(String message) {
    super(message);
  }
}

class ErrorMessage {
  public static final String SMTH_NOT_FOUND = "smth not found exception";
}