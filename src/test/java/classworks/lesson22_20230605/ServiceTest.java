package classworks.lesson22_20230605;

import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.List;

import static org.mockito.Mockito.when;

class ServiceTest {
  @Mock
  Author author;
  @Mock
  Book book;
  @Mock
  Gen gen;

  @InjectMocks
  Service service;
//
//  @Test
//  void getBooksByAuthorYear() {
//    when(service.getBooksByAuthorYear(author, 0).thenReturn(gen.get());
//  }
//
//  @Test
//  void getBooksByBook() {
//  }
}