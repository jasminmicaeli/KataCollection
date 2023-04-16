import org.junit.Assert;
import org.junit.Test;

public class PairOfShoesTest {

    @Test
    public void onlyMatchingPairs(){
        boolean actual;
        int[][] shoes = {{0, 30}, {1, 30}};

        PairOfShoes pairOfShoes = new PairOfShoes();
        actual = pairOfShoes.validate(shoes);

        Assert.assertTrue(actual);
    }

    @Test
    public void noMatchingPairs(){
        boolean actual;
        int[][] shoes = {{0, 30}, {1, 31}};

        PairOfShoes pairOfShoes = new PairOfShoes();
        actual = pairOfShoes.validate(shoes);

        Assert.assertFalse(actual);
    }

    @Test
    public void mixedButOneShoeIsLeftOverShouldReturnFalse(){
        boolean actual;
        int[][] shoes = {{0, 30}, {0, 30}, {0, 32}, {1, 31}, {1, 32}};

        PairOfShoes pairOfShoes = new PairOfShoes();
        actual = pairOfShoes.validate(shoes);

        Assert.assertFalse(actual);
    }
}