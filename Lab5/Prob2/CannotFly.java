package Lab5.Prob2;

public class CannotFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
}
