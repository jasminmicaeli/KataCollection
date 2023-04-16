public class MultiplicationTable {


    public int[][] draw(int size) {

        int[][] table = new int[size][size];

        for(int row = 0; row < size; row++){
            int sum = row + 1;

            for(int column = 0; column < size; column++){
                table[row][column] = sum;
                sum += row + 1;
            }
        }
        return table;
    }
}
