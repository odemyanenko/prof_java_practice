package homeworks.hw9_20230522.task2;

/*
Задача 2: Уровень сложности 5/10

        Имеется список объектов. Каждый объект имеет метод process(),
        который может выбросить исключение ProcessFailedException. Вам нужно написать код,
        который обрабатывает каждый объект в списке. Если при обработке какого-либо объекта возникает ProcessFailedException,
        ваш код должен продолжить обработку остальных объектов и после обработки всех объектов выбросить исключение,
        сообщающее, какие объекты не удалось обработать.
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Work> list = createListObjects();
    processList(list);
  }

  private static void processList(List<Work> list) {
    List<Work> unProcessList = new ArrayList<>();
    for (Work work : list
    ) {
      try {
        work.process();
      } catch (ProcessFailedException e) {
        unProcessList.add(work);
      }
    }

    if (unProcessList.size() > 0) {
      throw new RuntimeException("\nUnprocessed objects: " + unProcessList.toString());
    }
  }

  public static List<Work> createListObjects() {
    List<Work> list = new ArrayList<>();

    list.add(new Work("task stream"));
    list.add(new Work("task exception err"));
    list.add(new Work("task oop"));
    list.add(new Work("task fileIO"));
    list.add(new Work("task err"));

    return list;
  }
}
