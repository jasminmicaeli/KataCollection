import org.junit.Assert;
import org.junit.Test;

public class SimplePigLatinTest {

    @Test
    public void test1(){
        String expected = "asminJay";
        String given = "Jasmin";
        String actual;

        SimplePigLatin simplePigLatin = new SimplePigLatin();
        actual = simplePigLatin.translate(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldWorkWithWhitespaces(){
        String expected = "arlEay reyGay";
        String given = "Earl Grey";
        String actual;

        SimplePigLatin simplePigLatin = new SimplePigLatin();
        actual = simplePigLatin.translate(given);

        Assert.assertEquals(expected, actual);
    }
}