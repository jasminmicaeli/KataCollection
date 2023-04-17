import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.stream.Stream;

public class CountCharactersInYouStringTest {

    @ParameterizedTest
    @MethodSource("data")
    public void testingDifferentDataInput(String given, HashMap<String, Integer> expectedHashMap){

        HashMap<String, Integer> actualHashMap = new HashMap<String, Integer>();
        CountCharactersInYourString kata = new CountCharactersInYourString();
        actualHashMap = kata.countCharacters(given);

        Assertions.assertEquals(expectedHashMap, actualHashMap);
    }
    public static Stream<Arguments> data(){
        return Stream.of(
                Arguments.of("abcde", new HashMap<String, Integer>() {{
                    put("a", 1);
                    put("b", 1);
                    put("c", 1);
                    put("d", 1);
                    put("e", 1);
                }}),
                Arguments.of("aabahhedd", new HashMap<String, Integer>(){{
                    put("a", 3);
                    put("b", 1);
                    put("h", 2);
                    put("e", 1);
                    put("d", 2);
                }}),
                Arguments.of("", new HashMap<String, Integer>())
        );
    }
}