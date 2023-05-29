package classworks.lesson20_20230524;

public class Example6 {
  static int count = 0;

//synchronized input one thread
  public static synchronized void incr() {
//    public static void incr() {
    count++;
    System.out.println(Thread.currentThread().getName() + " : " + count);
  }

  public static void main(String[] args) {
    Thread thread1 = new Thread(new R());
    thread1.setName("Thread1");
    Thread thread2 = new Thread(new R());
    thread2.setName("Thread2");

    thread1.start();
    thread2.start();

    System.out.println(count);
  }
}

class R implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 50; i++) {
      Example6.incr();
    }
  }
}
