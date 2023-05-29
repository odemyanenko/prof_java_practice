package classworks.lesson20_20230524;

import java.util.ArrayList;
import java.util.List;

public class Example5 {
  public static void main(String[] args) {
    MRI runnable = new MRI();
    Thread t1 = new Thread(runnable);
    Thread t2 = new Thread(runnable);
    Thread t3 = new Thread(runnable);

    t1.start();
    t2.start();
    t3.start();
  }
}
class Counter {
  static int count = 0;
}

class MRI implements Runnable{

  @Override
  public void run() {
    for (int i = 0; i < 3; i++) {
      increment();
    }
  }

  private void increment() {
    Counter.count++;
    System.out.println(Counter.count + " ! ");
  }
}
