import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class YouAreARobot {
    StringBuilder sb = new StringBuilder();

    public String getInstructions(String message) {
        List<String> instructions = new ArrayList<>();
        List<String> singleDirections = List.of(message.split(""));

        sb.append(singleDirections.get(0));

        for(int i = 1; i < message.length(); i++) {
            if(!Objects.equals(singleDirections.get(i), singleDirections.get(i - 1))) {
                sb.append(";");
            }
            sb.append(singleDirections.get(i));
        }

        for(String element : sb.toString().split(";")){
            int count = element.length();
            if(count == 1){
                instructions.add("Take 1 step " + directionOf(element.charAt(0)));
            }
            else if(count > 1){
                instructions.add("Take " + count + " steps " + directionOf(element.charAt(0)));
            }
        }

        return String.join("\n", instructions);
    }

    private String directionOf(char charAt) {
        return  charAt == '^' ? "UP" :
                charAt == '>' ? "RIGHT":
                charAt == 'v' ? "DOWN":
                                "LEFT";
    }
}
