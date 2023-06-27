package homeworks.hw8_20230513.hw11_20230607;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
  private List<Book> books = new ArrayList<>();

  public void addBook(Book book) {
    books.add(book);
  }

  public boolean removeBook(Book book) {
    return books.remove(book);
  }

  public List<Book> getBooks() {
    return Collections.unmodifiableList(books);
  }
}
