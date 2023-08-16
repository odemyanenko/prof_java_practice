package classworks.lesson_20230810;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class SpyTest {

  @Test
  public void testArrayList() {
    List<String> mockitoList = Mockito.spy(new ArrayList<String>());
    mockitoList.add("1");
    mockitoList.add("2");

    verify(mockitoList).add("1");
    verify(mockitoList).add("2");

//    Assertions.assertThat(mockitoList).hasSize(2);
    Assertions.assertEquals(2, mockitoList.size());
  }
}
