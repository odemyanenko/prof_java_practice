package homeworks.hw1_20230313;

public class Category {
  private int id;
  private Category parent;
  private boolean isGroup;
  private String code;
  private String name;
  private String description;

  public Category(int id, Category parent, boolean isGroup, String code, String name, String description) {
    this.id = id;
    this.parent = parent;
    this.isGroup = isGroup;
    this.code = code;
    this.name = name;
    this.description = description;
  }

  public int getId() {
    return id;
  }

  public Category getParent() {
    return parent;
  }

  public void setParent(Category parent) {
    this.parent = parent;
  }

  public boolean isGroup() {
    return isGroup;
  }

  public void setGroup(boolean group) {
    isGroup = group;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
