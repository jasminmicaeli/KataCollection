import java.util.Arrays;

public class FindTheUniqueNumber {

    public static double findUnique(double[] arr) {

        arr = Arrays.stream(arr).sorted().toArray();

        if (arr.length > 1) {
            if (arr[0] == arr[1]) {
                double[] finalArr = arr;
                arr = Arrays.stream(arr).filter(x -> x != finalArr[0]).toArray();
                return findUnique(arr);
            } else {
                return arr[0];
            }

        } else {
            return arr[0];
        }
    }
}
