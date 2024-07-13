package Lab9.Part2.Prob12;

import java.util.Optional;

public class MySingletonLazy {
    private static Optional<MySingletonLazy> instance = Optional.empty();

    private MySingletonLazy() {}

    public static MySingletonLazy getInstance() {
        synchronized (MySingletonLazy.class) {
            instance = Optional.ofNullable(instance.orElseGet(MySingletonLazy::new));
        }
        return instance.get();
    }

    public static void main(String[] args) {
        MySingletonLazy singleton1 = MySingletonLazy.getInstance();
        MySingletonLazy singleton2 = MySingletonLazy.getInstance();

        System.out.println("Singleton1: " + singleton1);
        System.out.println("Singleton2: " + singleton2);
        System.out.println("Both references are the same: " + (singleton1 == singleton2));
    }

}
