package homeworks.hw5_20230403;

import java.util.List;

/**
 * - класс лига (1 2 3 4)
 * - класс игроки(имя возраст лига кол-во балов)
 * - класс игра <>
 * - класс генератор 5 игроков с именами и возрастом
 * - класс игшра с методом где каждый игрок одной лиги играет с каждым
 * если победа то 1 балл ничья 0,5 проигрыш - 0
 * далее вывести на экран лидеров из каждой лиги
 *
 * - если кол-во баллов будет одиноковое то переигрываем
 */
public class GameDemo {
  public static void main(String[] args) {
    List<League> leagues = Generator.createGame();
    for (League league : leagues
    ) {
      Game.play(league);
    }
    System.out.println(leagues.toString());

    for (League league : leagues
    ) {
      league.printResult();
    }
  }
}
