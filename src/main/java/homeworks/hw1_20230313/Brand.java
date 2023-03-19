package homeworks.hw1_20230313;

public class Brand {
  private int id;
  private String name;
  private String notes;

  public Brand(int id, String name, String notes) {
    this.id = id;
    this.name = name;
    this.notes = notes;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }
}
