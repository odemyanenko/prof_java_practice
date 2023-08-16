package homeworks.hw_20230815;

public class Account {
  private static int idCount;
  private final String id;
  private boolean status;
  private Zone zone;
  private double balance;

  {
    idCount = 0;
  }

  public Account() {
    this.id = generateId();
    this.status = true;
    this.zone = Zone.ZONE_1;
    this.balance = 0.0;
  }

  public Account(boolean status, Zone zone, double balance) {
    if (balance < 0) {
      throw new IllegalArgumentException("Balance can not be negative!");
    }
    this.id = generateId();
    this.status = status;
    this.zone = zone;
    this.balance = balance;
  }

  public String getId() {
    return id;
  }

  public boolean getStatus() {
    return status;
  }

  public Zone getZone() {
    return zone;
  }

  public double getBalance() {
    return balance;
  }

  private String generateId() {
    return String.format("%06d", ++idCount);
  }

  public enum Zone {
    ZONE_1, ZONE_2, ZONE_3
  }
}