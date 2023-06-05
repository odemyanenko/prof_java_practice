package classworks.lesson21_20230531.mockito.stub;

public class CustomerNotFoundException extends RuntimeException {
  public CustomerNotFoundException() {
    super("No such customer found!");
  }
}