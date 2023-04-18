public class TicTacToeChecker {

    public int check(int[][] board) {

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                if (board[row][column] == 0) {
                    return -1;
                }
            }
        }
        return 100;
    }
}
