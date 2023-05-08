package classworks.lesson13_20230426;

class Pair{
  int number1;
  int number2;

  public Pair(int number1, int number2) {
    this.number1 = number1;
    this.number2 = number2;
  }

  @Override
  public String toString() {
    return "Pair{" +
            "number1=" + number1 +
            ", number2=" + number2 +
            '}';
  }
}
