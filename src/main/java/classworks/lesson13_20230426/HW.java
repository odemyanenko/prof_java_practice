package classworks.lesson13_20230426;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10);
 * - Фильтрация списка на нечетные числа
 * - Определение максимального значения в списке
 * - Получение среднего значения списка целых чисел
 * - Нахождение суммы чисел, кратных 3 и 5, из списка чисел
 * - Поиск наибольшей длины последовательности из уникальных чисел в списке
 * <p>
 * List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
 * - Преобразование списка строк в список чисел
 * <p>
 * List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
 * - Фильтрация списка строк на те, которые начинаются с 'a' и преобразование их в верхний регистр
 * - Получение списка уникальных слов из списка строк, длина которых больше 4 символов
 * <p>
 * List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));
 * List<String> names = people.stream()
 * - Преобразование списка объектов класса в список их имен, отсортированных по возрасту
 *
 * - Написать метод (стримами и НЕ стримами),который проходится по массиву и находит все пары чисел, которые в сумме дают заданное число.
 *  int[] arr = {2, 3, 5, 6, 4, 7, 8};  K = 10 - [2 8] [3 7] [6 4] *
 */

public class HW {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10);
    List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
    List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "apple");
    List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));
    int[] arr = {2, 3, 5, 6, 4, 7, 8};

    task1(numbers);
    task2(numbers);
    task3(numbers);
    task4(numbers);
    task5(numbers);

    task6(strings);

    task7(words);
    task8(words);

    task9(people);

    System.out.println("--------------------------------------------------");
    task10_1(arr, 10);

  }

  private static void task10_1(int[] arr, int num) {
    List<Pair> pairList = new LinkedList<>();
    System.out.println("Task 10.1: Написать метод (стримами и НЕ стримами),который проходится по массиву и находит все пары чисел, которые в сумме дают заданное число.");
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == num){
          pairList.add(new Pair(arr[i], arr[j]));
        }
      }
    }
    System.out.println(pairList.toString());
  }

  private static void task9(List<Person> people) {
    System.out.println("Task 9: Преобразование списка объектов класса в список их имен, отсортированных по возрасту");
    List<String> names = people
            .stream()
            .sorted(Comparator.comparingInt(Person::getAge))
            .map(Person::getName)
            .toList();
    System.out.println(names.toString());
  }

  private static void task8(List<String> words) {
    System.out.println("Task 8: Получение списка уникальных слов из списка строк, длина которых больше 4 символов");
    System.out.println(
            words
                    .stream()
                    .filter(new Predicate<String>() {
                      @Override
                      public boolean test(String s) {
                        return s.length() > 4;
                      }
                    })
                    .collect(Collectors.toSet())
    );
  }

  private static void task7(List<String> words) {
    System.out.println("Task 7: Фильтрация списка строк на те, которые начинаются с 'a' и преобразование их в верхний регистр");
    System.out.println(
            words
                    .stream()
                    .filter(new Predicate<String>() {
                      @Override
                      public boolean test(String s) {
                        return !s.isEmpty() && s.charAt(0) == 'a';
                      }
                    })
                    .map(String::toUpperCase)
                    .collect(Collectors.toList())
    );
  }

  private static void task6(List<String> strings) {
    System.out.println("Task 6: Преобразование списка строк в список чисел");
    List<Integer> list = strings
            .stream()
            .map(Integer::parseInt)
            .toList();
    System.out.println(list.toString());
  }

  private static void task5(List<Integer> numbers) {
    System.out.println("Task 5: Поиск наибольшей длины последовательности из уникальных чисел в списке");
//    System.out.println(
//            numbers
//                    .stream()
//                    .
//    );
  }

  private static void task4(List<Integer> numbers) {
    System.out.println("Task 4: Нахождение суммы чисел, кратных 3 и 5, из списка чисел");
    System.out.println(
            numbers
                    .stream()
                    .filter(e -> e % 3 == 0 || e % 5 == 0)
                    .mapToInt(e -> e)
                    .sum()
    );
  }

  private static void task3(List<Integer> numbers) {
    System.out.println("Task 3: Получение среднего значения списка целых чисел");
    System.out.println(
            numbers
                    .stream()
                    .mapToDouble(e -> e)
                    .average()
                    .orElse(0.0)
    );
  }

  private static void task2(List<Integer> numbers) {
    System.out.println("Task 2: Определение максимального значения в списке");
    System.out.println(
            numbers
                    .stream()
                    .max(Integer::compare)
                    .get());
  }

  private static void task1(List<Integer> numbers) {
    System.out.println("Task 1: Фильтрация списка на нечетные числа");
    System.out.println(
            numbers
                    .stream()
                    .filter(e -> e % 2 > 0)
                    .collect(Collectors.toList()));
  }
}
