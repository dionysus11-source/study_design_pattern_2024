package combining;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        Quakable mallardDuck = new QuakCounter(new MallardDuck());
        Quakable redheadDuck = new QuakCounter(new RedheadDuck());
        Quakable duckCall = new QuakCounter(new DuckCall());
        Quakable rubberDuck = new QuakCounter(new RubberDuck());
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
