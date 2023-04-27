import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindTheUniqueNumberTest {

    @Test
    public void test1() {

        double expected = 0.5;
        double actual;
        double[] given = {1, 1, 0.5, 2, 2};

        actual = FindTheUniqueNumber.findUnique(given);

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {

        double expected = 0.5;
        double actual;
        double[] given = {0.2, 1, 0.2, 0.5, 2, 2};

        actual = FindTheUniqueNumber.findUnique(given);

        assertEquals(expected, actual);
    }

}