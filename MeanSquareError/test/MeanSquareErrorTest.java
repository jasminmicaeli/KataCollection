import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MeanSquareErrorTest {

    @Test
    public void test1() {
        double expected = 9;
        double actual;
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        actual = MeanSquareError.meanSquare(arr1, arr2);

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        double expected = 16.5;
        double actual;
        int[] arr1 = {10, 20, 10, 2};
        int[] arr2 = {10, 25, 5, -2};

        actual = MeanSquareError.meanSquare(arr1, arr2);

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        double expected = 1;
        double actual;
        int[] arr1 = {0, -1};
        int[] arr2 = {-1, 0};

        actual = MeanSquareError.meanSquare(arr1, arr2);

        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        double expected = 0;
        double actual;
        int[] arr1 = {10, 10};
        int[] arr2 = {10, 10};

        actual = MeanSquareError.meanSquare(arr1, arr2);

        assertEquals(expected, actual);
    }

}