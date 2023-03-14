package classworks.lesson2_20230313.mat;

public class Mat {
  int getSum(int a, int b){
    int q = doA(a);
    int w = doB(b);
    return q + w;
  }

  private static int doB(int b) {
    return b - 22;
  }

  private static int doA(int a) {
    return a * 10;
  }
}

class Main{
  public static void main(String[] args) {
    System.out.println(new Mat().getSum(5, 4));
  }
}
