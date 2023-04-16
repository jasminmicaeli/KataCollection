import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JosephusPermutationTest {

    @Test
    public void test(){
        List<Integer> expected = new ArrayList<>(List.of(3, 6, 2, 7, 5, 1, 4));
        List<Integer> given = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        int k = 3;
        List<Integer> actual;

        JosephusPermutation josephusPermutation = new JosephusPermutation();
        actual = josephusPermutation.permutate(given, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        List<Integer> expected = new ArrayList<>(List.of(4, 1, 6, 5, 7, 3, 2));
        List<Integer> given = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        int k = 4;
        List<Integer> actual;

        JosephusPermutation josephusPermutation = new JosephusPermutation();
        actual = josephusPermutation.permutate(given, k);

        Assert.assertEquals(expected, actual);
    }
}