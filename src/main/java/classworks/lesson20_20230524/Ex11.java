package classworks.lesson20_20230524;

public class Ex11 {
  static int count = 0;
  public static synchronized void incr() {
    count++;
    System.out.println(count);
  }

  public static void main(String[] args) {
    Thread thread1 = new Thread(new R1());
    Thread thread2 = new Thread(new R1());

    thread1.start();
    thread2.start();

    System.out.println(count);
  }
}

class R1 implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      Ex11.incr();
    }
  }
}