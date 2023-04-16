import org.junit.Assert;
import org.junit.Test;

public class FormatWordsIntoASentenceTest {

    @Test
    public void leavesOutWhiteSpaces(){
        String[] expected = {"Data", "Kirk"};
        String[] actual;
        String[] given = {"Data", " ", "Kirk"};

        FormatWordsIntoASentence formatWordsIntoASentence = new FormatWordsIntoASentence();
        actual = formatWordsIntoASentence.getSingleNames(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void worksForSingleName(){
        String expected = "Data";
        String actual;
        String[] given = {"Data"};

        FormatWordsIntoASentence formatWordsIntoASentence = new FormatWordsIntoASentence();
        actual = formatWordsIntoASentence.getMessage(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void worksForSingleNameWithWhiteSpaces(){
        String expected = "Data";
        String actual;
        String[] given = {"Data", " "};

        FormatWordsIntoASentence formatWordsIntoASentence = new FormatWordsIntoASentence();
        actual = formatWordsIntoASentence.getMessage(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void worksForTwoeNames(){
        String expected = "Data and Worf";
        String actual;
        String[] given = {"Data", "Worf"};

        FormatWordsIntoASentence formatWordsIntoASentence = new FormatWordsIntoASentence();
        actual = formatWordsIntoASentence.getMessage(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void worksForThreeNames(){
        String expected = "Data, Worf and Picard";
        String actual;
        String[] given = {"Data", "Worf", "Picard"};

        FormatWordsIntoASentence formatWordsIntoASentence = new FormatWordsIntoASentence();
        actual = formatWordsIntoASentence.getMessage(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void worksForEightNames(){
        String expected = "Data, Worf, Picard, Tuvok, Q, Khan, Paris and Seven";
        String actual;
        String[] given = {"Data", "Worf", "Picard", "Tuvok", "Q", "Khan", "Paris", "Seven"};

        FormatWordsIntoASentence formatWordsIntoASentence = new FormatWordsIntoASentence();
        actual = formatWordsIntoASentence.getMessage(given);

        Assert.assertEquals(expected, actual);
    }
}