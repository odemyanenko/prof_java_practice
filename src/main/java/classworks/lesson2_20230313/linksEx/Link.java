package classworks.lesson2_20230313.linksEx;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Random;

@AllArgsConstructor
@Getter
public class Link {
  String name;
  String colorType;
  String text;
  Page page;

  private final static Random RANDOM = new Random();

  public Page goToPage(Link link) {
    log();
    scan();
    return link.getPage();
  }

  private static void  scan() {
    System.out.println(RANDOM.nextInt(13));
  }

  private static void log(){
    System.out.println(RANDOM.nextInt(13));
  }
}
