package classworks.lesson15_20230508;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<Integer> listRandomNumbers = new Random()
            .ints(1, 20)
            .limit(10)
            .boxed()
            .collect(Collectors.toList());
    List<String> strings = Arrays.asList("Barselona", "Milan", "Kyiv", "Belin", "Amsterdam", "Ankara", "Astrakhan");

    Person person1 = new Person("Ivan", 34);
    Person person2 = new Person("Petro", 24);
    Person person3 = new Person("Semen", 45);
    Person person4 = new Person("Dmitry", 54);
    Person person5 = new Person("Oleg", 12);

    person3.addFriend(person5);
    person3.addFriend(person4);
    person3.addFriend(person2);

    person1.addFriend(person2);
    person1.addFriend(person3);
    person1.addFriend(person5);

    person2.addFriend(person3);
    person2.addFriend(person4);
    person2.addFriend(person1);

    List<Person> persons = Arrays.asList(person1, person2, person3, person4, person5);

    List<String> cities = Arrays.asList("Barselona,1200", "Milan,45000", "Kyiv,134234", "Berlin,234234234");
    List<Book> books = Arrays.asList(
            new Book("The Name of the Wind", "Patrick Rothfuss", 2019),
            new Book("Harry Potter and the Deathly Hallows", "J.K. Rowling", 2017),
            new Book("The Final Empire", "Brandon Sanderson", 2021),
            new Book("The Way of Kings", "Brandon Sanderson", 2018),
            new Book("A Storm of Swords", "George R.R. Martin", 2000),
            new Book("A Storm of Swords 2", "George R.R. Martin", 2020)
    );

    getNums(listRandomNumbers);
    getA(strings);
    getAvgAge(persons);

    System.out.println("-------------------");
    System.out.println(cities);
    List<String> topNCities = getTOPNCities(cities, 2);
    System.out.println(topNCities);

    System.out.println("-------------------");
    System.out.println(books);
    List<String> mostProAuthors = getMostProAuthors(books);
    System.out.println(mostProAuthors);

    System.out.println("-------------------");
    findMostCommonFriends(persons);
  }

  public static void getNums(List<Integer> integers) {
    /**
     * Дан список целых чисел.
     * Найдите минимальное и максимальное значения в списке и выведите их на консоль.
     * 5-10
     */
    System.out.println(integers);
    int max = integers.stream()
            .mapToInt(e -> e)
            .max()
            .orElse(-1);
    int min = integers.stream()
            .mapToInt(e -> e)
            .min()
            .orElse(-1);
    System.out.println("MAX = " + max + ", MIN = " + min);
  }

  public static void getA(List<String> strings) {
    /**
     * Дан список строк. Найдите все строки, которые начинаются с буквы "A",
     * отсортируйте их по алфавиту и выведите на консоль.
     * 6-10
     */
    System.out.println(strings);
    strings.stream()
            .filter(e -> e.toUpperCase().startsWith("A"))
            .sorted()
            .forEach(System.out::println);
  }

  public static void getAvgAge(List<Person> people) {
    /**
     * Дан список объектов класса Person,
     * содержащих поля name и age.
     * Найдите средний возраст всех людей в списке и выведите его на консоль.
     * 7-10
     */
    System.out.println(people);
    double averageAge = people.stream()
            .mapToInt(Person::getAge)
            .average()
            .orElse(0);
    System.out.println("Average = " + averageAge);
  }

  public static List<String> getTOPNCities(List<String> cities, int n) {
    /**
     * Дан список строк, каждая строка
     * содержит название города и его население в тысячах человек,
     * разделенных запятой. Необходимо найти топ N городов с
     * наибольшим населением. Напишите метод, который принимает
     * список строк и число N и возвращает список топ N городов.
     * String str = "New-York,10000"
     *
     * 8-10
     */
    List<String> selectList = cities.stream()
            .collect(Collectors.toMap(e -> e.split(",")[0], e -> Integer.parseInt(e.split(",")[1])))
            .entrySet()
            .stream().sorted((o1, o2) -> (-1) * o1.getValue().compareTo(o2.getValue()))
            .limit(n)
            .map(Map.Entry::getKey)
            .toList();

    return selectList;
  }

  public static List<String> getMostProAuthors(List<Book> books) {
    /**
     * Дана коллекция объектов класса Book, содержащая поля title,
     * author и year. Напишите метод, который находит автора,
     * написавшего наибольшее количество книг. Если таких авторов несколько,
     * то вернуть список их имен.
     *
     * 9-10
     */
    return books.stream()
            .collect(Collectors.toMap(Book::getAuthor, e -> 1, Integer::sum))
            .entrySet()
            .stream()
            .filter(e -> e.getValue() ==
                    Collections.max(
                          books.stream().collect(Collectors.toMap(Book::getAuthor, b -> 1, Integer::sum)).values()
                    )
            )
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
  }

  public static List<String> findMostCommonFriends(List<Person> people) {
    /**
     * Дана коллекция объектов класса Person, содержащая поля name и список
     * friends, представляющий список друзей данного человека. Напишите метод,
     * который находит двух людей в коллекции, у которых максимальное число общих друзей.
     * Если таких людей несколько, то вернуть список их имен.
     * 10-10
     */

    //https://habr.com/ru/companies/vk/articles/720956/

    Map<String, String> collect = people.stream()
            .collect(Collectors.toMap(e -> e.getName(), e -> {
              int[] stat = new int[people.size()];                      ;
              for (int i = 0; i < people.size(); i++) {
                if (e.getFriends().contains(people.get(i))) {
                  stat[i] = 1;
                } else {
                  stat[i] = 0;
                }
              }
              System.out.println(Arrays.toString(stat));
              return Arrays.toString(stat);
            }));
    System.out.println(collect);
    return null;
  }
}
