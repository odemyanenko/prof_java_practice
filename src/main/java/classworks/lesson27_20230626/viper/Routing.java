package classworks.lesson27_20230626.viper;

/**
 * Routing отвечает за навигацию между модулями в VIPER-приложении.
 * Он определяет пути и переходы между различными экранами.
 * Он взаимодействует с Presenter для осуществления навигации.
 */
public interface Routing {
  void navigateToHome();
}