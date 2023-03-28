package homeworks.hw3_20230327;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Palindrom {
  public static void main(String[] args) {
    String s = "ASSDDSSA";
    String d = "HELLO";

    System.out.println("Is \"" + s + "\" Palindrom? - " + isPalindrom(s));
    System.out.println("Is \"" + d + "\" Palindrom? - " + isPalindrom(d));
  }

  public static boolean isPalindrom(String text) {
    List<Character> list = new ArrayList<>();
    for (int i = 0; i < text.length(); i++) {
      list.add(text.charAt(i));
    }
    if (list.size() == 0) {
      return false;
    }

    ListIterator<Character> iteratorFirst = list.listIterator();
    ListIterator<Character> iteratorEnd = list.listIterator(list.size());

    for (int i = 0; i < list.size() / 2; i++) {
      if (iteratorFirst.hasNext() && iteratorEnd.hasPrevious()) {
        if (iteratorFirst.next() != iteratorEnd.previous()) {
          return false;
        }
      }
    }
    return true;
  }
}
