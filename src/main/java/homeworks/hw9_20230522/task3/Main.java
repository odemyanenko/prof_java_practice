package homeworks.hw9_20230522.task3;

/*
        Напишите код для чтения данных из файла и записи в другой файл.
        Ваш код должен корректно обрабатывать следующие ситуации:
        Исходный файл не существует.
        Невозможно открыть файл для чтения (например, из-за отсутствия прав доступа).
        Невозможно открыть файл для записи.
        Происходит ошибка во время чтения или записи.
        В каждом из этих случаев ваш код должен выбрасывать пользовательское исключение,
        которое содержит информацию о том, что пошло не так, а также подробную информацию
        о первоначальном исключении (если оно есть).
*/

import java.io.*;
import java.nio.file.AccessDeniedException;

public class Main {
  public static void main(String[] args) {
    try {
      copyFile("src/main/java/classworks/lesson19_20230522/task3/resources/text_in.txt",
              "src/main/java/classworks/lesson19_20230522/task3/resources1/text_out.txt");
    } catch (FileProcessException e) {
      e.printStackTrace();
    }
  }

  private static void copyFile(String source, String destination) throws FileProcessException {
    try (BufferedReader reader = new BufferedReader(new FileReader(source));
         BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
      String line;
      while ((line = reader.readLine()) != null) {
        writer.write(line);
        writer.newLine();
      }
    } catch (IOException e) {
        String message = "";
        if (e.getClass() == FileNotFoundException.class) {
          message = "File not found...";
        } else if (e.getClass() == AccessDeniedException.class) {
          message = "Access denied to read file...";
        }
        else {
          message = "Other error...";
        }
      throw new FileProcessException(ErrorMessage.SMTH_PROCESS_MSG + " : " + message + " : " + e.getMessage());
    }
  }
}
