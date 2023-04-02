package homeworks.hw4_20230329;

import java.util.*;

/*
1. Создать лист  А из 12 рандомных char
2. Создать стрингу В из 4 символов
3. Написать метод который проверяет можно ли составить из А слово В ,
   причем если в стринге буквы повторяются то они должны повторяться и в листе
*/

public class Main {
  public static void main(String[] args) {
    List<Character> listA = new ArrayList<>();

    fillListRandomCharacter(listA);
    String wordB = getWordB();

    System.out.println("Can compose word: " + isCanMakeWord(listA, wordB));
  }

  public static boolean isCanMakeWord(List<Character> list, String word) {
    Map<Character, Integer> mapB = new HashMap<>();

    getMapWithCountLetter(word, mapB);

    for (Character key : mapB.keySet()
    ) {
      if (Collections.frequency(list, key) < mapB.get(key)) {
        return false;
      }
    }
    return true;
  }

  private static char getRandomCharacter() {
    Random rnd = new Random();

    return (char) ('a' + rnd.nextInt('z' - 'a' + 1));
  }

  private static void fillListRandomCharacter(List<Character> listA) {
    for (int i = 0; i < 12; i++) {
      listA.add(getRandomCharacter());
    }
    System.out.println(listA);
  }

  private static String getWordB() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter word: ");

    return scanner.nextLine();
  }

  private static void getMapWithCountLetter(String word, Map<Character, Integer> mapB) {
    for (int i = 0; i < word.length(); i++) {
      Integer value = mapB.get(word.charAt(i));

      if ((value == null)) {
        mapB.put(word.charAt(i), 1);
      } else {
        mapB.put(word.charAt(i), ++value);
      }
    }
    System.out.println(mapB);
  }
}