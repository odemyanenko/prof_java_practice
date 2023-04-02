package classworks.lesson7_20230329;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(new Random().nextInt(99));
    }
    list.stream()
            .map(el -> el * 10)
            .forEach(el -> System.out.println(el));
  }
}
