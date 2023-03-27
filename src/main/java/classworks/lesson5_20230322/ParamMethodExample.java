package classworks.lesson5_20230322;

import java.util.ArrayList;
import java.util.List;

public class ParamMethodExample {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(11);
    list.add(12);
    list.add(13);
    list.add(14);
    System.out.println(list);

    int a = Methods.getSmth(list);
    System.out.println(a);
  }
}

class Methods{
  public static <T> T getSmth(List<T> al) {
    return al.get(0);
  }
}
