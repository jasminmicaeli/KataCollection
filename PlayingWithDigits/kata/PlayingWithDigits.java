public class PlayingWithDigits {

    public long digPow(int n, int p){
        int sumOfPoweredNumbers = 0;
        String digitsLeft = String.valueOf(n);

        while(digitsLeft.length() > 0){
            int number = Integer.parseInt(digitsLeft.substring(0, 1));
            sumOfPoweredNumbers += Math.pow(number, p);
            digitsLeft = digitsLeft.substring(1);
            p++;
        }
        if (sumOfPoweredNumbers % n == 0) {
            return sumOfPoweredNumbers / n;
        }
        return -1;
    }
}
