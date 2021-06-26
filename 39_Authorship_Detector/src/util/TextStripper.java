package util;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TextStripper {
    public static String cleanUp(String word) {
        return word.toLowerCase()
                .replaceAll("^[!.,:;\\-?<>#\\*\'\"\\[\\(\\]\\)\\n\\t\\\\]+|[!.,:;\\-?<>#\\*\'\"\\[\\(\\]\\)\\n\\t\\\\]+$", "");
    }

    public List<String> generateCleanStringCollection(Collection<String> lines) {
        List<String> words = lines.stream().map(s -> s.split("\\s"))
                .flatMap(Arrays::stream)
                .map(TextStripper::cleanUp)
                .collect(Collectors.toList());
        return words;
    }

    public List<String> generateCleanSentenceCollection(Collection<String> lines) {
        String[] sentence = lines.stream().collect(Collectors.joining(" "))
                .split("[\\.{1,}\\?\\!]");

        return Arrays.stream(sentence)
                .filter(s -> !s.isBlank())
                .collect(Collectors.toList());
    }

}
