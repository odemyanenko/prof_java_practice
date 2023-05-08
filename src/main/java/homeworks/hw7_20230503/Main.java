package homeworks.hw7_20230503;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;

import static java.nio.file.Files.readAllLines;

public class Main {
  public static void main(String[] args) {
    List<String> strings = Arrays.asList("Java", "Python", "C++", "Ruby", "111", "JavaScript", "PHP", "222");

    Optional<String> numberStr = task1(strings);
    if (numberStr.isPresent()) {
      System.out.println(numberStr.get());
    } else {
      System.out.println("Null value");
    }

    task2("src/main/java/homeworks/hw7_20230503/task2.txt");

    task3();

    task4();
  }

  private static void task4() {
    //Напишите программу на Java, которая запрашивает
    //у пользователя текст, содержащий числа в формате
    //"число.число", и выводит на экран среднее арифметическое всех чисел в тексте.
    System.out.println("Task4.");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter, please, new text (\"число.число\")...");
    String text = scanner.nextLine();
    String[] numbers = text.split("\\.");

    double average = Arrays.stream(numbers)
            .mapToInt(Integer::valueOf)
            .average()
            .orElse(0);

    System.out.println(average);
  }

  private static void task3() {
    //Напишите программу на Java, которая
    //запрашивает у пользователя строку и выводит
    //на экран все уникальные слова в этой строке, отсортированные в алфавитном порядке.
    System.out.println("Task3.");
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter, please, new text...");
    String text = scanner.nextLine();

    String[] words = text.split("\\W");

    Arrays.stream(words)
            .distinct()
            .sorted(String::compareToIgnoreCase)
            .forEach(System.out::println);
  }

  private static void task2(String fileName) {
    //написать программу на Java, которая считывает текстовый файл,
    //заменяет в нем все вхождения слова "???"
    //на слово "вырезано цензурой" и сохраняет изменения в тот же файл
    System.out.println("Task2.");
    Path path = Path.of(fileName);
    try {
      List<String> listString = Files.readAllLines(path);
      List<String> list = listString.stream()
              .map(e -> e.replaceFirst("вырезано цензурой", "???"))
              .toList();
      Files.write(path, list);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static Optional<String> task1(List<String> strings) {
    //написать программу на Java, которая на вход получает массив
    //строк и проверяет, есть ли среди них хотя бы одна строка,
    //содержащая только цифры. Если есть, то программа должна вернуть эту строку,
    //иначе - вернуть null.
    System.out.println("Task1.");
    return strings.stream()
            .filter(e -> e.chars().allMatch(Character::isDigit))
            .findFirst()
            ;
  }
}
