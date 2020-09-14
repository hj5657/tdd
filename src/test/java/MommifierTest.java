import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MommifierTest {
    @Test
    void should_return_string_when_the_number_of_vowels_not_more_than_30_percent_of_the_string_length() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convert("hhhhh");
        Assertions.assertEquals("hhhhh",result);
    }
    @Test
    void should_insert_mommy_for_each_continus_set_vowels_when_the_number_of_vowels_more_than_30_percent_of_the_string_length() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convert("aebcde");
        Assertions.assertEquals("amommyebcde",result);
    }
}
