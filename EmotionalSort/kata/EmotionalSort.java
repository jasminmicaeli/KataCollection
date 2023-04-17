import java.util.*;

public class EmotionalSort {

    public String[] sortEmotions(boolean order, String[] emotions) {

        String[] chartOfEmotions = {":D", ":)", ":|", ":(", "T_T"};
        List<String> emotionsList = Arrays.asList(emotions);
        emotionsList.sort(Comparator.comparingInt(emotion -> Arrays.asList(chartOfEmotions).indexOf(emotion)));

        if (order) {
            return emotionsList.toArray(new String[0]);
        } else {
            Collections.reverse(emotionsList);
            return emotionsList.toArray(new String[0]);
        }
    }
}
