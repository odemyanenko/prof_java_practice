package classworks.lesson12_20230424.parStream;
/*

1. Создать коллекцию Person
        2э.. У персонов должен быть имя и возраст
        3 Пройтись по коллекции персонов и если возраст больше чем 35 то сделать имя заглавными буквами

*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
  public static void main(String[] args) {
    List<Person> list = new ArrayList<>();

    list.add(new Person("Ivanov", 37));
    list.add(new Person("Petrov", 23));
    list.add(new Person("Sidorov", 38));
    list.add(new Person("Pushkin", 57));

    System.out.println(list);

    list
            .stream()
            .map(el -> {
              if (el.getAge() > 35){
              el.setName(el.getName().toUpperCase());
              }
              return el;
            })
            .forEach(System.out::println);
//            .collect(Collectors.toList());
  }
}


