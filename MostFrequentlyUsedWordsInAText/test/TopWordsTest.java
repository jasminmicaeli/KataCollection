import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TopWordsTest {

    @Test
    public void test() {
        List<String> expected = List.of("Picard", "Jean", "Luc");
        String given = "Jean Picard Luc Picard";
        List<String> actual;

        TopWords topWords = new TopWords();
        actual = topWords.top3(given);

        assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        List<String> expected = List.of("e", "ddd", "aa");
        String given = "e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e";
        List<String> actual;

        TopWords topWords = new TopWords();
        actual = topWords.top3(given);

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        List<String> expected = List.of("e", "d", "a");
        String given = "a a a  b  c c  d d d d  e e e e e";
        List<String> actual;

        TopWords topWords = new TopWords();
        actual = topWords.top3(given);

        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        List<String> expected = List.of("won't", "wont");
        String given = "  //wont won't won't ";
        List<String> actual;

        TopWords topWords = new TopWords();
        actual = topWords.top3(given);

        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        List<String> expected = List.of("a", "of", "on");
        String given =  "In a village of La Mancha, the name of which I have no desire to call to " +
                        "mind, there lived not long since one of those gentlemen that keep a lance " +
                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for " +
                        "coursing. An olla of rather more beef than mutton, a salad on most " +
                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra " +
                        "on Sundays, made away with three-quarters of his income.";
        List<String> actual;

        TopWords topWords = new TopWords();
        actual = topWords.top3(given);

        assertEquals(expected, actual);
    }

}