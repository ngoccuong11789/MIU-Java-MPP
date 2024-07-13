package Lab9.Part2.Prob9;

import java.util.stream.IntStream;

public class SquarePrinter {
    public static void main(String[] args) {
        printSquares(4);  // Example usage, should print 1, 4, 9, 16
    }

    public static void printSquares(int num) {
        IntStream.iterate(1, n -> n + 1)
                .limit(num)
                .map(n -> n * n)
                .forEach(System.out::println);
    }
}
