package homeworks.hw12_20230626.task2;

public class Task2Demo {
  public static void main(String[] args) {
    ChessBoard chessBoard = new ChessBoard();

    chessBoard.setKingPoint(2,4);

    chessBoard.setQueenPoint(1,2);
    chessBoard.setQueenPoint(3,5);
    chessBoard.setQueenPoint(2,7);
    chessBoard.setQueenPoint(4,2);

    chessBoard.printChessBoard();
    chessBoard.findQueenKillKing();
  }
}
