package homeworks.hw10_20230524;

/*
Создайте 3 потока, которые вычисляют и выводят квадраты чисел от 1 до 10.
Каждый поток должен использовать метод run() для вычисления и вывода квадратов.
*/

public class Task2 {
  public static void main(String[] args) {
    for (int i = 1; i <= 3; i++) {
      Thread thread = new Thread(new SquareThread(i));
      thread.start();
    }
  }
}

class SquareThread implements Runnable {
  private final int number;

  public SquareThread(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  @Override
  public void run() {
    for (int i = 1; i <= 10 ; i++) {
      System.out.println(getNumber() + " : " +Math.pow(i,2));
    }
  }
}