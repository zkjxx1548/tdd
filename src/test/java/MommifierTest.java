import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    @Test
    void should_return_input_when_insert_mommy_given_string_of_vowels_less_than_30_percent() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.insertMommy("apppppplee");
        assertEquals(result, "apppppplee");
    }
}
