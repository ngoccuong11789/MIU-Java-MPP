package Lab8.Prob1;

import java.util.function.Supplier;

public class Lambda {
    public static void main(String[] args) {
//        Supplier<Double> random = () -> Math.random();
//        System.out.println(random.get());

        class RandomSupplier implements Supplier<Double> {
            @Override
            public Double get() {
                return Math.random();
            }
        }

        Supplier<Double> randomSupplier = new RandomSupplier();
        System.out.println(randomSupplier.get());

    }
}
