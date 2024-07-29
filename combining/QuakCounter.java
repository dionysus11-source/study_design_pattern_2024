package combining;

public class QuakCounter implements Quakable {
    Quakable duck;
    static int numberOfQuack;

    public QuakCounter(Quakable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuack++;
    }

    public static int getQuacks() {
        return numberOfQuack;
    }
    
}
