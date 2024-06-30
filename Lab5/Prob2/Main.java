package Lab5.Prob2;

public class Main {
    public static void main(String[] args) {
        Duck[] ducks = {new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()};
        for(Duck duck : ducks) {
            System.out.println(duck.getClass().getSimpleName() + " :");
            duck.display();
            duck.performFly();
            duck.performQuack();
            duck.swim();
            System.out.println();
        }
    }
}
