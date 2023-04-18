import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeCheckerTest {

    @Test
    public void shouldDetectUnfinishedGame() {
        int expected = -1;
        int actual;
        int[][] given = {
                {0, 0, 1},
                {0, 1, 2},
                {2, 1, 0}
        };
        TicTacToeChecker ticTacToeChecker = new TicTacToeChecker();
        actual = ticTacToeChecker.check(given);

        Assert.assertEquals(actual, expected);
    }

}