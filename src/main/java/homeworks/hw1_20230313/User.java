package homeworks.hw1_20230313;

public class User {
  private int id;
  private Role role;
  private String firstName;
  private String lastName;
  private String gender;
  private String email;
  private String password;
  private Address address;
  private boolean isExistsCard;
  private boolean isAgreeInfo;
  private String marketSaturn;
  private boolean isWantReceiveNews;

  public User(int id, Role role, String firstName, String lastName, String gender, String email, String password, boolean isExistsCard, boolean isWantReceiveNews) {
    this.id = id;
    this.role = role;
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.email = email;
    this.password = password;
    this.isExistsCard = isExistsCard;
    this.isWantReceiveNews = isWantReceiveNews;
  }

  public int getId() {
    return id;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getEmail() {
    return email;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public boolean isExistsCard() {
    return isExistsCard;
  }

  public void setExistsCard(boolean existsCard) {
    isExistsCard = existsCard;
  }

  public boolean isAgreeInfo() {
    return isAgreeInfo;
  }

  public void setAgreeInfo(boolean agreeInfo) {
    isAgreeInfo = agreeInfo;
  }

  public String getMarketSaturn() {
    return marketSaturn;
  }

  public void setMarketSaturn(String marketSaturn) {
    this.marketSaturn = marketSaturn;
  }

  public boolean isWantReceiveNews() {
    return isWantReceiveNews;
  }

  public void setWantReceiveNews(boolean wantReceiveNews) {
    isWantReceiveNews = wantReceiveNews;
  }
}
