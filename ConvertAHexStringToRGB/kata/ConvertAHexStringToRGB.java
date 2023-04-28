public class ConvertAHexStringToRGB {
    public int[] convert(String hex) {

        int resultRed = Integer.valueOf(hex.substring(1, 3), 16);
        int resultGreen = Integer.valueOf(hex.substring(3, 5), 16);
        int resultBlue = Integer.valueOf(hex.substring(5, 7), 16);

        return new int[]{resultRed, resultGreen, resultBlue};
    }
}
