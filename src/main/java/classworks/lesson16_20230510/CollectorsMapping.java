package classworks.lesson16_20230510;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsMapping {
  public static void main(String[] args) {
//        List<String> strings = Arrays.asList("Sem", "Nikalay", "Olga", "Mikhail");
//        List<Integer> integers = strings.stream()
//                .collect(Collectors.mapping(String::length, Collectors.toList()));
//
//        System.out.println(integers);

    List<String> strings = Arrays.asList("hello", "world", "example", "of", "stream", "operations");

    Map<Boolean, Map<String, Integer>> result = strings.stream()
            .collect(Collectors.partitioningBy(s -> s.length() > 3,
                    Collectors.mapping(String::length, Collectors.toMap(String::valueOf, len -> len))));

    System.out.println(result);
  }
}