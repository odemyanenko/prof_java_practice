package classworks.lesson25_20230619;

import java.util.concurrent.Phaser;

public class Main {
  public static void main(String[] args) {
    Phaser phaser = new Phaser(3);
    new Washer(phaser);
    new Washer(phaser);
    new Washer(phaser);
  }

  static class Washer extends Thread {

    Phaser phaser;

    public Washer(Phaser phaser) {
      this.phaser = phaser;
      start();
    }

    @Override
    public void run() {
      for (int i = 0; i < 3; i++) {
        System.out.println(getName() + " is washing...");
        phaser.arriveAndAwaitAdvance();
      }
    }
  }
}