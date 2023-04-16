import java.util.Dictionary;
import java.util.Hashtable;

public class HighestScoringWord {
    Dictionary<Character, Integer> dictionary = new Hashtable<>();
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public HighestScoringWord() {
        setupDictionary();
    }

    private void setupDictionary() {
        char[] singleLetters = alphabet.toCharArray();
        for(int i = 1; i <= alphabet.length(); i++){
            dictionary.put(singleLetters[i-1], i);
        }
    }

    public String calculateHighestScoringWord(String words) {
        int highestScore= 0;
        String highestScoringWord = "";

        for (String word : words.split(" ")){
            int currentScore = 0;

            for (char letter : word.toCharArray()){
                currentScore += dictionary.get(letter);
            }

            if(currentScore > highestScore) {
                highestScore = currentScore;
                highestScoringWord = word;
            }
        }
        return highestScoringWord;
    }
}
