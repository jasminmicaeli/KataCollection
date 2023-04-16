import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CamelCaseTest {

    @Test
    public void shouldWork(){
        String expected = "Live Long And Prosper";
        String actual;
        String given = "Live-long_and-prosper";

        CamelCase camelCase = new CamelCase();
        actual = camelCase.convert(given);

        assertEquals(expected, actual);
    }


    @Test
    public void shouldWork_firstLetterWasLowerCase(){
        String expected = "the First Letter Was Lower Case";
        String actual;
        String given = "the_first_Letter-was-lower_Case";

        CamelCase camelCase = new CamelCase();
        actual = camelCase.convert(given);

        assertEquals(expected, actual);
    }
}