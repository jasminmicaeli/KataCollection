import java.util.Arrays;
import java.util.List;

public class FindOutlier {
    public int Find(int[] numbers){

        boolean mostAreEven;

        mostAreEven = checkIfMostNumbersAreEven(numbers);

        if(mostAreEven){
            for(int number : numbers){
                if(number % 2 != 0) return number;
            }
        }
        else{
            for(int number : numbers){
                if(number % 2 == 0) return number;
            }
        }
        return 0;
    }

    boolean checkIfMostNumbersAreEven(int[] numbers){
        int numberOfEvenNumbers = 0;

        // if at least two out of three numbers are even the outlier must be uneven
        for(int index = 0; index < 3; index++){
            if(numbers[index] % 2 == 0){
                numberOfEvenNumbers++;
            }
        }
        return numberOfEvenNumbers >= 2;
    }
}
