package classworks.lesson27_20230626.viper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity представляет структуры данных приложения.
 * Он может включать классы моделей, хранение данных и
 * другие объекты, необходимые для представления бизнес-логики.
 */
@Getter
@Setter
@AllArgsConstructor
public class Entity {
  private String username;
  private String password;
}