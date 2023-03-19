package homeworks.hw1_20230313;

public class Cart {
  private int id;
  private User user;
  private Product product;
  private int quantity;

  public Cart(int id, User user, Product product, int quantity) {
    this.id = id;
    this.user = user;
    this.product = product;
    this.quantity = quantity;
  }

  public int getId() {
    return id;
  }

  public User getUser() {
    return user;
  }

  public Product getProduct() {
    return product;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
