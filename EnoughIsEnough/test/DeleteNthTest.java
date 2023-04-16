import org.junit.Assert;
import org.junit.Test;

public class DeleteNthTest {

    @Test
    public void ShouldNotDeleteItemIfOccurrenceUnderMaxItem(){
        int[] expected = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] givenContent = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int numberOfMaxItems = 3;
        int[] actual;

        DeleteNth deleteNth = new DeleteNth();
        actual = deleteNth.delete(givenContent, numberOfMaxItems);

        Assert.assertArrayEquals(actual, expected);
    }

}