import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChristmasTreeTest {

    @Test
    public void ShouldReturnCorrectTree(){
        String expected = "  X\n XXX\nXXXXX";
        String actual;
        int heightOfTree = 3;

        ChristmasTree christmasTree = new ChristmasTree(heightOfTree);
        actual = christmasTree.Draw();

        Assert.assertEquals(expected, actual);
    }

}