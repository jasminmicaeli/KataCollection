import java.util.HashMap;

public class ROT13 {
    String[]    alphabet    = "abcdefghijklmnopqrstuvwxyz".split("");
    int         ROT         = 13;

    HashMap<String, String> hashMap = new HashMap<>();
    public ROT13() {
        for (int letter = 0; letter < alphabet.length; letter++) {
            int roth = letter + ROT;
            if(roth >= alphabet.length){
                roth = letter-13;
            }
            hashMap.put(alphabet[letter], alphabet[roth]);
        }
    }
    public String decipher(String message){
        String[] letters = message.split("");
        StringBuilder sb = new StringBuilder();

        for(String letter : message.split("")){
            if(letter.matches("[A-Za-z]")){
                sb.append(hashMap.get(letter));
            }
            else sb.append(letter);
        }
        return sb.toString();
    }
}
