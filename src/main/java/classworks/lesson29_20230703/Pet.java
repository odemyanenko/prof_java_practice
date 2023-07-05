package classworks.lesson29_20230703;

public interface Pet {
  public void say();
}

class Dog implements Pet {
  @Override
  public void say() {
    System.out.println("Dog.class || say()");
  }
}

class Cat implements Pet {
  @Override
  public void say() {
    System.out.println("Cat.class || say()");
  }
}
