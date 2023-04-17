package homeworks.hw5_20230403;

import java.util.*;
import java.util.stream.Collectors;

public abstract class League {
  private final int id;
  private String name;
  private String description;
  private Map<Player, Double> players = new HashMap<>();
  private List<Game> games = new ArrayList<>();

  public Map<Player, Double> getPlayers() {
    return Collections.unmodifiableMap(players);
  }

  private static int nextId;

  public League(String name, String description) {
    this.id = getNextId();
    this.name = name;
    this.description = description;
  }

  private static int getNextId() {
    return ++nextId;
  }

  @Override
  public String toString() {
    return "League{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", description='" + description + '\'' +
            ", players=" + players +
            ", games=" + games +
            '}';
  }

  public abstract void generatePlayers();

  public void addPlayer(Player player) {
    players.put(player, 0.0);
  }

  public void addGame(Game game) {
    games.add(game);
    recalculateScore(game);
  }

  public void printResult(){
//    Comparator<Map.Entry<Player, Double>> valueComparator =
//            (e1, e2) -> e1.getValue().compareTo(e2.getValue());
//
//    Map<Player, Integer> sortedMap = players.entrySet().stream().sorted(valueComparator).collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey,
//            (e1, e2) -> e1, LinkedHashMap::new));


    System.out.println("------------------------------------------------------------------------------");
    System.out.println("Result table for league: " + this.name + " (" + this.description + ")");
    System.out.println("------------------------------------------------------------------------------");
    int num = 0;
    for (Player player: this.getPlayers().keySet()
         ) {
      System.out.println(++num + ". " + player.getFirstName() + " " + player.getLastName() + " (" + player.getAge() + ") : " + this.getPlayers().get(player));
    }
    System.out.println("------------------------------------------------------------------------------");
  }
  private void setNewScore(Player player, Double score) {
    if (players.containsKey(player)) {
      players.put(player, players.get(player) + score);
    }
  }

  private void recalculateScore(Game game) {
    switch (game.getResult()) {
      case 0 -> {
        setNewScore(game.getPlayerFirst(), 0.0);
        setNewScore(game.getPlayerSecond(), 1.0);
      }
      case 1 -> {
        setNewScore(game.getPlayerFirst(), 0.5);
        setNewScore(game.getPlayerSecond(), 0.5);
      }
      case 2 -> {
        setNewScore(game.getPlayerFirst(), 1.0);
        setNewScore(game.getPlayerSecond(), 0.0);
      }
    }
  }
}