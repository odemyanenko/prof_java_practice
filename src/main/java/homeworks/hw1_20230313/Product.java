package homeworks.hw1_20230313;

public class Product {
  private int id;
  private String title;
  private Category category;
  private Brand brand;
  private String description;
  private String urlImg;
  private double basePrice;
  private double discountPrice;
  private boolean isOffer;
  private boolean isRecommended;

  public Product(int id, String title, Category category, Brand brand, String description, String urlImg, double basePrice, double discountPrice) {
    this.id = id;
    this.title = title;
    this.category = category;
    this.brand = brand;
    this.description = description;
    this.urlImg = urlImg;
    this.basePrice = basePrice;
    this.discountPrice = discountPrice;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public Brand getBrand() {
    return brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getUrlImg() {
    return urlImg;
  }

  public void setUrlImg(String urlImg) {
    this.urlImg = urlImg;
  }

  public double getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(double basePrice) {
    this.basePrice = basePrice;
  }

  public double getDiscountPrice() {
    return discountPrice;
  }

  public void setDiscountPrice(double discountPrice) {
    this.discountPrice = discountPrice;
  }

  public boolean isOffer() {
    return isOffer;
  }

  public void setOffer(boolean offer) {
    isOffer = offer;
  }

  public boolean isRecommended() {
    return isRecommended;
  }

  public void setRecommended(boolean recommended) {
    isRecommended = recommended;
  }
}
