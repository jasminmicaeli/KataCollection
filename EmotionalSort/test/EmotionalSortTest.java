import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmotionalSortTest {

    @Test
    public void shouldReturnInOrderWhenTrue(){
        String[] expected = {":D", ":D", ":|", ":(", "T_T"};
        String[] actual;
        String[] givenEmotions = {":|", ":D", ":(", "T_T", ":D"};
        boolean givenOrder = true;

        EmotionalSort emotionalSort = new EmotionalSort();
        actual = emotionalSort.sortEmotions(givenOrder, givenEmotions);

        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldReturnInOrderWhenFalse(){
        String[] expected = {"T_T", ":(", ":|", ":D", ":D"};
        String[] actual;
        String[] givenEmotions = {":|", ":D", ":(", "T_T", ":D"};
        boolean givenOrder = false;

        EmotionalSort emotionalSort = new EmotionalSort();
        actual = emotionalSort.sortEmotions(givenOrder, givenEmotions);

        Assert.assertArrayEquals(actual, expected);
    }
}