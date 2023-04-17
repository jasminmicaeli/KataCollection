import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MexicanWaveTest {

    @Test
    public void test1(){
        String[] expected = {"Data", "dAta", "daTa", "datA"};
        String[] actual;
        String given = "data";

        MexicanWave mexicanWave = new MexicanWave();
        actual = mexicanWave.wave(given);

        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void worksWithTwoWords(){
        String[] expected = new String[] { "Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS" };
        String[] actual;
        String given = "two words";

        MexicanWave mexicanWave = new MexicanWave();
        actual = mexicanWave.wave(given);

        Assert.assertArrayEquals(actual, expected);
    }
}