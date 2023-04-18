import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindOutlierTest {

    @Test
    public void shouldReturn_1(){
        int expected = 1;
        int[] given = {1, 2, 2};
        int actual;

        FindOutlier findOutlier = new FindOutlier();
        actual = findOutlier.Find(given);

        assertEquals(expected, actual);
    }

    @Test
    void beAbleToDetectIfMostNumbersAreEven_shouldReturn_true(){

    }

    @Test
    void shouldReturn_2() {
        int expected = 2;
        int[] given = {1, 1, 2};
        int actual;

        FindOutlier findOutlier = new FindOutlier();
        actual = findOutlier.Find(given);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn_3() {
        int expected = 3;
        int[] given = {2, 4, 10, 3, 6, 2};
        int actual;

        FindOutlier findOutlier = new FindOutlier();
        actual = findOutlier.Find(given);

        assertEquals(expected, actual);
    }
}