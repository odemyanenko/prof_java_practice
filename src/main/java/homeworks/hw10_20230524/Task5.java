package homeworks.hw10_20230524;

/*
Создайте 3 потока, каждый из которых выводит свое имя 5 раз.
Каждый поток должен использовать метод run() для вывода имени.
*/

public class Task5 {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      ThreadPrintName thread = new ThreadPrintName();
      thread.setName("Thread #" + (i+1));
      thread.start();
    }
  }
}

class ThreadPrintName extends Thread{
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getName());
    }
  }
}
