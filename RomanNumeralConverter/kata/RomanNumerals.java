public class RomanNumerals {

    public String convert(int number){
        String[]        romanNumbers                = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[]           correspondingIndianNumerals = {1000, 900, 500,  400, 100,   90,  50,   40,  10,    9,   5,    4,   1};
        StringBuilder   stringBuilder               = new StringBuilder();

        for(int index = 0; index < romanNumbers.length; index++){
            while(number >= correspondingIndianNumerals[index]){
                stringBuilder.append(romanNumbers[index]);
                number -= correspondingIndianNumerals[index];
            }
        }
        return stringBuilder.toString();
    }
}
