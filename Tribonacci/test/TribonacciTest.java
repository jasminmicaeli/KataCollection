import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TribonacciTest {

    @Test
    public void test1(){
        double[] expected = new double[]{1.0, 1.0, 1.0, 3.0, 5.0, 9.0, 17.0, 31.0, 57.0, 105.0};

        double[] given = new double[]{1.0, 1.0, 1.0};
        double[] actual;

        Tribonacci tribonacci = new Tribonacci();
        actual = tribonacci.tribonacci(given, 10);

        Arrays.equals(actual, expected);
    }

    @Test
    public void test2(){
        double[] expected = new double[]{0.0, 0.0, 1.0, 1.0, 2.0, 4.0, 7.0, 13.0, 24.0, 44.0};

        double[] given = new double[]{0.0, 0.0, 1.0};
        double[] actual;

        Tribonacci tribonacci = new Tribonacci();
        actual = tribonacci.tribonacci(given, 10);

        Arrays.equals(actual, expected);
    }

    @Test
    public void test3(){
        double[] expected = new double[]{0.0, 1.0, 1.0, 2.0, 4.0, 7.0, 13.0, 24.0, 44.0, 81.0};

        double[] given = new double[]{0.0, 1.0, 1.0};
        double[] actual;

        Tribonacci tribonacci = new Tribonacci();
        actual = tribonacci.tribonacci(given, 10);

        Arrays.equals(actual, expected);
    }
}