import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class CleanUpAfterYourDogTest {
        @Test
        public void sampleTest() {
            Assert.assertEquals(CleanUpAfterYourDog.crap(createGarden("____", "__@_", "___@"), 2, 1), "Clean");
            Assert.assertEquals(CleanUpAfterYourDog.crap(createGarden("____", "__@_", "___@"), 1, 1), "Cr@p");
            Assert.assertEquals(CleanUpAfterYourDog.crap(createGarden("____", "__@_", "D___"), 2, 2), "Dog!!");
        }

        private char[][] createGarden(String... s) {
            return Arrays.stream(s)
                    .map(String::toCharArray)
                    .toArray(char[][]::new);
        }
}