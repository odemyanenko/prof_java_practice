package classworks.lesson24_20230614;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {
  public static void main(String[] args) throws InterruptedException {
    Lock lock = new ReentrantLock();
    new Employee("A", lock);
    new Employee("F", lock);
    new Employee("B", lock);
    Thread.sleep(2000);
    new Employee("C", lock);
    new Employee("D", lock);
    new Employee("E", lock);
  }
}


class Employee extends Thread {
  String name;
  private Lock lock;

  public Employee(String name, Lock lock) {
    this.name = name;
    this.lock = lock;
    this.start();
  }

  @Override
  public void run() {
    if (lock.tryLock()) {
      try {
        Thread.sleep(300);
        System.out.println(name + " is using an ATM");
        System.out.println(name + " finished!!!");
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      } finally {
        lock.unlock();
      }
    } else {
      System.out.println(name + "--- Did not want to use it. Went away....(((");
    }
  }
}
