package homeworks.hw10_20230524;

/*
Создайте 4 потока, которые выводят сообщение "Hello, World!" каждый с задержкой в 1 секунду.
Каждый поток должен использовать метод run() для вывода сообщения.
*/

public class Task4 {
  public static void main(String[] args) {
    for (int i = 1; i <= 4; i++) {
      ThreadGreetings thread = new ThreadGreetings(i);
      thread.start();
    }
  }
}

class ThreadGreetings extends Thread {
  private final int num;

  public ThreadGreetings(int num) {
    this.num = num;
  }

  @Override
  public void run() {
    try {
      Thread.sleep(1000);
      System.out.printf("Thread (%d) : Hello, World!\n", num);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

