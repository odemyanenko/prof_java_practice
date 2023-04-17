package homeworks.hw5_20230403;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generator {
  public static List<League> createGame() {
    League league1 = new LeagueSchool("1", "Players from 10-15 years");
    League league2 = new LeagueStudent("2", "Players from 15-25 years");
    League league3 = new LeagueYoung("3", "Players from 25-35 years");
    League league4 = new LeagueAdult("4", "Players from 35-80 years");

    List<League> leagues = new ArrayList<>();
    Collections.addAll(leagues, league1, league2, league3, league4);

    for (League league : leagues
    ) {
      league.generatePlayers();
    }

    return leagues;
  }
}
