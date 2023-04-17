package homeworks.hw5_20230403;

import java.util.Random;

public class Player {
  private final int id;
  private String firstName;
  private String lastName;
  private int age;
  private static int nextId;

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  private static int getNextId() {
    return ++nextId;
  }

  public Player(String firstName, String lastName, int age) {
    this.id = getNextId();
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Player{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", age=" + age +
            '}';
  }

  public static Player generatePlayerWithParams(int from, int to) {
    Random random = new Random();

    String[] firstNames = {"Anna", "Vasiliy", "Petro", "Masha", "Oleg"};
    String[] lastName = {"Ivanenko", "Sydorenko", "Plusch", "Ogryzko", "Chmara"};

    return new Player(firstNames[random.nextInt(0, 5)],
            lastName[random.nextInt(0, 5)],
            random.nextInt(from, to));
  }
}
