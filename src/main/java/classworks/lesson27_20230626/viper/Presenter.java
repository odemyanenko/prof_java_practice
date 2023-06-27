package classworks.lesson27_20230626.viper;

import lombok.AllArgsConstructor;

/**
 * Presenter является связующим звеном между View и Interactor.
 * Он получает данные от Interactor и обновляет View.
 * Он также обрабатывает события от View и вызывает соответствующие
 * методы Interactor. Presenter также взаимодействует с Routing для навигации.
 */

@AllArgsConstructor
public class Presenter {
  private View view;
  private Interactor interactor;
  private Routing routing;

  public void loginButtonClicked(String username, String password) {
    view.showLoading();
    interactor.login(username, password);
  }

  public void onLoginSuccess() {
    view.hideLoading();
    view.showLoginSuccess();
    routing.navigateToHome();
  }

  public void onLoginError(String errorMessage) {
    view.hideLoading();
    view.showLoginError(errorMessage);
  }
}