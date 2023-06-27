package classworks.lesson23_20230612;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
  public static void main(String[] args) {
    Exchanger<Action> exchanger = new Exchanger<>();
    List<Action> P1LIST = new ArrayList<>();
    P1LIST.add(Action.SCISSORS);
    P1LIST.add(Action.STONE);
    P1LIST.add(Action.STONE);

    List<Action> P2LIST = new ArrayList<>();
    P2LIST.add(Action.STONE);
    P2LIST.add(Action.SCISSORS);
    P2LIST.add(Action.STONE);

    new Player("P1", P1LIST, exchanger);
    new Player("P2", P2LIST, exchanger);
  }
}

enum Action {
  STONE, SCISSORS, PAPER;
}

class Player extends Thread {
  private String name;
  private List<Action> actionList;
  private Exchanger<Action> exchanger;

  public Player(String name, List<Action> actionList, Exchanger<Action> exchanger) {
    this.name = name;
    this.actionList = actionList;
    this.exchanger = exchanger;
    this.start();
  }

  private void getWinner(Action N, Action M) {
    if (N == Action.PAPER && M == Action.STONE ||
            N == Action.SCISSORS && M == Action.PAPER ||
            N == Action.STONE && M == Action.SCISSORS) {
      System.out.println("WINNER is: " + name);
    }
  }

  @Override
  public void run() {
    Action reply;
    for (Action action : actionList) {
      try {
        reply = exchanger.exchange(action);
        getWinner(action, reply);
        Thread.sleep(300);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}