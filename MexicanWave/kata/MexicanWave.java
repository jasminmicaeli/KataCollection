import java.util.ArrayList;
import java.util.List;

public class MexicanWave {
    public String[] wave(String given) {

        List<String> waves = new ArrayList<>();

        for(int index = 0; index < given.length(); index++){
            char[] singleLetters = given.toCharArray();
            if (singleLetters[index] != ' ') {
                singleLetters[index] = Character.toUpperCase(singleLetters[index]);
                waves.add(new String(singleLetters));
            }
        }
        return waves.toArray(new String[0]);
    }
}
