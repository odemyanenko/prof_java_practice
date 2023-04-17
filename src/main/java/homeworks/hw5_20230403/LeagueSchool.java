package homeworks.hw5_20230403;

public class LeagueSchool extends League{
  public LeagueSchool(String name, String description) {
    super(name, description);
  }

  @Override
  public void generatePlayers() {
    for (int i = 0; i < 5; i++) {
      addPlayer(Player.generatePlayerWithParams(10, 15));
    }
  }
}
