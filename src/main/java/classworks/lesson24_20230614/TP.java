package classworks.lesson24_20230614;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TP {
  public static void main(String[] args) throws InterruptedException {
    ExecutorService executorService
            = Executors.newFixedThreadPool(3);
    for (int i = 0; i < 10; i++) {
      executorService.execute(new RI());
      Thread.sleep(1000);
    }
    executorService.shutdown();
    executorService.awaitTermination(5, TimeUnit.DAYS);

    System.out.println("Main End");
  }
}

class RI implements Runnable {
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName());
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}

class RI1 implements Runnable {
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + "NEW");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}