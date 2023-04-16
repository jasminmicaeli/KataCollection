public class CleanUpAfterYourDog {

    public static String crap(final char[][] garden, int bags, int capacity) {

        int totalCapacity = bags * capacity;

        for (char[] row : garden) {
            for(char field : row){
                if(field == 'D') return "Dog!!";
                else if(field == '@') totalCapacity --;
            }
            if(totalCapacity < 0) return "Cr@p";
        }
        return "Clean";
    }
}