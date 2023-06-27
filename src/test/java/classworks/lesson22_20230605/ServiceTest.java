package classworks.lesson22_20230605;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.*;


class ServiceTest {

  private Author author;
  private Book book;

  @InjectMocks
  private Service service;

  @BeforeEach
  void setUp(){
    author = new Author("first_name1", "last_name1", 23, false);
    book = new Book(author, 2022, "Title1");
  }
  @Test
  void getBooksByAuthorYear() {
//    Gen gen = mock(Gen.class);
//
//    int year = 2022;
//
////    Author author = mock(Author.class);
////    Book book = mock(Book.class);
////    Gen gen = mock(Gen.class);
//
//    List<Book> testList = new ArrayList<>();
//    Book book1 = mock(Book.class);
//    Book book2 = mock(Book.class);
//    Book book3 = mock(Book.class);
//
//    Author author1 = new Author("fn1", "ln1", 23, true);
//    Author author2 = new Author("fn2", "ln2", 53, false);
//    Author author3 = new Author("fn3", "ln3", 32, true);
//
//    testList.add(book);
//    testList.add(book1);
//    testList.add(book2);
//    testList.add(book3);
//
//    List<Book> exceptedList = new ArrayList<>();
//    exceptedList.add(book);
//
//    service = new Service(gen);
////    service.setGen(gen);
//    when(gen.get()).thenReturn(testList);
//    when(book1.getAuthor()).thenReturn(author1);
//    when(book2.getAuthor()).thenReturn(author2);
//    when(book3.getAuthor()).thenReturn(author3);
//    when(book1.getIssue()).thenReturn(Mockito.anyInt());
//    when(book2.getIssue()).thenReturn(Mockito.anyInt());
//    when(book3.getIssue()).thenReturn(Mockito.anyInt());
//
//
//    assertEquals(exceptedList, service.getBooksByAuthorYear(author, year));


//    when(book.getAuthor()).thenReturn(author);
//    when(book.getIssue()).thenReturn(year);
//
//    assertEquals(exceptedList, service.getBooksByAuthorYear(author, year));


//    when(service.getBooksByAuthorYear(author, 0)).thenReturn(List.of());
//    List<Book> list = service.getBooksByAuthorYear(author, 0);
//    assertEquals(List.of(), list);
  }

  @Test
  void getBooksByAuthorYear2() {
    Author testAuthor = new Author("fn", "ln", 23, true);
    int year = 2000;

    Gen gen = Mockito.mock(Gen.class);
    List<Book> testList = new ArrayList<>();

    Book book1 = new Book(testAuthor, 1999, "test");
    Book book2 = new Book(testAuthor, 2000, "test");
    Book book3 = new Book(testAuthor, 2001, "test");

    testList.add(book1);
    testList.add(book2);
    testList.add(book3);

    Service service1 = new Service(gen);
    when(gen.get()).thenReturn(testList);

    List<Book> res = service1.getBooksByAuthorYear(author, 2000);
    List<Book> expected = testList.stream()
            .filter(e -> e.getAuthor().equals(author) && e.getIssue() == year).toList();
    assertEquals(expected, res);


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