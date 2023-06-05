package classworks.lesson21_20230531.mockito.mock;

public class CreateTradeException extends RuntimeException {
  public CreateTradeException() {
    super("Cannot create such trade!");
  }
}