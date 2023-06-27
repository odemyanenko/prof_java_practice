package classworks.lesson27_20230626.vip;

// Интерфейс для представления (View)

/**
 * Процесс работы паттерна следующий:
 *
 * Пользователь взаимодействует с представлением (например, нажимает кнопку).
 * Представление вызывает соответствующий метод презентера.
 * Презентер получает запрос от представления и выполняет необходимые действия.
 * Презентер может обращаться к интерактору для выполнения бизнес-логики.
 * Интерактор выполняет необходимую работу (например, проверяет данные для входа в систему).
 * Интерактор возвращает результаты презентеру.
 * Презентер обновляет представление с помощью методов, определенных в интерфейсе представления.
 */
interface LoginView {
  void showLoading();
  void hideLoading();
  void showErrorMessage(String message);
  void showSuccessMessage(String message);
}

// Интерфейс для интерактора (Interactor)
interface LoginInteractor {
  void login(String username, String password);
}

// Класс представителя (Presenter)
class LoginPresenter implements LoginInteractor {
  private LoginView view;

  public LoginPresenter(LoginView view) {
    this.view = view;
  }

  public void login(String username, String password) {
    view.showLoading();

    // Проверка данных и выполнение логики входа
    if ("admin".equals(username) && "admin123".equals(password)) {
      view.hideLoading();
      view.showSuccessMessage("Вход выполнен успешно");
    } else {
      view.hideLoading();
      view.showErrorMessage("Ошибка входа");
    }
  }
}

// Класс представления (Activity или Fragment)
class LoginActivity implements LoginView {
  private LoginPresenter presenter;

  public LoginActivity() {
    presenter = new LoginPresenter(this);
  }

  public void onLoginButtonClicked(String username, String password) {
    presenter.login(username, password);
  }

  public void showLoading() {
    // Отображение индикатора загрузки
  }

  public void hideLoading() {
    // Скрытие индикатора загрузки
  }

  public void showErrorMessage(String message) {
    // Отображение сообщения об ошибке
  }

  public void showSuccessMessage(String message) {
    // Отображение сообщения об успешном входе
  }
}

// Пример использования
public class Main {
  public static void main(String[] args) {
    LoginActivity loginActivity = new LoginActivity();
    loginActivity.onLoginButtonClicked("admin", "admin123");
  }
}