package classworks.lesson16_20230510;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndPartitioningBy {
  public static void main(String[] args) {
    Student s1 = new Student("Sem", 4, 'm', 7.6);
    Student s2 = new Student("Sergey", 4, 'm', 8.6);
    Student s3 = new Student("Vitali", 3, 'm', 6.6);
    Student s4 = new Student("Olga", 4, 'f', 7.2);
    Student s5 = new Student("Nikalay", 2, 'm', 5.6);
    Student s6 = new Student("Mikhail", 1, 'm', 2.6);

    List<Student> students = new ArrayList<>();
    students.add(s1);
    students.add(s2);
    students.add(s3);
    students.add(s4);
    students.add(s5);
    students.add(s6);

//        Map<Integer, List<Student>> mapG =
//                students.stream()
//                        .peek(el -> el.setName(el.getName().toUpperCase()))
//                        .collect(Collectors.groupingBy(Student::getCourse));
//
//        for (Map.Entry<Integer, List<Student>> entry : mapG.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//
//        System.out.println("*********************************************************");
//
//        Map<Boolean, List<Student>> mapP =
//                students.stream()
//                        .collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 6));
//
//        for (Map.Entry<Boolean, List<Student>> entry : mapP.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

//        Map<String, Long> book = books.stream()
//                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));
//        Long maxBookCount = book.values().stream()
//                .max(Long::compareTo)
//                .orElse(0L);
//        List<String> strings = book.entrySet().stream()
//                .filter(ent -> ent.getValue().equals(maxBookCount))
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
  }
}