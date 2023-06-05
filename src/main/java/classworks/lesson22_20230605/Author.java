package classworks.lesson22_20230605;

import java.util.Objects;

public class Author {
  private String firstName;
  private String lastName;
  private int age;
  private boolean sex;

  public Author(String firstName, String lastName, int age, boolean sex) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.sex = sex;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  public boolean isSex() {
    return sex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Author author)) return false;
    return age == author.age && sex == author.sex && firstName.equals(author.firstName) && lastName.equals(author.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, age, sex);
  }

  @Override
  public String toString() {
    return "Author{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", age=" + age +
            ", sex=" + sex +
            '}';
  }
}
