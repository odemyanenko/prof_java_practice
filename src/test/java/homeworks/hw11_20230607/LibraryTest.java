package homeworks.hw11_20230607;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class LibraryTest {
  private Book book;
  private Library library;

  @BeforeEach
  void init() {
    library = new Library();
  }

  @Test
  void addBook() {
    book = Mockito.mock(Book.class);

    when(book.getTitle()).thenReturn("MockTitle");
    when(book.getAuthor()).thenReturn("MockAuthor");
    when(book.getYear()).thenReturn(2023);

    library.addBook(book);

    List<Book> expectedBooks = new ArrayList<>();
    expectedBooks.add(book);

    assertEquals(1, library.getBooks().size());
    assertEquals(expectedBooks, library.getBooks());
  }

  @Test
  void removeBook() {
    book = Mockito.mock(Book.class);

    library.addBook(book);
    library.removeBook(book);

    List<Book> expectedBooks = new ArrayList<>();

    assertEquals(0, library.getBooks().size());
    assertEquals(expectedBooks, library.getBooks());
  }

  @Test
  void getBooks() {
    Book book1 = new Book("Title1", "Author1", 1998);
    Book book2 = new Book("Title2", "Author2", 2022);
    Book book3 = new Book("Title3", "Author1", 2000);

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);

    List<Book> actualBooks = library.getBooks();

    assertTrue(actualBooks.contains(book1));
    assertTrue(actualBooks.contains(book2));
    assertTrue(actualBooks.contains(book3));

    assertEquals(3, actualBooks.size());
  }
}