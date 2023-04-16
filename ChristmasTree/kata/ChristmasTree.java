import java.util.ArrayList;
import java.util.List;

public class ChristmasTree {

    String typeOfTree = "X";
    int heightOfTree = 0;
    int widthOfRow = 1;

    public ChristmasTree(int heightOfTree) {
        this.heightOfTree = heightOfTree;
    }

    public String Draw(){
        List<String> listOfTreeRows = new ArrayList<>();

        for(int row = 1; row <= heightOfTree; row++){
            listOfTreeRows.add( getTreeRow (row) );
            widthOfRow += 2;
        }

        return String.join("\n", listOfTreeRows);
    }

    String getTreeRow(int row){
        return " ".repeat(heightOfTree-row) + typeOfTree.repeat(widthOfRow);
    }
}
