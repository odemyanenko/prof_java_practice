package classworks.lesson24_20230614;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LE {
  public static void main(String[] args) {
    Call call = new Call();
    Thread T1 = new Thread(call::mobileCall);
    Thread T2 = new Thread(call::skypeCall);
    Thread T3 = new Thread(call::waCall);

    T1.setName("T1");
    T2.setName("T2");
    T3.setName("T3");

    T1.start();
    T2.start();
    T3.start();
  }
}

class Call {
  private Lock lock = new ReentrantLock();

  void mobileCall() {
    lock.lock();

    try {
      System.out.println("Mobile call was started");
      Thread.sleep(1500);
      System.out.println("Mobile call finished");
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }

  void skypeCall() {
    lock.lock();
    try {
      System.out.println("Skype call was started");
      Thread.sleep(1500);
      System.out.println("Skype call finished");
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }

  void waCall() {
    lock.lock();
    try {
      System.out.println("WA call was started");
      Thread.sleep(1500);
      System.out.println("WA call finished");
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }
}