public class TakeATenMinuteWalk {

    public boolean walk(char[] directions){
        if(directions.length != 10) return false;
        int xCoordinate = 0;
        int yCoordinate = 0;

        for(char direction : directions){
            switch (direction) {
                case 'n' -> yCoordinate++;
                case 'e' -> xCoordinate++;
                case 's' -> yCoordinate--;
                case 'w' -> xCoordinate--;
            }
        }
        return xCoordinate == 0 && yCoordinate == 0;
    }
}
