import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScrambliesTest {

    @Test
    public void ShouldValdidateWordsCorrectly_ShouldReturnTrue(){
        boolean expected = true;
        boolean actual;
        String givenPoolOfLetters = "azzhmhsijon";
        String givenWord = "jasmin";

        Scramblies scramblies = new Scramblies();
        actual = scramblies.scramble(givenPoolOfLetters, givenWord);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ShouldValdidateWordsCorrectly_ShouldReturnFalse(){
        boolean expected = false;
        boolean actual;
        String givenPoolOfLetters = "kingkong";
        String givenWord = "jasmin";

        Scramblies scramblies = new Scramblies();
        actual = scramblies.scramble(givenPoolOfLetters, givenWord);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTreatLowerAndUpperCaseTheSame_ShouldReturnTrue(){
        boolean expected = true;
        boolean actual;
        String givenPoolOfLetters = "JaSmIn";
        String givenWord = "jasmin";

        Scramblies scramblies = new Scramblies();
        actual = scramblies.scramble(givenPoolOfLetters, givenWord);

        Assert.assertEquals(expected, actual);
    }
}