public class SnakesAndLadders {

    int currentField = 0;

    public int play(int[]board, int[] dice){

        if(currentField == board.length) return board.length;

        for(int roll : dice){
            currentField += roll;
            if(currentField >= board.length) currentField -= roll;

            if(board[currentField] != 0){
                currentField += board[currentField];
            }
        }
        return currentField;
    }
}
