import java.util.ArrayList;
import java.util.List;

public class MoreZerosThanOnes {

    public static char[] moreZeros(String s){
        char[] letters = s.toCharArray();
        List<Character> result = new ArrayList<>();

        for (char letter : letters) {
            if (!result.contains(letter)) {
                String binary = Integer.toBinaryString(letter);
                if(binary.replace("1", "").length() >= 4){
                    result.add(letter);
                }
            }
        }

        char[] res = new char[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}
