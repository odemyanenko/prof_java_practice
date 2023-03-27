package classworks.lesson5_20230322;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class ParamEx {
  public static void main(String[] args) {
    P<String, Integer> p = new P<>("Java", 2023);
    System.out.println("Key: " + p.getValue1() + "\n" + "Value: " + p.getValue2());
  }
}

@Getter
@NoArgsConstructor
@AllArgsConstructor
class P<V1, V2> {
  private V1 value1;
  private V2 value2;

}

class U<V>{
  private V value1;
  private V value2;

  public U(V value1, V value2) {
    this.value1 = value1;
    this.value2 = value2;
  }
}
