package classworks.lesson20_20230524;

public class Example3 {
  public static void main(String[] args) {
    Thread thread1 = new Thread(new T1());
    Thread thread2 = new Thread(new T2());
    Thread thread3 = new Thread(()-> System.out.println("!!!"));
    Thread thread4 = new Thread(()-> {
      for (int i = 0; i < 15; i++) {
        System.out.println("4: " + i*10);
      }
    });

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
  }
}

class T1 implements Runnable{
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("ThreadEx1: " + i);
    }
  }
}

class T2 implements Runnable{
  @Override
  public void run() {
    for (char i = 'a'; i < 'u'; i++) {
      System.out.println("ThreadEx2: " + i);
    }
  }
}
