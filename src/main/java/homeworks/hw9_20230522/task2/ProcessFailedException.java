package homeworks.hw9_20230522.task2;

public class ProcessFailedException extends RuntimeException{
  public ProcessFailedException(String message) {
    super(message);
  }
}

class ErrorMessage {
  public static final String SMTH_PROCESS_MSG = "Something happened while executing the process";
}