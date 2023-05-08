package classworks.lesson12_20230424.parStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Test {
  private static final Random RANDOM = new Random();

  static List<Integer> list = new ArrayList<>();

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      list.add(RANDOM.nextInt(22));
    }

    int[] arr = {12, 31, 23, 12, 33, 45, 43, 75, 78, 56, 79, 86, 79};
//    Arrays.stream(arr) - array
//    list.stream() - list

    Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 66, 3443);

    Arrays.stream(arr)
            .map(el -> el * 3)
//            .map(el -> {
//              if (el == 0) {
//                return el;
//              } else {
//                return 5;
//              }
//            })
            .sorted()
            .distinct()
//            .filter(el -> el % 4 == 0)
            .forEach(System.out::println);

//    long time = System.currentTimeMillis();
//    double sum = list.stream().reduce(Integer::sum).get();
//    System.out.println("SUM: " + sum);
//    System.out.println("TIME: " + (System.currentTimeMillis() - time));

    Stream<String> st = Stream.of("asd", "ASDF", "asdfq", "qwert");
//    st.map(el -> {
//      return <el, el.length()>;
//    })

  }
}
