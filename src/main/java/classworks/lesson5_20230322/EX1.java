package classworks.lesson5_20230322;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class EX1 {
  public static void main(String[] args) {
    Info<Integer> info = new Info<>(55555);
    System.out.println(info);
    Integer a = info.getValue();
    System.out.println(a);
  }
}

@AllArgsConstructor
@ToString
class Info<T> {
  private T value;

  public T getValue() {
    return value;
  }
}
