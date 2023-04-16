import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeleteNth {

    public int[] delete(int[] content, int maxNumberOfItem){
        List<Integer> reducedContent = new ArrayList<>();

        for(int item : content){
            if(Collections.frequency(reducedContent, item) <= maxNumberOfItem){
                reducedContent.add(item);
            }
        }
        return reducedContent.stream().mapToInt(i->i).toArray();
    }
}
