package classworks.lesson22_20230605;

import java.util.List;

public class Gen {
  public List<Book> get(){
    Author author1 = new Author("fName1", "lName1", 34, false);
    Author author2 = new Author("fName2", "lName2", 44, true);
    Author author3 = new Author("fName3", "lName3", 52, false);

    Book book1 = new Book(author1, 2022, "A1Title1");
    Book book2 = new Book(author1, 2020, "A1title2");
    Book book3 = new Book(author2, 2023, "A2title1");
    Book book4 = new Book(author3, 2020, "A3title1");
    Book book5 = new Book(author3, 2018, "A3title2");
    Book book6 = new Book(author3, 2000, "A3title3");

    return List.of(book1, book2, book3, book4, book5, book6);
  }
}
