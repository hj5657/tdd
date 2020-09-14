import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MommifierTest {
    @Test
    void should_return_string_when_the_number_of_vowels_not_more_than_30_percent_of_the_string_length() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convert("hhhhh");
        Assertions.assertEquals("hhhhh",result);
    }
}
