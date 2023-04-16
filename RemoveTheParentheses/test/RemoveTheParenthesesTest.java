import org.junit.Assert;
import org.junit.Test;

public class RemoveTheParenthesesTest {

    @Test
    public void emptyInput_shouldReturnEmptyString(){
        String expected = "";
        String actual;
        String given = "";

        RemoveTheParentheses kata = new RemoveTheParentheses();
        actual = kata.removeParentheses(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringWithoutParentheses_shouldReturnStringAsIs(){
        String expected = "This Kata is nice";
        String actual;
        String given = "This Kata is nice";

        RemoveTheParentheses kata = new RemoveTheParentheses();
        actual = kata.removeParentheses(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringWithParentheses_shouldReturnStringWithoutParenthesesAndContent(){
        String expected = "This Kata is  nice";
        String actual;
        String given = "This Kata is (not) nice";

        RemoveTheParentheses kata = new RemoveTheParentheses();
        actual = kata.removeParentheses(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void randomTest_1(){
        String expected = "exampleexample";
        String actual;
        String given = "example(unwanted thing)example";

        RemoveTheParentheses kata = new RemoveTheParentheses();
        actual = kata.removeParentheses(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void randomTest_2(){
        String expected = "exampleexample";
        String actual;
        String given = "example(unwanted thing)example";

        RemoveTheParentheses kata = new RemoveTheParentheses();
        actual = kata.removeParentheses(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void randomTest_3(){
        String expected = "example  example";
        String actual;
        String given = "example (unwanted thing) example";

        RemoveTheParentheses kata = new RemoveTheParentheses();
        actual = kata.removeParentheses(given);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void randomTest_4(){
        String expected = "a e";
        String actual;
        String given = "a (bc d)e";

        RemoveTheParentheses kata = new RemoveTheParentheses();
        actual = kata.removeParentheses(given);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void randomTest_5(){
        String expected = "a";
        String actual;
        String given = "a(b(c))";

        RemoveTheParentheses kata = new RemoveTheParentheses();
        actual = kata.removeParentheses(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void randomTest_6(){
        String expected = "a";
        String actual;
        String given = "a(b(c))";

        RemoveTheParentheses kata = new RemoveTheParentheses();
        actual = kata.removeParentheses(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void randomTest_7(){
        String expected = "hello example  something";
        String actual;
        String given = "hello example (words(more words) here) something";

        RemoveTheParentheses kata = new RemoveTheParentheses();
        actual = kata.removeParentheses(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void randomTest_8(){
        String expected = "  ";
        String actual;
        String given = "(first group) (second group) (third group)";

        RemoveTheParentheses kata = new RemoveTheParentheses();
        actual = kata.removeParentheses(given);

        Assert.assertEquals(expected, actual);
    }
}