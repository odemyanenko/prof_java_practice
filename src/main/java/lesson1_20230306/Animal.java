package lesson1_20230306;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Animal {
  private String breed;
  private int age;
  private double weight;
  private double height;

  public void doVoice() {
    System.out.println("Voice");
  }


}
