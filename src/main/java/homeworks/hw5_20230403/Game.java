package homeworks.hw5_20230403;

import java.util.Random;

public class Game {
  private final int id;
  private final Player playerFirst;
  private final Player playerSecond;
  private final int result;
  private static int nextId;

  public Game(Player playerFirst, Player playerSecond, int result) {
    this.id = getNextId();
    this.playerFirst = playerFirst;
    this.playerSecond = playerSecond;
    this.result = result;
  }

  public int getResult() {
    return result;
  }

  public Player getPlayerFirst() {
    return playerFirst;
  }

  public Player getPlayerSecond() {
    return playerSecond;
  }

  public static void play(League league) {
    Object[] players = league.getPlayers().keySet().toArray();
    for (int i = 0; i < players.length - 1; i++) {
      for (int j = i + 1; j < players.length; j++) {
        league.addGame(new Game(
                (Player) players[i],
                (Player) players[j],
                getRandomResult()
        ));
      }
    }
  }

  private static int getRandomResult() {
    Random random = new Random();
    return random.nextInt(3);
  }

  private static int getNextId() {
    return ++nextId;
  }

  @Override
  public String toString() {
    return "Game{" +
            "id=" + id +
            ", playerFirst=" + playerFirst.getId() +
            ", playerSecond=" + playerSecond.getId() +
            ", result=" + result +
            '}';
  }
}
