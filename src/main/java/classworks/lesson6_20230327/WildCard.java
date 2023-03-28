package classworks.lesson6_20230327;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
  public static void main(String[] args) {
//    List<? extends Number> list = new ArrayList<Integer>();
//    list.add(23);
    List<Integer> list = new ArrayList<>();
  }

//  public static int get(ArrayList<? super Number> al) {
  public static int get(ArrayList<? extends Number> al) {
    int a = 0;
    for (int i = 0; i < al.size(); i++) {
      a = a + a;
    }
    return a;
  }
}

class X{

}

class y extends X{

}