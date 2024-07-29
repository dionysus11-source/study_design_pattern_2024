package combining;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quakable mallardDuck =  duckFactory.createMallardDuck();
        Quakable redheadDuck = duckFactory.createRedheadDuck();
        Quakable duckCall = duckFactory.createDuckCall();
        Quakable rubberDuck = duckFactory.createRubberDuck();
        Quakable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("오리 시뮬레이션 게임");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("오리가 소래 낸 횟수: " + QuakCounter.getQuacks());

    }

    void simulate(Quakable duck) {
        duck.quack();
    }
    
}
