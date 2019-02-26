public class KnightBoard {
  int[][] board;

  public KnightBoard(int startingRows, int startingCols) {
    board = new int[startingRows][startingCols];
  }

  public String toString() {
    String board = "";
    for (r = 0; r < board.length; r++) {
      for (c = 0; c < board[r].length; c++) {
        if (board[r][c] == 0) {
          board += "_ ";
        } else {
          if (board[r][c] / 10 == 0) {
            board += " ";
          }
          board += "";
        }
      }
    }
  }
}
