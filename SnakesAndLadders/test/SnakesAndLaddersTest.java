import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class SnakesAndLaddersTest {

    @ParameterizedTest
    @MethodSource("testingData")
    public void testsFromCodewars(int[] board, int[] dice, int expectedField){
        int actualField;

        SnakesAndLadders snakesAndLadders = new SnakesAndLadders();
        actualField = snakesAndLadders.play(board, dice);

        assertEquals(expectedField, actualField);
    }
    private static Stream<Arguments> testingData(){
        return Stream.of(
                Arguments.of(new int[] {0,0,0,0,0,0}, new int[] {6, 6, 6, 6}, 0),
                Arguments.of(new int[] {0,0,3,0,0,0,0,-2,0,0,0}, new int[] {2,1,5,1,5,4}, 10),
                Arguments.of(new int[] {0,0,0,0,0,0,-4,0,0,0,5,0,0,-2,-5,0,0,7,0,-14,8,0,0,0,0,0,0,0,0,0}, new int[] {3, 4, 3, 4, 4, 1, 2, 1, 2}, 27 )
        );
    }
}