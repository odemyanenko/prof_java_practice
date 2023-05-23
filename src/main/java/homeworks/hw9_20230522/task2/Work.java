package homeworks.hw9_20230522.task2;

public class Work {
  private String title;

  public Work(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public String toString() {
    return "Work{" +
            "title='" + title + '\'' +
            '}';
  }

  public void process() {
    if (title.contains("err")) {
      throw new ProcessFailedException(ErrorMessage.SMTH_PROCESS_MSG);
    }
  }
}
