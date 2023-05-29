package homeworks.hw10_20230524;

/*
Создайте 2 потока, которые выводят все четные числа от 1 до 20 и все нечетные числа от 1 до 20 соответственно.
Каждый поток должен использовать метод run() для вывода чисел.
*/

import javax.swing.*;

public class Task3 {
  public static void main(String[] args) {
    ThreadEvenOdd threadEven = new ThreadEvenOdd(true);
    threadEven.setName("Thread Even");
    ThreadEvenOdd threadOdd = new ThreadEvenOdd(false);
    threadOdd.setName("Thread Odd");

    threadEven.start();
    threadOdd.start();
  }
}

class ThreadEvenOdd extends Thread {
  private final boolean isEven;

  public ThreadEvenOdd(boolean isEven) {
    this.isEven = isEven;
  }

  @Override
  public void run() {
    for (int i = 1; i <= 20; i++) {
      if ((isEven && (i % 2 == 0)) || (!isEven && (i % 2 != 0))) {
        System.out.printf("%-12s : %-2d\n", Thread.currentThread().getName(), i);
      }
    }
  }
}
