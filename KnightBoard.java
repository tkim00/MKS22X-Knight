public class KnightBoard {
  int[][] board;

  public KnightBoard(int startingRows, int startingCols) {
    board = new int[startingRows][startingCols];
  }

  public String toString() {
    String str = "";
    for (r = 0; r < board.length; r++) {
      for (c = 0; c < board[r].length; c++) {
        if (board[r][c] == 0) {
          str += "_ ";
        } else if (board[r][c] / 10 == 0) {
          str += " " + board[r][c] + " ";
        } else {
          str += board[r][c] + " ";
        }
      }
      str += "\n";
    }
    return str;
  }

  public boolean solve(int startingRow, int startingCol) {
    if (startingRow < 0 || startingCol < 0 || startingRow >= board.length || startingCol >= board[0].length) {
      throw new IllegalArgumentException();
    }
    for (r = 0; r < board.length; r++) {
      for (c = 0; c < board[r].length; c++) {
        if (board[r][c] == 0) {
          throw new IllegalStateException();
        }
      }
    }
    solveH(startingRow, startingCol, 1);
  }
  public boolean solveH(int startingRow, startingCol, int moveNumber) {
    if (moveNumber > startingRow * startingCol) {
      return true;
    }

  }
}
