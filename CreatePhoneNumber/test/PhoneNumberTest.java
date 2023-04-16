import org.junit.Assert;
import org.junit.Test;

public class PhoneNumberTest {

    @Test
    public void test(){
        String expected = "(123) 456-7890";
        String actual;
        int[] given =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        PhoneNumber phoneNumber = new PhoneNumber();
        actual = phoneNumber.createPhoneNumber(given);

        Assert.assertEquals(expected, actual);
    }
}