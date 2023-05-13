package classworks.lesson15_20230508;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
  private String name;
  private int age;

  private List<Person> friends = new ArrayList<>();

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public List<Person> getFriends() {
    return Collections.unmodifiableList(friends);
  }

  public void addFriend(Person friend){
    friends.add(friend);
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
