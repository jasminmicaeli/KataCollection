public class ScoreKeeper {
    int pointsTeamA = 0;
    int pointsTeamB = 0;

    void scoreTeamA(){pointsTeamA ++;}
    void scoreTeamB(){pointsTeamB ++;}
    void scoreTeamA2(){pointsTeamA += 2;}
    void scoreTeamB2(){pointsTeamB += 2;}
    void scoreTeamA3(){pointsTeamA += 3;}
    void scoreTeamB3(){pointsTeamB += 3;}

    String getScore(){
        String pointsA = Integer.toString(pointsTeamA);
        String pointsB = Integer.toString(pointsTeamB);

        String a = bringPointsToRightFormat(pointsA);
        String b = bringPointsToRightFormat(pointsB);

        return a + ":" + b;
    }

    String bringPointsToRightFormat(String points){
        if(points.length() < 3) {
            return bringPointsToRightFormat("0" + points);
        }
        return points;
    }
}
