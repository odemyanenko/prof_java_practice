package classworks.lesson22_20230605;

import java.util.List;
import java.util.stream.Collectors;

public class Service {
  private Author author;
  private Book book;
  private Gen gen;

  public Service(Author author, Book book, Gen gen) {
    this.author = author;
    this.book = book;
    this.gen = gen;
  }

  public List<Book> getBooksByAuthorYear(Author author, int year) {
    List<Book> list = gen.get();
    return list.stream()
            .filter(e -> e.getAuthor().equals(author) && e.getIssue() == year)
            .collect(Collectors.toList());
  }

  public List<Book> getBooksByBook(Book book) {
    List<Book> list = gen.get();
    return list.stream()
            .filter(e -> e.equals(book))
            .collect(Collectors.toList());
  }
}