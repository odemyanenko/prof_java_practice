package classworks.lesson14_20230503;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Main {
  public static void main(String[] args) {
    //Найти среднее арифметическое всех элементов массива.
    task1();

    //Найти максимальный элемент в списке строк, длина которых больше 5 символов.
    task2();

    //Найти первый элемент списка, который начинается с буквы "A", или вернуть пустой Optional, если такого элемента нет.
    task3();

    //Найти сумму квадратов всех четных чисел в массиве.
    task4();

    //Получить все уникальные слова из списка строк, отсортированные в алфавитном порядке.
    task5();
  }

  private static void task5() {
    List<String> list = Arrays.asList("apple", "banana", "orange", "pear", "orange", "apple");

    System.out.println("Task 5. Получить все уникальные слова из списка строк, отсортированные в алфавитном порядке.");

    List<String> resultStrings = list.stream()
            .distinct()
            .sorted()
            .toList();

    System.out.println(resultStrings);
  }

  private static void task4() {
    int[] arr = {1, 2, 3, 4, 5};

    System.out.println("Task 4. Найти сумму квадратов всех четных чисел в массиве.");

    int sum = Arrays.stream(arr)
            .filter(e -> e % 2 == 0)
            .map(e -> e * e)
            .sum();

    System.out.println(sum);
  }

  private static void task3() {
    List<String> list = Arrays.asList("apple", "banana", "apricot", "orange", "avocado");

    System.out.println("Task 3. Найти первый элемент списка, который начинается с буквы \"A\", или вернуть пустой Optional, если такого элемента нет.");

    Optional<String> first = list.stream()
            .filter(e -> e.toUpperCase().startsWith("A"))
            .findFirst();

    System.out.println(first);
  }

  private static void task2() {
    List<String> list = Arrays.asList("apple", "banana", "pear", "orange", "grapefruit");

    System.out.println("Task 2. Найти максимальный элемент в списке строк, длина которых больше 5 символов.");

    String max = list.stream()
            .filter(s -> s.length() > 5)
            .max(String::compareTo)
            .get();

    System.out.println(max);
  }


  private static void task1() {
    int[] arr = {1, 2, 3, 4, 5};

    System.out.println("Task 1. Найти среднее арифметическое всех элементов массива.");

    double average = Arrays.stream(arr)
            .average()
            .orElse(0.0);
    System.out.println(average);

  }
}
