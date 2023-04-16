import java.util.ArrayList;
import java.util.List;

public class Hangman {

    char[] word;
    char[] currentState;
    String currentPicture;
    int numberOfLeftGuesses = 9;

    public Hangman(String word) {
        this.word = word.toUpperCase().toCharArray();
        this.currentState = word.replaceAll(".", "_").toCharArray();
    }

    public String guessLetter(char letter){

        boolean containsLetter = false;

        for(int index = 0; index < word.length; index++ )      {

            letter = Character.toUpperCase(letter);

            if(word[index] == letter) {
                currentState[index] = letter;
                containsLetter = true;
            }
        }
        if(!containsLetter) numberOfLeftGuesses--;

        currentPicture = getCurrentPicture();
        return String.valueOf(currentState) + "\n" + currentPicture;
    }

    String getCurrentPicture(){
        List<String> states = new ArrayList<>();

        states.add( "  +-----+\n" +
                "  |     |\n" +
                "  O     |\n" +
                " /|\\   |\n" +
                " / \\   |\n" +
                "        |\n" +
                "=========");

        states.add( "  +-----+\n" +
                "  |     |\n" +
                "        |\n" +
                "        |\n" +
                "        |\n" +
                "        |\n" +
                "=========");

        states.add( "  +-----+\n" +
                "        |\n" +
                "        |\n" +
                "        |\n" +
                "        |\n" +
                "        |\n" +
                "=========");

        states.add( "\n" +
                "\n" +
                "        |\n" +
                "        |\n" +
                "        |\n" +
                "        |\n" +
                "=========");

        states.add( "\n" +
                "\n" +
                "\n" +
                "        |\n" +
                "        |\n" +
                "        |\n" +
                "=========");

        states.add( "\n" +
                "\n" +
                "\n" +
                "\n" +
                "        |\n" +
                "        |\n" +
                "=========");

        states.add( "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "        |\n" +
                "=========");

        states.add( "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "=========");

        states.add( "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");

        return(states.get(numberOfLeftGuesses - 1));
    }
}
