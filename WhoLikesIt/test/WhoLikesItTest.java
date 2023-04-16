import org.junit.Assert;
import org.junit.Test;

public class WhoLikesItTest {

    @Test
    public void noOneLikesIt(){
        String expected = "no one likes it";
        String actual;
        String[] given = {};

        WhoLikesIt whoLikesIt = new WhoLikesIt();
        actual = whoLikesIt.getLikes(given);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void onePersonLikesIt(){
        String expected = "jasmin likes it";
        String actual;
        String[] given = {"jasmin"};

        WhoLikesIt whoLikesIt = new WhoLikesIt();
        actual = whoLikesIt.getLikes(given);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void twoPersonsLikeIt(){
        String expected = "jasmin and picard like it";
        String actual;
        String[] given = {"jasmin", "picard"};

        WhoLikesIt whoLikesIt = new WhoLikesIt();
        actual = whoLikesIt.getLikes(given);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void threePersonsLikeIt(){
        String expected = "jasmin, picard and cisco like it";
        String actual;
        String[] given = {"jasmin", "picard", "cisco"};

        WhoLikesIt whoLikesIt = new WhoLikesIt();
        actual = whoLikesIt.getLikes(given);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void fourPersonsLikeIt(){
        String expected = "jasmin, picard and 2 others like it";
        String actual;
        String[] given = {"jasmin", "picard", "cisco", "data"};

        WhoLikesIt whoLikesIt = new WhoLikesIt();
        actual = whoLikesIt.getLikes(given);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void sixPersonsLikeIt(){
        String expected = "jasmin, picard and 4 others like it";
        String actual;
        String[] given = {"jasmin", "picard", "cisco", "data", "janeway", "archer"};

        WhoLikesIt whoLikesIt = new WhoLikesIt();
        actual = whoLikesIt.getLikes(given);

        Assert.assertEquals(actual, expected);
    }
}