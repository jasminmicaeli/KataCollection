import org.junit.Assert;
import org.junit.Test;

public class HangmanTest {

    @Test
    public void canReturnCurrentPictureAndCurrentWordState(){

        String actual;
        String expected =  "\n\n\n\n\n\n\n";
        String given = "KATA";
        Hangman hangman = new Hangman(given);
        hangman.numberOfLeftGuesses = 9;
        actual = hangman.getCurrentPicture();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void canReturnWordStateAndPictureAfterTakingAGuess(){

        String actual;
        String expected = "____" + "\n" + "\n\n\n\n\n\n=========";
        String given = "KATA";
        Hangman hangman = new Hangman(given);
        actual = hangman.guessLetter('j');

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test(){

        String actual;
        String expected = "_A_A" + "\n" + "  +-----+\n" +
                "  |     |\n" +
                "  O     |\n" +
                " /|\\   |\n" +
                " / \\   |\n" +
                "        |\n" +
                "=========";
        String given = "KATA";
        Hangman hangman = new Hangman(given);
        hangman.guessLetter('b');
        hangman.guessLetter('c');
        hangman.guessLetter('d');
        hangman.guessLetter('e');
        hangman.guessLetter('f');
        hangman.guessLetter('a');
        hangman.guessLetter('g');
        hangman.guessLetter('h');
        actual = hangman.guessLetter('i');

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2(){

        String actual;
        String expected = "KATA" + "\n\n\n\n\n\n\n\n";
        String given = "KATA";
        Hangman hangman = new Hangman(given);
        hangman.guessLetter('k');
        hangman.guessLetter('a');
        actual = hangman.guessLetter('t');

        Assert.assertEquals(expected, actual);
    }
}