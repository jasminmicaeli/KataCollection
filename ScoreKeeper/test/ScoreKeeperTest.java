import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScoreKeeperTest {
    @Test
    public void EveryScorePossibleForTeamA_NoScoreForeTeamB_ShouldReturn_006_000(){
        String expected = "006:000";
        String actual;

        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA();
        scoreKeeper.scoreTeamA2();
        scoreKeeper.scoreTeamA3();
        actual = scoreKeeper.getScore();

        assertEquals(expected, actual);
    }

    @Test
    public void EveryScorePossibleForTeamA_NoScoreForeTeamB_ShouldReturn_009_015(){
        String expected = "009:015";
        String actual;

        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA();
        scoreKeeper.scoreTeamA();
        scoreKeeper.scoreTeamA2();
        scoreKeeper.scoreTeamA2();
        scoreKeeper.scoreTeamA3();
        scoreKeeper.scoreTeamB();
        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamB3();
        scoreKeeper.scoreTeamB3();
        scoreKeeper.scoreTeamB3();
        scoreKeeper.scoreTeamB3();
        actual = scoreKeeper.getScore();

        assertEquals(expected, actual);
    }
}