public class MeanSquareError {

    public static double meanSquare(int[] arr1, int[] arr2) {

        double temp = 0;

        for (int index = 0; index < arr1.length; index++) {
            temp += Math.pow((arr1[index] - arr2[index]), 2);
        }
        return temp / arr1.length;
    }
}
