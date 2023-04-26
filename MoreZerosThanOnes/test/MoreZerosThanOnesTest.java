import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoreZerosThanOnesTest {

    @Test
    public void test(){
        char[] expected = new char[]{'a', 'b', 'd'};
        char[] actual;
        String given = "abcd";

        actual = MoreZerosThanOnes.moreZeros(given);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void randomTest1(){
        char[] expected = new char[]{'h', 'b', 'p', 'a', 'd'};
        char[] actual;
        String given = "thequickbrownfoxjumpsoverthelazydog";

        actual = MoreZerosThanOnes.moreZeros(given);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void randomTest2(){
        char[] expected = new char[]{'T','H','E','Q','I','C','B','R','F','X','J','P','L', 'A','D'};
        char[] actual;
        String given = "THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG";

        actual = MoreZerosThanOnes.moreZeros(given);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void randomTest3(){
        char[] expected = new char[]{'a','b','d','h','p','A','B','C','D','E','F','H','I','J','L','P','Q','R','T','X','0'};
        char[] actual;
        String given = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_";

        actual = MoreZerosThanOnes.moreZeros(given);
        assertArrayEquals(expected, actual);
    }

}