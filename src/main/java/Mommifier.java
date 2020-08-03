

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

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
        String[] letters = word.split("");
        int vowelCount = 0;
        for (int i = 0; i < letters.length; i++) {
            if (isVowels(letters[i])) {
                vowelCount++;
                continue;
            }
            if (vowelCount > 1) {
                letters[i] = "mommy" + letters[i];
            }
            vowelCount = 0;
        }
        if (vowelCount > 1) {
            letters[letters.length - 1] = letters[letters.length - 1] + "mommy";
        }

        return convertToString(letters);
    }

    public boolean isVowels(String letter) {
        String lowercaseLetter = letter.toLowerCase();
        return Objects.equals(lowercaseLetter, "a") || Objects.equals(lowercaseLetter, "e")
    || Objects.equals(lowercaseLetter, "i") || Objects.equals(lowercaseLetter, "o")
    || Objects.equals(lowercaseLetter, "u");
    }

    public String convertToString(String[] strings) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            s.append(strings[i]);
        }
        return s.toString();
    }
}
