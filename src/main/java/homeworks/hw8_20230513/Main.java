package homeworks.hw8_20230513;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    m8();
    System.out.println("-------------------------------");
    m9();
  }

  /**
   * Дан двумерный массив строк, необходимо выбрать
   * все уникальные слова из массива и вернуть отсортированный
   * список слов в порядке убывания частоты их появления в массиве.
   */
  private static void m8() {
    String[][] words = {{"apple", "orange", "pear", "orange"},
            {"orange", "pear", "pear", "apple"},
            {"apple", "orange", "orange", "pear"},
            {"orange", "pear", "apple", "pear"}};

    String[] sortedUniqArray = Arrays.stream(words)
            .flatMap(Arrays::stream)
            .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
            .entrySet()
            .stream().sorted((o1, o2) -> (-1) * o1.getValue().compareTo(o2.getValue()))
            .map(Map.Entry::getKey)
            .toArray(String[]::new);

    System.out.println(Arrays.toString(sortedUniqArray));
  }

  /**
   * Есть двумерный массив строк, представляющий таблицу данных,
   * где первый столбец - это имена, а остальные столбцы -
   * это числовые значения. Вам нужно написать программу,
   * которая найдет среднее значение для каждого числового
   * столбца, игнорируя строки, которые не могут быть преобразованы в числа.
   */
  private static void m9() {
    String[][] data = {
            {"name1", "10", "20", "30"},
            {"name2", "40", "50", "not a number"},
            {"name3", "60", "70", "80"}
    };

    Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    Arrays.stream(data)
            .collect(Collectors.toMap(
                    x -> Arrays.stream(x)
                            .findFirst()
                            .orElse(""),
                    x -> Arrays.stream(x)
                            .filter(e -> e != Arrays.stream(x)
                                    .findFirst()
                                    .get())
                            .filter(pattern.asPredicate())
                            .mapToInt(Integer::valueOf)
                            .average()
                            .orElse(0)
            ))
            .entrySet()
            .stream().sorted(Comparator.comparing(Map.Entry::getKey))
            .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
  }
}
