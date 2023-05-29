package classworks.lesson20_20230524;

public class Example2 {
  public static void main(String[] args) {
    ThreadEx1 threadEx1 = new ThreadEx1();
    ThreadEx2 threadEx2 = new ThreadEx2();
    threadEx1.start();
    threadEx2.start();
  }
}

class ThreadEx1 extends Thread{
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("ThreadEx1: " + i);
    }
  }
}

class ThreadEx2 extends Thread{
  @Override
  public void run() {
    for (char i = 'a'; i < 'u'; i++) {
      System.out.println("ThreadEx2: " + i);
    }
  }
}
