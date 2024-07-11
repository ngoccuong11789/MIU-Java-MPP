package Lab8.Prob4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class WordCounter {
    public int countWords(List<String> words, char c, char d, int len) {
        return (int) words.stream()
                .filter(word ->
                     word.length() == len &&
                             word.indexOf(c) != -1 &&
                             word.indexOf(d) == -1
                        )
                .count();
    }

    public static void main(String[] args) {
        WordCounter wc = new WordCounter();
        List<String> words = List.of("apple", "banana", "cheery", "date", "elderberry");
        char c = 'e';
        char d = 'r';
        int len = 5;

        int result = wc.countWords(words, c, d, len);
        System.out.println(result);
    }
}
