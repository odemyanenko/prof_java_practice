package homeworks.hw10_20230524;

/*
  Создайте 5 потоков, которые выводят числа от 1 до 10.
  Каждый поток должен использовать метод run() для вывода чисел.
*/
public class Task1 {
  public static void main(String[] args) {
    ThreadPrintNumber thread1 = new ThreadPrintNumber();
    ThreadPrintNumber thread2 = new ThreadPrintNumber();
    ThreadPrintNumber thread3 = new ThreadPrintNumber();
    ThreadPrintNumber thread4 = new ThreadPrintNumber();
    ThreadPrintNumber thread5 = new ThreadPrintNumber();

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
    thread5.start();
  }
}

class ThreadPrintNumber extends Thread {
  @Override
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(this.getName() + " : " + i);
    }
  }
}