package homeworks.hw12_20230626.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ChessBoard {
  private final Character KING_ALIAS = 'K';
  private final Character QUEEN_ALIAS = 'Q';
  private Character[][] board = new Character[8][8];
  private Point kingPoint;

  public void setKingPoint(int row, int column) {
    board[row - 1][column - 1] = KING_ALIAS;
    kingPoint = new Point(row - 1, column - 1);
  }

  public void setQueenPoint(int row, int column) {
    board[row - 1][column - 1] = QUEEN_ALIAS;
  }

  public void findQueenKillKing() {
    List<Point> listKillQueen = new ArrayList<>();

    int x = kingPoint.x;
    int y = kingPoint.y;

    for (int i = 0; i < 8; i++) {
      if (board[x][i] == QUEEN_ALIAS) {
        listKillQueen.add(new Point(x, i));
      }
      if (board[i][y] == QUEEN_ALIAS) {
        listKillQueen.add(new Point(i, y));
      }

      if (x - i >= 0 && y + i < 8) {
        if (board[x - i][y + i] == QUEEN_ALIAS) {
          listKillQueen.add(new Point(x - i, y + i));
        }
      }
      if (x + i < 8 && y - i >= 0) {
        if (board[x + i][y - i] == QUEEN_ALIAS) {
          listKillQueen.add(new Point(x + i, y - i));
        }
      }
      if (x - i >= 0 && y - i >= 0) {
        if (board[x - i][y - i] == QUEEN_ALIAS) {
          listKillQueen.add(new Point(x - i, y - i));
        }
      }
      if (x + i < 8 && y + i < 8) {
        if (board[x + i][y + i] == QUEEN_ALIAS) {
          listKillQueen.add(new Point(x + i, y + i));
        }
      }
    }

    if (listKillQueen.size() > 0) {
      System.out.println("Found Queen Killer = " + listKillQueen.size());
    }
    listKillQueen.stream()
            .forEach(point -> System.out.println(QUEEN_ALIAS + " (" + (point.x+1) + " : " + (point.y + 1) + ")"));
  }

  public void printChessBoard() {
    for (int i = 0; i < 8; i++) {
      if (i == 0) { printLineBoard(); }

      if (i == 0) {
        System.out.print("|     |");
        for (int j = 0; j < 8; j++) {
          System.out.print("  " + (j + 1) + "  |");
        }
        System.out.println();
      }

      if (i == 0) { printLineBoard(); }

      for (int j = 0; j < 8; j++) {
        if (j == 0) {
          System.out.print("|  " + (i + 1) + "  |  ");
        }
        System.out.print((board[i][j] == null ? " " : board[i][j]) + "  |  ");
      }
      System.out.println();

      printLineBoard();
    }
  }

  private void printLineBoard(){
    System.out.print("+");
    for (int j = 0; j <= 8; j++) {
      System.out.print("-----+");
    }
    System.out.println();
  }

  class Point {
    int x;
    int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
}
