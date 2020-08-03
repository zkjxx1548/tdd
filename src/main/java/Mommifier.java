import java.util.Arrays;
import java.util.Objects;

public class Mommifier {
    public Mommifier() {
    }

    public String insertMommy(String word) {
        long count = Arrays.stream(word.split(""))
                .filter(s -> isVowels(s))
                .count();
        if (count / (double) word.length() <= 0.3) {
            return word;
        }


        return null;
    }

    public boolean isVowels(String letter) {
        String lowercaseLetter = letter.toLowerCase();
        return Objects.equals(lowercaseLetter, "a") || Objects.equals(lowercaseLetter, "e")
    || Objects.equals(lowercaseLetter, "i") || Objects.equals(lowercaseLetter, "o")
    || Objects.equals(lowercaseLetter, "u");
    }
}
