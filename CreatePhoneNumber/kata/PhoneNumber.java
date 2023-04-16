public class PhoneNumber {
    public String createPhoneNumber(int[] numbers) {
        StringBuilder numbersAsString = new StringBuilder();

        for(int number : numbers){
            numbersAsString.append(number);
        }
        return "("  + numbersAsString.substring(0, 3) + ") "
                + numbersAsString.substring(3, 6) + "-"
                + numbersAsString.substring(6, numbers.length);
    }
}
