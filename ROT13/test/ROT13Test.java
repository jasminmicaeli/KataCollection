import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ROT13Test {

    @Test
    public void shouldReturn13nthLetter_From_a_to_n(){
        String expected = "n";
        String actual;
        String given = "a";

        ROT13 ROT13 = new ROT13();
        actual = ROT13.decipher(given);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn13nthLetter(){
        String expected = "nopqrstuvwxyzabcdefghijklm";
        String actual;
        String given = "abcdefghijklmnopqrstuvwxyz";

        ROT13 ROT13 = new ROT13();
        actual = ROT13.decipher(given);

        assertEquals(expected, actual);
    }

    @Test
    public void decipherJoke(){
        String expected = "rot13 example.";
        String actual;
        String given = "ebg13 rknzcyr.";

        ROT13 ROT13 = new ROT13();
        actual = ROT13.decipher(given);

        assertEquals(expected, actual);
    }
}