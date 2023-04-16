import org.junit.Assert;
import org.junit.Test;

public class MultiplicationTableTest {

    @Test
    public void test(){

        int[][] expected = {{1, 2, 3}, {2, 4, 6}, {3, 6, 9}};
        int[][] actual;
        int size = 3;

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        actual = multiplicationTable.draw(size);

        Assert.assertEquals(expected, actual);    }

    @Test
    public void test2(){

        int[][] expected = {{1}};
        int[][] actual;
        int size = 1;

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        actual = multiplicationTable.draw(size);

        Assert.assertEquals(expected, actual);
    }
}