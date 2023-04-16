import java.util.Arrays;
import java.util.List;

public class SmartDogOwner {

    String woofs;
    String alphabet = "abcdefghijklmnopqrstuvwxyz";


    public SmartDogOwner(String woofs) {
        this.woofs = woofs;
    }

    public String woofDecoder(){
        List<String> singleWoofLetters = Arrays.stream(woofs.split("!")).toList();

        for(String indexOfABC : singleWoofLetters){
            int index = indexOfABC.split("-").length;

        }
        return "";
    }
}
