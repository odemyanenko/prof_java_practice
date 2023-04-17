package classworks.lesson8_20230403;

import lombok.AllArgsConstructor;

import java.util.Objects;
@AllArgsConstructor
public class Person {
  private String name;
  private String surname;
  private int age;
  private double salary;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person person)) return false;
    return age == person.age && Double.compare(person.salary, salary)
            == 0 && Objects.equals(name, person.name)
            && Objects.equals(surname, person.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surname, age, salary);
  }

  public static void main(String[] args) {
    Person p1 = new Person("T", "R", 23, 1000.0);
    Person p2 = new Person("T", "R", 23, 1000.0);

    System.out.println(p1.hashCode() == p2.hashCode());
    System.out.println(p1.equals(p2));
    System.out.println(p1 == p2);
  }
}
