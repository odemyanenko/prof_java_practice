package homeworks.hw5_20230403;

public class LeagueYoung extends League{
  public LeagueYoung(String name, String description) {
    super(name, description);
  }

  @Override
  public void generatePlayers() {
    for (int i = 0; i < 5; i++) {
      addPlayer(Player.generatePlayerWithParams(25, 35));
    }
  }
}
