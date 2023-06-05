package classworks.lesson22_20230605;

import java.util.Objects;

public class Book {
  private Author author;
  private int issue;
  private String title;

  public Book(Author author, int issue, String title) {
    this.author = author;
    this.issue = issue;
    this.title = title;
  }

  public Author getAuthor() {
    return author;
  }

  public int getIssue() {
    return issue;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Book book)) return false;
    return issue == book.issue && author.equals(book.author) && title.equals(book.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, issue, title);
  }

  @Override
  public String toString() {
    return "Book{" +
            "author=" + author +
            ", issue=" + issue +
            ", title=" + title +
            '}';
  }
}
