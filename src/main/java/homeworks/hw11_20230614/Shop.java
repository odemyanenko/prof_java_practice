package homeworks.hw11_20230614;

import java.util.List;

public class Shop implements Runnable {
  private final Factory factory;
  private final Delivery delivery;

  public Shop(Factory factory, Delivery delivery) {
    this.factory = factory;
    this.delivery = delivery;
  }

  @Override
  public void run() {
    try {
      while (true) {
        factory.run();
        Thread.sleep(1000);
        delivery.run();
        Thread.sleep(1000);
       // sellCars();
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

//  private void sellCars() {
//    List<Car> cars = delivery.getCars();
//    for (Car car : cars) {
//      System.out.println("Продажа автомобиля: " + car.getId());
//    }
//    delivery.clearCars();
//  }
}
