package homeworks.hw9_20230522.task3;

import java.io.IOException;

public class FileProcessException extends IOException {
  public FileProcessException(String message) {
    super(message);
  }
}

class ErrorMessage {
  public static final String SMTH_PROCESS_MSG = "Something happened while IO data";
}