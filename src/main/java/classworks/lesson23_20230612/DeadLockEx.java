package classworks.lesson23_20230612;

public class DeadLockEx {
  public static final Object LOCK_1 = new Object();
  public static final Object LOCK_2 = new Object();

  public static void main(String[] args) {
    DLE1 d1 = new DLE1();
    DLE2 d2 = new DLE2();

    d1.setName("--THREAD1--");
    d2.setName("--THREAD2--");

    d1.start();
    d2.start();
  }
}

class DLE1 extends Thread {
  @Override
  public void run() {
    System.out.println("*Try to catch LOCK_1*");
    synchronized (DeadLockEx.LOCK_1) {
      System.out.println("LOCK_1 - was caught");
      System.out.println("*Try to catch LOCK_2*");
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      synchronized (DeadLockEx.LOCK_2) {
        System.out.println("LOCK_1 and LOCK_2 were caught");
      }
    }
  }
}

class DLE2 extends Thread {
  @Override
  public void run() {
    System.out.println("*Try to catch LOCK_2*");
    synchronized (DeadLockEx.LOCK_2) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      System.out.println("LOCK_2 - was caught");
      System.out.println("*Try to catch LOCK_1*");
      synchronized (DeadLockEx.LOCK_1) {
        System.out.println("LOCK_1 and LOCK_2 were caught");
      }
    }
  }
}