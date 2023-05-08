package classworks.lesson11_20230419;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Type1 implements Comparable<Type1>{
  String s;
  int a;
  float f;

  @Override
  public int compareTo(Type1 o) {
    return this.a - o.a;
  }
}

class Type2 {
  int age;
}

class Main {
  public static void main(String[] args) {
    int result = 8;
    System.out.println(5 / result);
  }
}

