package classworks.lesson6_20230327;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Olga");
    list.add("Sem");
    list.add("Sergei");
    list.add("Vitaliy");
    list.add("Borya");

    Iterator<String> iterator = list.iterator();
    ListIterator<String> listIterator = list.listIterator(list.size());//modern version
    while (iterator.hasNext()) {
//      System.out.println(iterator.next());
      String s = iterator.next();
      System.out.println(s);
      if ("Sem".equals(s)) {
        iterator.remove();
      }
    }
    System.out.println("----------------------------");
    System.out.println(list);
  }
}
