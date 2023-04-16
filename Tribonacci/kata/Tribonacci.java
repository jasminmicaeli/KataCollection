import java.util.ArrayList;
import java.util.List;

public class Tribonacci {

public double[] tribonacci(double[] s, int n){
    List<Double> ls = new ArrayList<>();
    ls.add(s[0]);
    ls.add(s[1]);
    ls.add(s[2]);

    for(int i = 3; i< n; i++){
        ls.add(ls.get(i-3) + ls.get(i-2) + ls.get(i-1));
    }
    return ls.stream().mapToDouble(i -> i).toArray();
}
}
