import org.junit.Assert;
import org.junit.Test;

public class HighestScoringWordTest {

    @Test
    public void test(){
        String expected = "a";
        String actual;
        String given = "a";

        HighestScoringWord highestScoringWord = new HighestScoringWord();
        actual = highestScoringWord.calculateHighestScoringWord(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        String expected = "abba";
        String actual;
        String given = "abba";

        HighestScoringWord highestScoringWord = new HighestScoringWord();
        actual = highestScoringWord.calculateHighestScoringWord(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnScoreOfHighestScoringWord(){
        String expected = "abbaa";
        String actual;
        String given = "abbaa abb";

        HighestScoringWord highestScoringWord = new HighestScoringWord();
        actual = highestScoringWord.calculateHighestScoringWord(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnScoreOfHighestScoringWord2(){
        String expected = "z";
        String actual;
        String given = "abbaa abb z";

        HighestScoringWord highestScoringWord = new HighestScoringWord();
        actual = highestScoringWord.calculateHighestScoringWord(given);

        Assert.assertEquals(expected, actual);
    }
}