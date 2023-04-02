package classworks.lesson7_20230329;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionEx {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Nikolay", 2000);
    map.put("Olga", 2300);
    map.put("Sem", 2020);
    map.put("Sergei", 2300);
    map.put("Roma", 4000);
    map.put("Mikhail", 5000);

    System.out.println(map);

    System.out.println("------------------------------");
    Map<String, Integer> treeMap = new TreeMap<>();
    treeMap.put("Nikolay", 2000);
    treeMap.put("Olga", 2300);
    treeMap.put("Sem", 2020);
    treeMap.put("Sergei", 2300);
    treeMap.put("Roma", 4000);
    treeMap.put("Mikhail", 5000);

    System.out.println(treeMap);

    System.out.println("------------------------------");
    Map<Emp, Integer> mapEmp = new TreeMap<>();
    mapEmp.put(new Emp("Nikolay", 24), 2000);
    mapEmp.put(new Emp("Olga", 24), 2300);
    mapEmp.put(new Emp("Sem", 24), 2020);
    mapEmp.put(new Emp("Sergei", 20), 2300);
    mapEmp.put(new Emp("Roma", 40), 4000);
    mapEmp.put(new Emp("Mikhail", 44), 5000);

    System.out.println(mapEmp);
  }
}

class Emp implements Comparable<Emp> {
  String name;
  int age;

  public Emp(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int compareTo(Emp o) {
    return this.age == o.age ? this.name.compareTo(o.name) : this.age - o.age;
  }

  @Override
  public String toString() {
    return "Emp{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
