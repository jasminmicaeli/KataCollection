import java.util.ArrayList;
import java.util.List;

public class WhichAreIn {
    public String[] getValues(String[] array1, String[] array2) {

        List<String> wordsTharAreIn = new ArrayList<>();

        for(String word : array1){

            for(String lexiconEntry : array2){

                if(lexiconEntry.contains(word)){
                    wordsTharAreIn.add(word);
                    break;
                }
            }
        }
        return wordsTharAreIn.toArray(new String[wordsTharAreIn.size()]);
    }
}
