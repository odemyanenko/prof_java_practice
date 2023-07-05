package homeworks.hw13_20230703;
/*
Вам необходимо создать аннотацию с именем StringConstraint для проверки ограничения длины строки.
Аннотация должна иметь два параметра: minLength и maxLength,
которые определяют минимальную и максимальную длину строки соответственно.

Затем, вам нужно создать класс StringValidator,
который будет содержать методы для проверки длины строки с помощью аннотации StringConstraint.
Класс StringValidator должен иметь метод validateString,
который принимает строку и выполняет проверку на соответствие ограничению длины, определенному в аннотации.
*/

public class StringValidatorDemo {
  public static void main(String[] args) {
    StringValidator validator = new StringValidator();
    System.out.println(validator.validateString("333sdf"));
  }
}
