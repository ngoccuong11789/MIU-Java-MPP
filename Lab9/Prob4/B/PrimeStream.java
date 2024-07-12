package Lab9.Prob4.B;

import java.util.stream.Stream;

public class PrimeStream {

    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(n); i += 2) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static int nextPrime(int n) {
        int cadidate = n + 1;
        while (!isPrime(cadidate)) {
            cadidate++;
        }
        return cadidate;
    }

    public Stream<Integer> generratePrimes() {
        return Stream.iterate(2, PrimeStream::nextPrime);
    }

    public void printFirstNPrimes(long n) {
        generratePrimes().limit(n).forEach(System.out::println);
    }


    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }
}
