package classworks.lesson20_20230524;

public class Example4 extends Thread{
  volatile boolean b = true;

  @Override
  public void run() {
    long counter = 0;
    while (b) {
      counter++;
    }
    System.out.println("Counter: " + counter);
  }

  public static void main(String[] args) throws InterruptedException {
    Example4 thread = new Example4();
    thread.start();

    Thread.sleep(1500);
    System.out.println("After 1.5 sec........");

    thread.b = false;
    thread.join(); //дождись пока thread закончит работу.

    System.out.println("Main end");
  }
}
