package classworks.lesson_20230810;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  Calculator calculator = new Calculator();

  @BeforeAll
  static void start(){
    System.out.println("Start testing");
  }

  @AfterAll
  static void end(){
    System.out.println("---------------------------------");
    System.out.println("End testing");
  }

  @BeforeEach
  void before(){
    System.out.println("---------------------------------");
    System.out.println("Test started...");
  }

  @AfterEach
  void after(){
    System.out.println("Test finished...");
  }

  @Test
  void sumTest() {
    System.out.println("Testing sum...");
    Assertions.assertEquals(4, calculator.sum(2, 2));
  }

  @Test
  void subTest() {
    System.out.println("Testing sub...");
    Assertions.assertEquals(4, calculator.sub(6, 2));
  }

  @Test
  void mulTest() {
    System.out.println("Testing mul...");
    Assertions.assertEquals(4, calculator.mul(2, 2));
  }

  @Test
  void divTest() {
    System.out.println("Testing div...");
    Assertions.assertEquals(4, calculator.div(8, 2));
  }
}