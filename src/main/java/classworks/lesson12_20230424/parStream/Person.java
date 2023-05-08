package classworks.lesson12_20230424.parStream;

public class Person {
  private String Name;
  private int age;

  public Person(String name, int age) {
    Name = name;
    this.age = age;
  }

  public String getName() {
    return Name;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    Name = name;
  }

  @Override
  public String toString() {
    return "Person{" +
            "Name='" + Name + '\'' +
            ", age=" + age +
            '}';
  }
}
