import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    @Test
    void should_return_input_when_insert_mommy_given_string_of_vowels_less_than_30_percent() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.insertMommy("apppppplee");
        assertEquals(result, "apppppplee");
    }

    @Test
    void should_return_input_when_insert_mommy_given_string_of_vowels_more_than_30_percent_but_not_continuous() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.insertMommy("appple");
        assertEquals(result, "appple");
    }

    @Test
    void should_return_input_when_insert_mommy_given_string_of_vowels_more_than_30_percent_and_continuous() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.insertMommy("appeeple");
        assertEquals(result, "appeemommyple");
    }
}
