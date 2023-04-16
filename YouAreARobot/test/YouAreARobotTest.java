import org.junit.Assert;
import org.junit.Test;

public class YouAreARobotTest {

    @Test
    public void test(){
        String expected = "^^^;<";
        String actual;
        String given = "^^^<";

        YouAreARobot youAreARobot = new YouAreARobot();
        youAreARobot.getInstructions(given);

        actual = youAreARobot.sb.toString();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void canWalkOneStepUp(){
        String expected = "Take 1 step UP";
        String actual;
        String given = "^";

        YouAreARobot youAreARobot = new YouAreARobot();
        actual = youAreARobot.getInstructions(given);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void canWalkMultipleStepsUp(){
        String expected = "Take 3 steps UP";
        String actual;
        String given = "^^^";

        YouAreARobot youAreARobot = new YouAreARobot();
        actual = youAreARobot.getInstructions(given);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void canWalkMultipleStepsRight(){
        String expected = "Take 3 steps RIGHT";
        String actual;
        String given = ">>>";

        YouAreARobot youAreARobot = new YouAreARobot();
        actual = youAreARobot.getInstructions(given);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void canWalkMultipleStepsDown(){
        String expected = "Take 3 steps DOWN";
        String actual;
        String given = "vvv";

        YouAreARobot youAreARobot = new YouAreARobot();
        actual = youAreARobot.getInstructions(given);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void canWalkMultipleStepsLeft(){
        String expected = "Take 3 steps LEFT";
        String actual;
        String given = "<<<";

        YouAreARobot youAreARobot = new YouAreARobot();
        actual = youAreARobot.getInstructions(given);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void canWalkMultipleDirections(){
        String expected = "Take 3 steps LEFT\nTake 5 steps UP\nTake 2 steps RIGHT\nTake 1 step DOWN";
        String actual;
        String given = "<<<^^^^^>>v";

        YouAreARobot youAreARobot = new YouAreARobot();
        actual = youAreARobot.getInstructions(given);

        Assert.assertEquals(actual, expected);
    }
}