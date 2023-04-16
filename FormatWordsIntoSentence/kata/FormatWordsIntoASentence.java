import java.util.List;

public class FormatWordsIntoASentence {
    public String getMessage(String[] given) {

        String[] names = getSingleNames(given);
        return  names.length == 1 ? names[0] :
                names.length == 2 ? names[0] + " and " + names[1]:
                        buildName(names);
    }

    private String buildName(String[] names) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int index = 0; index < names.length-1; index++){
            stringBuilder.append(names[index]);
            if(index != names.length-2) stringBuilder.append(", ");
        }
        stringBuilder.append(" and " + names[names.length-1]);
        return stringBuilder.toString();
    }

    public String[] getSingleNames(String[] given) {
        List<String> singleWords = List.of(given);
        List<String> singleWordsWithoutWhiteSpaces = singleWords.stream().filter(t -> t != " ").toList();
        return singleWordsWithoutWhiteSpaces.toArray(String[]::new);
    }
}
