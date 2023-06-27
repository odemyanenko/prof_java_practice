package homeworks.hw11_20230614;

import java.util.ArrayList;
import java.util.List;

class Factory implements Runnable {
  private final int maxCars = 10;

  private List<Car> cars;
  private int carCount = 0;

  public Factory(List<Car> cars) {
    this.cars = cars;
  }

  @Override
  public void run() {
    try {
      while (true) {
        synchronized (this) {
          while (carCount >= maxCars) {
            wait();
          }

          cars.add(new Car(carCount));

          carCount++;
          System.out.println("Create Cars: " + carCount);

          notifyAll();
        }

        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}