package classworks.lesson23_20230612;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableEx1 {
  static int f;

  public static void main(String[] args) {
    ExecutorService executorService
            = Executors.newSingleThreadExecutor();
  }
}

class Factorial implements Callable<Integer> {
  int f;

  public Factorial(int f) {
    this.f = f;
  }

  @Override
  public Integer call() throws Exception {
    if(f <= 0) {
      throw new Exception("Incorrect number");
    }
    int result = 1;

    for (int i = 1; i <= f ; i++) {
      result = result * i;
    }
    return result;
  }
}