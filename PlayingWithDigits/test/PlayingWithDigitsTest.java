import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayingWithDigitsTest {

    @Test
    public void test(){
        long expected = 1;
        int givenN = 89;
        int givenP = 1;
        long actual;

        PlayingWithDigits playingWithDigits = new PlayingWithDigits();
        actual = playingWithDigits.digPow(givenN, givenP);

        assertEquals(actual, expected);
    }

    @Test
    public void testValid(){
        long expected = 2;
        int givenN = 695;
        int givenP = 2;
        long actual;

        PlayingWithDigits playingWithDigits = new PlayingWithDigits();
        actual = playingWithDigits.digPow(givenN, givenP);

        assertEquals(actual, expected);
    }

    @Test
    public void testValid2(){
        long expected = 51;
        int givenN = 46288;
        int givenP = 3;
        long actual;

        PlayingWithDigits playingWithDigits = new PlayingWithDigits();
        actual = playingWithDigits.digPow(givenN, givenP);

        assertEquals(actual, expected);
    }

    @Test
    public void testInvalid(){
        long expected = -1;
        int givenN = 92;
        int givenP = 1;
        long actual;

        PlayingWithDigits playingWithDigits = new PlayingWithDigits();
        actual = playingWithDigits.digPow(givenN, givenP);

        assertEquals(actual, expected);
    }
}