import java.util.ArrayList;
import java.util.List;

public class JosephusPermutation {

    public List<Integer> permutate(List<Integer> items, int k){
        List<Integer> result = new ArrayList<>();
        int maxi = items.size();
        int index = k;

        while(result.size() < maxi){

            if(items.size() == 1){
                result.add(items.get(0));
                break;
            }

            List<Integer> proxy = new ArrayList<>(List.copyOf(items));

            if(index > items.size()){
                index = k - items.size();
            }

            for (int i = index; i <= items.size(); i += k) {

                result.add(items.get(i - 1));

                if (i + k > items.size()) {
                    index = i + k - items.size();
                }

                proxy.remove(items.get(i - 1));
            }
            items = List.copyOf(proxy);
        }
        return result;
    }
}
