import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {

    @Test
    public void input_1_shouldReturn_I(){
        String  expected    = "I";
        String  actual;
        int     given       = 1;

        RomanNumerals romanNumerals = new RomanNumerals();
        actual = romanNumerals.convert(given);

        assertEquals(expected, actual);
    }

    @Test
    public void input_3_shouldReturn_III(){
        String  expected    = "III";
        String  actual;
        int     given       = 3;

        RomanNumerals romanNumerals = new RomanNumerals();
        actual = romanNumerals.convert(given);

        assertEquals(expected, actual);
    }

    @Test
    public void input_4_shouldReturn_IV(){
        String  expected    = "IV";
        String  actual;
        int     given       = 4;

        RomanNumerals romanNumerals = new RomanNumerals();
        actual = romanNumerals.convert(given);

        assertEquals(expected, actual);
    }

    @Test
    public void input_789_shouldReturn_DCCLXXXIX(){
        String  expected    = "DCCLXXXIX";
        String  actual;
        int     given       = 789;

        RomanNumerals romanNumerals = new RomanNumerals();
        actual = romanNumerals.convert(given);

        assertEquals(expected, actual);
    }

    @Test
    public void input_1029_shouldReturn_MXXIX(){
        String  expected    = "MXXIX";
        String  actual;
        int     given       = 1029;

        RomanNumerals romanNumerals = new RomanNumerals();
        actual = romanNumerals.convert(given);

        assertEquals(expected, actual);
    }
}