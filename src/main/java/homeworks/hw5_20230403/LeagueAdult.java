package homeworks.hw5_20230403;

public class LeagueAdult extends League{
  public LeagueAdult(String name, String description) {
    super(name, description);
  }
  @Override
  public void generatePlayers() {
    for (int i = 0; i < 5; i++) {
      addPlayer(Player.generatePlayerWithParams(35, 80));
    }
  }
}
