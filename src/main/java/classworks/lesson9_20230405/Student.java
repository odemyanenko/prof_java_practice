package classworks.lesson9_20230405;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Student {
  private String name;
  private int course;
  private double avgGrade;

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", course=" + course +
            ", avgGrade=" + avgGrade +
            '}';
  }
}
