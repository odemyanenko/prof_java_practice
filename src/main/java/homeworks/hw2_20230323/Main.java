package homeworks.hw2_20230323;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Написать метод ,
// который генерирует числа( 20 штук диапозоном до 20 ) /
// принимает число Х
// Дан лист элементов 1 / 2 / 5 / 2 / 4 / 5 / 5,
// надо пройтись по листу и вернуть лист ,который содержит
// нужные последовательности чисел ,которые в сумме дают Х
//и вывести длину минимальной последовательности
public class Main {
  public static void main(String[] args) {
    Random random = new Random();

    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < 20; i++) {
      list.add(random.nextInt(10));
    }
    System.out.println(list);

    List<List<Integer>> resultList = getListConsistsSumElement(list, 10);
    System.out.println(resultList);

    System.out.println("Min Length = " + getLengthMinList(resultList));
  }

  public static int getLengthMinList(List<List<Integer>> list){
    if (list.isEmpty()) {
      return 0;
    }
    int minLength = list.get(0).size();
    for (int i = 1; i < list.size(); i++) {
      if (minLength > list.get(i).size()) {
        minLength = list.get(i).size();
      }
    }
    return minLength;
  }
  public static List<List<Integer>> getListConsistsSumElement(List<Integer> list, int number) {
    List<List<Integer>> resultList = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      int lastIndex = getLastIndex(list, number, 0, i);
      if (lastIndex != -1) {
        resultList.add(list.subList(i, lastIndex + 1));
      }
    }
    return resultList;
  }

  public static int getLastIndex(List<Integer> list, int number, int sum, int index) {
    if (list.size() <= index) {
      return -1;
    }
    sum += list.get(index);
    if (sum == number) {
      return index;
    } else if (sum > number) {
      return -1;
    }

    return getLastIndex(list, number, sum, ++index);
  }
}
