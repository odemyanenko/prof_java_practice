package classworks.lesson14_20230503;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
1
//написать программу на Java, которая на вход получает массив
    //строк и проверяет, есть ли среди них хотя бы одна строка,
    // содержащая только цифры. Если есть, то программа должна вернуть эту строку,
    // иначе - вернуть null.

2
//написать программу на Java, которая считывает текстовый файл,
    // заменяет в нем все вхождения слова "???"
    // на слово "вырезано цензурой" и сохраняет изменения в тот же файл

3
//Напишите программу на Java, которая
    //запрашивает у пользователя строку и выводит
    //на экран все уникальные слова в этой строке, отсортированные в алфавитном порядке.

4
//Напишите программу на Java, которая запрашивает
    // у пользователя текст, содержащий числа в формате
    // "число.число", и выводит на экран среднее арифметическое всех чисел в тексте.

        */
public class Main1 {
  public static void main(String[] args) {
    //Дан список целых чисел. Напишите программу, которая вычисляет сумму нечетных чисел в списке.
    task1();
    //Дан список строк. Напишите программу, которая находит самую длинную строку в списке.
    task2();
    //Дан список объектов класса Person, у которых есть поля name и age. Напишите программу, которая находит все людей старше 25 лет и сортирует их по имени в алфавитном порядке.
    task3();
    //Дан список целых чисел. Напишите программу, которая находит максимальный элемент в списке и умножает его на 2.
    task4();
    //Дан список строк. Напишите программу, которая находит все строки, которые начинаются с буквы "J" и заканчиваются на букву "a", и выводит их в консоль.
    task5();
  }

  private static void task5() {
    List<String> strings = Arrays.asList("Java", "JavaScript", "Python", "Ruby", "JavaFX", "Scala");

    System.out.println("Task 5. Дан список строк. Напишите программу, которая находит все строки, которые начинаются с буквы \"J\" и заканчиваются на букву \"a\", и выводит их в консоль");

    strings.stream()
            .filter(s -> s.startsWith("J") && s.endsWith("a"))
            .forEach(System.out::println);
  }

  private static void task4() {
    List<Integer> numbers = Arrays.asList(1, 5, 10, 15, 20);

    System.out.println("Task 4. Дан список целых чисел. Напишите программу, которая находит максимальный элемент в списке и умножает его на 2.");

    int max = numbers.stream()
            .max(Integer::compareTo)
            .stream()
            .map(e -> e * 2)
            .findFirst()
            .orElse(0);

    System.out.println(max);
  }

  private static void task3() {
    List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 20),
            new Person("Charlie", 25),
            new Person("David", 35),
            new Person("Eve", 28));

    System.out.println("Task 3. Напишите программу, которая находит все людей старше 25 лет и сортирует их по имени в алфавитном порядке.");

    List<Person> sortedPeople = people.stream()
            .filter(e -> e.getAge() > 25)
            .sorted(Comparator.comparing(Person::getName))
            .toList();

    System.out.println(sortedPeople);
  }

  private static void task2() {
    List<String> strings = Arrays.asList("Java", "Python", "C++", "Ruby", "JavaScript", "PHP");

    System.out.println("Task 2. Дан список строк. Напишите программу, которая находит самую длинную строку в списке.");

    String s = strings.stream()
            .max(Comparator.comparingInt(String::length))
            .get();

    System.out.println(s);
  }

  private static void task1() {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    System.out.println("Task 1. Дан список целых чисел. Напишите программу, которая вычисляет сумму нечетных чисел в списке.");

    int sum = numbers.stream()
            .filter(e -> e % 2 > 0)
            .mapToInt(a -> a)
            .sum();

    System.out.println(sum);
  }
}
