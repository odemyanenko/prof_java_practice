package classworks.lesson25_20230619;

public class ST {
  void m1(){

  }

  void m2() {

  }

  public static void main(String[] args) {
    new ST().m1();
    new ST().m2();
  }
}

class A {
  ST st;

  void a() {
    st = new ST();
    st.m1();
  }
}

class B {
  ST st;
  void b() {
    st = new ST();
    st.m2();
  }
}

class C {
  ST st;

  void c(){
    st.m1();
    st.m2();
  }
}