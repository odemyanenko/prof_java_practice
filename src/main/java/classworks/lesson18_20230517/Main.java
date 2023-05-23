package classworks.lesson18_20230517;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    System.out.println("Task1.");
    String input = "Contact us at info@example.com or support@example.com";
    System.out.println(input);
    System.out.println(replace(input));

    System.out.println("Task2.");
    String phoneNumber = "+1-555-123-4567";
    System.out.println("Is phone correct? - " + check(phoneNumber));

    System.out.println("Task3.");
    String url = "https://www.example.com/path/to/page.html";
    System.out.println(url);
    System.out.println("Is URL correct? - " + isValidURL(url));
  }

  /**
   *Задача 1 (Сложность 4/10):
   *Найти и заменить все email адреса в строке на "REDACTED".
   */
  private static String replace(String input) {
    String replacement = "REDACTED";
//    String regEx = "\\w+@\\w+\\.[a-zA-Z]{2,3}(\\.[A-Za-z]{2,3})?";
//    String regEx = "\\b[\\w.%-]+@[\\w.-]+\\.[A-Za-z]{2,4}\\b";
    String regEx = "\\w+\\@\\w+.\\w{2,4}";

    return input.replaceAll(regEx, replacement);
  }

  /**
   * Задача 2 (Сложность 6/10):
   * Проверить, является ли строка валидным номером телефона
   * в формате "+X-XXX-XXX-XXXX", где X - цифра.
   */

  //String phoneNumber = "+1-555-123-4567";
  private static boolean check(String phoneNumber) {
    String regEx = "(\\+\\-\\d{3}\\-\\d{3}\\-\\d{4})";

    Pattern pattern = Pattern.compile(regEx);
    Matcher matcher = pattern.matcher(phoneNumber);

    return matcher.matches();
  }

  /**
   * Задача 3 (Сложность 8/10):
   * Проверить, является ли строка валидным URL-адресом,
   * начинающимся с "http://" или "https://",
   * и содержащим доменное имя и путь.
   */

  // String url = "https://www.example.com/path/to/page.html";
  private static boolean isValidURL(String URL) {
    // https://urlregex.com/
//    String regEx = "^(http|https)://([\\w.-]+)(/\\w*)?$";
//    String regEx = "\\bhttps?://\\S+\\b";
    String regEx = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
    return URL.matches(regEx);

    /*
    	private static boolean isValid(String url) {
		String urlPattern = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		Pattern pattern = Pattern.compile(urlPattern, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(url);
		return matcher.matches();
	}
    * */

  }
}
