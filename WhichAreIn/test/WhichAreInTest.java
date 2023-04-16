import org.junit.Assert;
import org.junit.Test;

public class WhichAreInTest {

    @Test
    public void test(){
        String[] expected = {"sleep", "day", "summer", "kata"};
        String[] actual;
        String[] array1 = {"sleep", "day", "summer", "desk", "kata"};
        String[] array2 = {"sleeping", "summertime", "kata", "computer", "saturday"};

        WhichAreIn whichAreIn = new WhichAreIn();
        actual = whichAreIn.getValues(array1, array2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        String[] expected = {};
        String[] actual;
        String[] array1 = {"none", "are", "in"};
        String[] array2 = {"summertime", "kata", "computer", "saturday"};

        WhichAreIn whichAreIn = new WhichAreIn();
        actual = whichAreIn.getValues(array1, array2);

        Assert.assertEquals(expected, actual);
    }
}