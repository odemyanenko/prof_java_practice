package homeworks.hw11_20230614;

import java.util.ArrayList;
import java.util.List;

class Delivery implements Runnable {
  private List<Car> cars = new ArrayList<>();

  public Delivery(List<Car> cars) {
    this.cars = cars;
  }

  @Override
  public void run() {
    try {
      while (true) {
        synchronized (this) {
          while (cars.isEmpty()) {
            wait();
          }

          for (Car car : cars) {
            System.out.println("Sell car: " + car.getId());
          }
          cars.clear();
          notifyAll();
        }

        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public synchronized void deliver(Car car) {
    cars.add(car);
    System.out.println("Delivery: " + car.getId());

    notifyAll();
  }
}