import java.util.*;

public class TopWords {
    List<String> result = new ArrayList<>();
    public List<String> top3(String s) {

        s = s.replaceAll("[^\\w\\s']+", "");

        List<String> temp = Arrays.stream(s.split(" ")).toList();

        Map<String, Integer> occurences = new HashMap<>();

        for (String str : temp) {
            if (!Objects.equals(str, "")) {
                if (!occurences.containsKey(str)) {
                    occurences.put(str, 1);
                } else {
                    int count = occurences.get(str);
                    occurences.put(str, count + 1);
                }
            }
        }
        var hmap = sortByValue(occurences);
        return result;
    }


    public <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        int bound = Math.min(list.size(), 3);

        for(int i = 0; i < bound; i++){
            result.add(list.get(i).getKey().toString());
        }

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
