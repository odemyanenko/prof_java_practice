package homeworks.hw9_20230522.task1;

/*
Задача 1: Уровень сложности 6/10

        Создайте пользовательское исключение InvalidDataException,
        которое наследуется от RuntimeException. Напишите метод, который принимает строку и выбрасывает InvalidDataException,
        если длина строки превышает 10 символов. Поместите вызов этого метода в блок try-catch и обработайте исключение,
        выводя сообщение об ошибке.
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String textLenMax10 = getString();
    System.out.println("Our string :" + textLenMax10);
  }

  private static String getString() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please, enter some text...");
    String input = scanner.nextLine();

    try {
      validate(input);
    }
    catch (InvalidDataException e) {
      input = "-";
      System.out.println(e.getMessage());
    }

    return input;
  }

  private static void validate(String input) {
    if (input.length() > 10) {
      throw new InvalidDataException(ErrorMessage.LEN_STRING_GREATER_10);
    }
  }
}
