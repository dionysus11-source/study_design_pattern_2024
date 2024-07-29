package combining;

public class CountingDuckFactory extends AbstractDuckFactory{

    @Override
    public Quakable createMallardDuck() {
        return new QuakCounter(new MallardDuck());
    }

    @Override
    public Quakable createRedheadDuck() {
        return new QuakCounter(new RedheadDuck());
    }

    @Override
    public Quakable createDuckCall() {
        return new QuakCounter(new DuckCall());
    }

    @Override
    public Quakable createRubberDuck() {
        return new QuakCounter(new RubberDuck());
    }
    
}
