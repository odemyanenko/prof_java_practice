package classworks.lesson7_20230329;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test1 {
  public static void main(String[] args) {
//    M1(()-> {
//      System.out.println("----------");
//      System.out.println("**********");
//    });
    M1(Test1::www);
    M1(() -> System.out.println("%%%%%%%%%"));
    List<String> list = Arrays.asList("Nikalay",
            "Vitali", "Sem", "Roma", "Olga", "Sergey", "Mikail");

//    list.forEach(name -> System.out.println(name));
    list.forEach(System.out::println);


  }

  public static void www(){
    System.out.println("----------");
    System.out.println("**********");
  }
  public static void M1(Inter inter){
    System.out.println("////////");
    inter.get();
  }
}

@FunctionalInterface
interface Inter{
  void get();
}
