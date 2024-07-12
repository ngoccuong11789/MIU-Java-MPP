package Lab9.Prob4.A;

import java.util.stream.Stream;

public class PrimeStream {

    public static void main(String[] args) {

        final Stream<Integer> primes = Stream.iterate(2, PrimeStream::nextPrime);

        primes.limit(10).forEach(System.out::println);
    }

    public static boolean isPrime(int number) {
        if(number <= 1) return false;
        if(number == 2) return true;
        if(number % 2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(number); i += 2) {
            if(number % i == 0) return false;
        }
        return true;
    }

    public static int nextPrime(int after) {
        int candidate = after + 1;
        while(!isPrime(candidate)) {
            candidate++;
        }
        return candidate;
    }

}
