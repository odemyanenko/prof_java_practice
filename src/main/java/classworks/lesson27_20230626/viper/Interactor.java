package classworks.lesson27_20230626.viper;

/**
 *
 * Interactor содержит бизнес-логику приложения.
 * Он получает запросы от представителя и выполняет необходимые
 * действия, такие как обработка данных, вызов API и т.д.
 * Взаимодействие с другими компонентами осуществляется через интерфейсы.
 */
public interface Interactor {
  void login(String username, String password);
}