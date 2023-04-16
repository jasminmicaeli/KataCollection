public class CamelCase {

    public String convert(String sentence) {
        String[] singleWords = sentence.split("-|_");

        for (int word = 0; word < singleWords.length; word++) {

            String[] letters = singleWords[word].split("");

            if(word != 0){
                letters[0] = letters[0].toUpperCase();
            }

            singleWords[word] = String.join("", letters);
        }
        return String.join(" ", singleWords);
    }

}
