package homeworks.hw5_20230403;

public class LeagueStudent extends League{
  public LeagueStudent(String name, String description) {
    super(name, description);
  }
  @Override
  public void generatePlayers() {
    for (int i = 0; i < 5; i++) {
      addPlayer(Player.generatePlayerWithParams(15, 25));
    }
  }
}
