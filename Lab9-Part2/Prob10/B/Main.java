package Lab9.Part2.Prob10.B;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
        System.out.println(stringStream.collect(Collectors.joining(", ")));
    }
}
