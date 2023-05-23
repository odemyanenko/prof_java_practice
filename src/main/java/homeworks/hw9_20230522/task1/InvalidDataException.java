package homeworks.hw9_20230522.task1;

public class InvalidDataException extends RuntimeException{
  public InvalidDataException(String message) {
    super(message);
  }
}

class ErrorMessage {
  public static final String LEN_STRING_GREATER_10 = "String length greater than 10";
}
