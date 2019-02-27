public class KnightBoard {
  int[][] board;
  int movement[] = {1, -2, 2, -1, 2, 1, 1, 2, -1, 2, -2, 1, -1, -2, -2, -1};

  public KnightBoard(int startingRows, int startingCols) {
    board = new int[startingRows][startingCols];
  }

  public String toString() {
    String str = "";
    for (int r = 0; r < board.length; r++) {
      for (int c = 0; c < board[r].length; c++) {
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
    for (int r = 0; r < board.length; r++) {
      for (int c = 0; c < board[r].length; c++) {
        if (board[r][c] != 0) {
          throw new IllegalStateException();
        }
      }
    }
    if (!solveH(startingRow, startingCol, 1)) {
      board[startingRow][startingCol] = 0;
      return false;
    }
    return true;
  }
  public boolean solveH(int startingRow, int startingCol, int moveNumber) {
    board[startingRow][startingCol] = moveNumber;
    if (moveNumber == board.length * board[0].length) {
      return true;
    }
    for (int i = 0; i < 16; i+=2) {
      if (startingRow+movement[i] >= 0 && startingRow+movement[i] < board.length &&
      startingCol+movement[i+1] >= 0 && startingCol+movement[i+1] < board[0].length &&
      board[startingRow+movement[i]][startingCol+movement[i+1]] == 0) {
        if (solveH(startingRow+movement[i], startingCol+movement[i+1], moveNumber+1)) {
          return true;
        }
        board[startingRow+movement[i]][startingCol+movement[i+1]] = 0;
      }
    }
    return false;
  }
}
