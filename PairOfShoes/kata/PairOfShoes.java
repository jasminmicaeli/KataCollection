import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PairOfShoes {
    public boolean validate(int[][] shoes) {

        List<Integer>   leftShoes       = new ArrayList<>();
        List<Integer>   rightShoes      = new ArrayList<>();
        int             side            = 0;
        int             size            = 1;

        for (int[] shoe : shoes) {
            if      (shoe[side] == 0) leftShoes.add(shoe[size]);
            else if (shoe[side] == 1) rightShoes.add(shoe[size]);
        }
        return new HashSet<>(leftShoes).containsAll(rightShoes);
    }
}
