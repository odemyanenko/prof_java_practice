package classworks.lesson22_20230605;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ServiceTest {
  @Mock
  private Author author;
  @Mock
  private Book book;
  @Mock
  private Gen gen;

  @InjectMocks
  private Service service;

  @Test
  void getBooksByAuthorYear() {
    //int year = 1933;
    //List<Book> list = List.of();

    when(service.getBooksByAuthorYear(author, 0)).thenReturn(List.of());
    List<Book> list = service.getBooksByAuthorYear(author, 0);
    assertEquals(List.of(), list);
  }

  @Test
  void getBooksByBook() {
  }
}

/*
Author testAuthor = new Author("t", true, 1);
        int year = 2000;

        Gen gen = Mockito.mock(Gen.class);
        List<Book> testList = new ArrayList<>();

        Book book1 = new Book(testAuthor, "test1", 1999);
        Book book2 = new Book(testAuthor, "test2", 2000);
        Book book3 = new Book(testAuthor, "test3", 2001);

        testList.add(book1);
        testList.add(book2);
        testList.add(book3);

        Service service1 = new Service(gen);
        Mockito.when(gen.get()).thenReturn(testList);

        List<Book> res = service1.m1(testAuthor, 2000);
        List<Book> expected = testList.stream()
                .filter(e -> e.getAuthor().equals(testAuthor) && e.getYearIssue() == year)
                .toList();

        Assertions.assertEquals(expected, res);
*/