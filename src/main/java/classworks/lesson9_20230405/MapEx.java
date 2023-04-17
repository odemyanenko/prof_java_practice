package classworks.lesson9_20230405;

import java.util.*;

public class MapEx {
  public static void main(String[] args) {
    List<Student> list = new ArrayList<>();
//    Collections.synchronizedList()
//    Collections.nCopies();
//    Collections.max(list, new Comparator<Student>() {
//      @Override
//      public int compare(Student o1, Student o2) {
//        return 0;
//      }
//    });
    Collections.max(list, new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return (int)(o1.getAvgGrade() - o2.getAvgGrade());
      }
    });//==

    Student s1 = new Student("Nik", 2, 6.5);
    Student s2 = new Student("Petr", 3, 6.1);
    Student s3 = new Student("Ivan", 1, 5.5);
    Student s4 = new Student("Anna", 2, 7.5);
    Student s5 = new Student("Nika", 2, 3.2);
    Student s6 = new Student("Semen", 3, 4.5);

    Map<Student, Integer> map = new HashMap<>();
    map.put(s1, 25);
    map.put(s2, 23);
    map.put(s3, 23);
    map.put(s4, 44);
    map.put(s5, 21);
    map.put(s6, 25);

    System.out.println(map);

    for (Map.Entry<Student, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " || age: " + entry.getValue());
    }

    System.out.println("------------------------");
    Set<Student> studentSet = map.keySet();
    for (Student student : studentSet) {
      System.out.println(student);
    }
  }
}
