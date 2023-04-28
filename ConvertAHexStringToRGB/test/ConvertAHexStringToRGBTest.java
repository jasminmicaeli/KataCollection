import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConvertAHexStringToRGBTest {

    @Test
    public void test(){
        int[] expected = {255, 153, 51};
        String given = "#FF9933";
        int[] actual;

        ConvertAHexStringToRGB convertAHexStringToRGB = new ConvertAHexStringToRGB();
        actual  = convertAHexStringToRGB.convert(given);

        assertArrayEquals(actual, expected);
    }
    @Test
    public void test2(){
        int[] expected = {17, 17, 17};
        String given = "#111111";
        int[] actual;

        ConvertAHexStringToRGB convertAHexStringToRGB = new ConvertAHexStringToRGB();
        actual  = convertAHexStringToRGB.convert(given);

        assertArrayEquals(actual, expected);
    }
    @Test
    public void test3(){
        int[] expected = {250, 52, 86};
        String given = "#Fa3456";
        int[] actual;

        ConvertAHexStringToRGB convertAHexStringToRGB = new ConvertAHexStringToRGB();
        actual  = convertAHexStringToRGB.convert(given);

        assertArrayEquals(actual, expected);
    }

}