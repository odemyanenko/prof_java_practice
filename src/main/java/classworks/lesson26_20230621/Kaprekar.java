package classworks.lesson26_20230621;

import java.util.*;
import java.util.stream.Collectors;

/*
        //- проверить что число состоит только из разных цифр -- 8925
        //- а = 2589
        //- в = 9852
        //- с = в - а
        //- sout(c) - 1185
        //- c --> digit
        //- 10(c)
*/

public class Kaprekar {
  public static void main(String[] args) {
    int number = 8925;
    kaprekar(number);
  }

  public static void kaprekar(int digit) {
    if (isConsistsDifferentDigits(digit)) {
      kaprekar(digit, 10);
    }
  }

  private static void kaprekar(int digit, int counter) {
    if (counter == 0) {
      return;
    }
    int a = getAscNumber(digit);
    int b = getDescNumber(digit);
    int c = b - a;
    System.out.println(c);
    kaprekar(c, --counter);
  }

  public static boolean isConsistsDifferentDigits(int number) {
    String numString = String.valueOf(number);
    Set<Character> setChars = new HashSet<>();
    for (int i = 0; i < numString.length(); i++) {
      if (!setChars.add(numString.charAt(i))) {
        return false;
      }
    }
    return true;
  }

  public static int getAscNumber(int number) {
    String s = String.valueOf(number)
            .chars()
            .mapToObj(Character::getNumericValue)
            .sorted()
            .mapToInt(Integer::intValue)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining());

    return Integer.parseInt(s);
  }

  public static int getDescNumber(int number) {
    String s = String.valueOf(number)
            .chars()
            .mapToObj(Character::getNumericValue)
            .sorted(Comparator.reverseOrder())
            .mapToInt(Integer::intValue)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining());

    return Integer.parseInt(s);
  }
}
