package classworks.lesson7_20230329;

public class Test3 {
  public static void main(String[] args) {
    System.out.println(M1(Test3::M2));
  }

  public static int M2(){
    return 5*3;
  }
  public static int M1(Sum sum){
    return sum.getSum();
  }
}

@FunctionalInterface
interface Sum {
  int getSum();
}
