package homeworks.hw1_20230313;

public class Address {
  private int id;
  private String postCode;
  private String location;
  private String street;
  private String bldNumber;

  public Address(int id, String postCode, String location, String street, String bldNumber) {
    this.id = id;
    this.postCode = postCode;
    this.location = location;
    this.street = street;
    this.bldNumber = bldNumber;
  }

  public int getId() {
    return id;
  }

  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getBldNumber() {
    return bldNumber;
  }

  public void setBldNumber(String bldNumber) {
    this.bldNumber = bldNumber;
  }
}
