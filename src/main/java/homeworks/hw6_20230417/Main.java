package homeworks.hw6_20230417;

import java.util.Scanner;
/*
  Написать метод для проверки двух строк, возвращать Истина/Ложь.
  В первой строке символ # не учитывается в сравнении. По колличеству сичмволов не учитываются сисволы справа на лево.
  - "as#a#", "a" = true
  - "as##s", "s" = true
  - "asas##a", "as" = false
  - "##aa", "aa" = true
  - "ja#va###", "" = true
 */

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter 1 string with symbols (#): ");
    String strWithCaret = scanner.nextLine();

    System.out.println("Enter 2 string: ");
    String strCompare = scanner.nextLine();

    System.out.println("-----------------------------------");
    System.out.printf("Compare \"%s\" and \"%s\" = %b\n",
            strWithCaret,
            strCompare,
            compareString(strWithCaret, strCompare));
  }

  public static boolean compareString(String source, String base) {
    return convertString(source).equals(base);
  }

  private static String convertString(String source) {
    StringBuilder result = new StringBuilder();
    int countSymbol = 0;

    for (int i = source.length() - 1; i >= 0; i--) {
      char item = source.charAt(i);
      if (item == '#') {
        countSymbol++;
      } else {
        if (countSymbol > 0) {
          countSymbol--;
        } else {
          result.append(item);
        }
      }
    }

    return result.reverse().toString();
  }
}
