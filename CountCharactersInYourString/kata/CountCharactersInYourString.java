import java.util.HashMap;
import java.util.Objects;

public class CountCharactersInYourString {

    public HashMap<String, Integer> countCharacters(String input) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        if(!Objects.equals(input, "")){
            for(String letter : input.split("")){
                hashMap.merge(letter, 1, Integer::sum);
            }
        }
        return hashMap;
    }
}
