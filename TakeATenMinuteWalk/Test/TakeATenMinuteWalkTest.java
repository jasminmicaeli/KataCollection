import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TakeATenMinuteWalkTest {

    @Test
    public void mustNotArriveTooEarly(){
        char[] given = new char[8];
        boolean expected = false;
        boolean actual;

        TakeATenMinuteWalk takeATenMinuteWalk = new TakeATenMinuteWalk();
        actual = takeATenMinuteWalk.walk(given);

        assertEquals(actual, expected);
    }

    @Test
    public void mustNotArriveTooLate(){
        char[] given = new char[11];
        boolean expected = false;
        boolean actual;

        TakeATenMinuteWalk takeATenMinuteWalk = new TakeATenMinuteWalk();
        actual = takeATenMinuteWalk.walk(given);

        assertEquals(actual, expected);
    }

    @Test
    public void validDirectionsShouldReturnTrue(){
        char[] given = {'n', 'n', 'e', 'e', 's', 's', 'w', 'w', 'n', 's'};
        boolean expected = true;
        boolean actual;

        TakeATenMinuteWalk takeATenMinuteWalk = new TakeATenMinuteWalk();
        actual = takeATenMinuteWalk.walk(given);

        assertEquals(actual, expected);
    }

    @Test
    public void invalidDirectionsShouldReturnFalse(){
        char[] given = {'n', 'n', 'e', 'e', 's', 's', 'w', 'w', 'n', 'n'};
        boolean expected = false;
        boolean actual;

        TakeATenMinuteWalk takeATenMinuteWalk = new TakeATenMinuteWalk();
        actual = takeATenMinuteWalk.walk(given);

        assertEquals(actual, expected);
    }
}