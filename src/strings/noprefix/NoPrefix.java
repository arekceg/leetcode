package strings.noprefix;

import java.util.List;

import static java.lang.Integer.MAX_VALUE;

public class NoPrefix {
    public static String noPrefix(List<String> words) {
        int minIndex = MAX_VALUE;
        for (int j = 0; j < words.size(); j++) {
            String potentialPrefix = words.get(j);
            for (int i = 0; i < words.size(); i++) {
                if (i == j){
                    continue;
                }
                String word = words.get(i);
                if (word.indexOf(potentialPrefix) == 0) {
                    minIndex = Math.min(minIndex, i);
                }
            }
        }
        if (minIndex == MAX_VALUE) return null;
        final var word = words.get(minIndex);
        System.out.println("BAD SET");
        System.out.println(word);
        return word;
    }
}

