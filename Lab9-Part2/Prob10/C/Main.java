package Lab9.Part2.Prob10.C;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int max = myIntStream().max().orElse(0);
        int min = myIntStream().min().orElse(0);
        System.out.println("Max" + max + "Min" + min);
    }

    public static IntStream myIntStream() {
        return IntStream.of(1, 3, 4, 5, 6, 7);
    }
}
