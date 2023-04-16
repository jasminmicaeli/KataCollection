import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StopSpinningMyWordsTest {

    @Test
    public void ShouldDetectWordsWithOverFiveLetters(){
        boolean actual;
        String given = "Jasmin";

        StopSpinningMyWords stopSpinningMyWords = new StopSpinningMyWords();
        actual = stopSpinningMyWords.needsToBeSpinned(given);

        Assert.assertTrue(actual);
    }

    @Test
    public void ShouldDetectWordsWithLessThanFiveLetters(){
        boolean actual;
        String given = "Java";

        StopSpinningMyWords stopSpinningMyWords = new StopSpinningMyWords();
        actual = stopSpinningMyWords.needsToBeSpinned(given);

        Assert.assertFalse(actual);
    }

    @Test
    public void ShouldReverseWordsWithOverFiveLetters(){
        String expected = "etueH ist mein retiewz Tag";
        String actual;
        String given = "Heute ist mein zweiter Tag";

        StopSpinningMyWords stopSpinningMyWords = new StopSpinningMyWords();
        actual = stopSpinningMyWords.validateString(given);

        Assert.assertEquals(expected, actual);
    }
}