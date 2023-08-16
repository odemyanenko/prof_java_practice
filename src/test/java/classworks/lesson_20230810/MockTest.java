package classworks.lesson_20230810;

/*
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) // Первый способ создания Mockito-тестирования
public class MockitoAnnotationTest {
//    @BeforeEach                  // Второй способ  создания Mockito-теста
//    public void init() {
//        MockitoAnnotations.openMocks(this);
//    }
}
* */

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MockTest {
  //1 - variant
  List mockList = Mockito.mock(ArrayList.class);

  public void testArrayList() {
    mockList.add("1");
    mockList.add("2");
  }

  //1 - variant (short)
  @Mock
  List mockList2;

  public void testArrayList2() {
    mockList2.add("1");
    mockList2.add("2");
  }

  //2 - variant
}
