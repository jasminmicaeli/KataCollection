import java.util.ArrayList;
import java.util.List;

public class SimplePigLatin {
    public String translate(String given) {

        List<String> translatedWords = new ArrayList<>();
        List<String> singleWords = List.of(given.split(" "));

        for(String word : singleWords){
            String translatedWord = word.substring(1) + word.charAt(0) + "ay";
             translatedWords.add(translatedWord);
        }
        return String.join(" ", translatedWords);
    }
}
