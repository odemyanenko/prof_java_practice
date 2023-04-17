package homeworks.hw5_20230403;

import java.util.Comparator;
import java.util.Map;

public class PlayerResultCompare implements Comparator<Map.Entry<Player, Double>> {

  @Override
  public int compare(Map.Entry<Player, Double> o1, Map.Entry<Player, Double> o2) {
    return o1.getValue().compareTo(o2.getValue());
  }
}
