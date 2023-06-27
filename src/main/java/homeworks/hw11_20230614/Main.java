package homeworks.hw11_20230614;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Car> cars = new ArrayList<>();

    Factory factory = new Factory(cars);
    Delivery delivery = new Delivery(cars);
    Shop shop = new Shop(factory, delivery);

    Thread factoryThread = new Thread(factory);
    Thread deliveryThread = new Thread(delivery);
    Thread shopThread = new Thread(shop);

    factoryThread.start();
    deliveryThread.start();
    shopThread.start();
  }
}
