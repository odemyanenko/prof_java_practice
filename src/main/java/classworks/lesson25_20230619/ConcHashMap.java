package classworks.lesson25_20230619;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcHashMap {
  public static void main(String[] args) throws InterruptedException {
    Map<Integer, String> map = new ConcurrentHashMap<>();
    map.put(1, "Q");
    map.put(2, null);//!!!
    map.put(3, "A");
    map.put(4, "E");
    map.put(5, "F");

    Runnable R1 = () -> {
      Iterator<Integer> iterator = map.keySet().iterator();
      while (iterator.hasNext()) {
        try {
          Thread.sleep(800);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        Integer i = iterator.next();
        System.out.println(i + " : " + map.get(i));
      }
    };

    Runnable R2 = () -> {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      map.put(99, "UU");
    };

    Thread T1 = new Thread(R1);
    Thread T2 = new Thread(R2);

    T1.start();
    T2.start();

    T1.join();
    T2.join();

    System.out.println(map);
  }
}