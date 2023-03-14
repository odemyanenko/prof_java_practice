package classworks.lesson2_20230313.pizza;

public class PizzaOffice {
  String phoneNumber;

  public Pizza getOrder(Order order) {
    Calculator.calculate();//------
    return order.getPizza();
  }
}
