package combining;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quakable redheadDuck = duckFactory.createRedheadDuck();
        Quakable duckCall = duckFactory.createDuckCall();
        Quakable rubberDuck = duckFactory.createRubberDuck();
        Quakable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("오리 시뮬레이션 게임 (+컴포지트)");

        Flock flockofDucks = new Flock();
        flockofDucks.add(redheadDuck);
        flockofDucks.add(duckCall);
        flockofDucks.add(rubberDuck);
        flockofDucks.add(gooseDuck);

        Flock flockofMallards = new Flock();
        Quakable mallarOne = duckFactory.createMallardDuck();
        Quakable mallarTwo= duckFactory.createMallardDuck();
        Quakable mallarThree= duckFactory.createMallardDuck();
        Quakable mallarFour = duckFactory.createMallardDuck();
        flockofMallards.add(mallarOne);
        flockofMallards.add(mallarTwo);
        flockofMallards.add(mallarThree);
        flockofMallards.add(mallarFour);

        flockofDucks.add(flockofMallards);

        System.out.println("오리 시뮬레이션 게임: 전체 무리");
        simulate(flockofDucks);

        System.out.println("오리 시뮬레이션 게임: 물오리 무리");
        simulate(flockofMallards);


        System.out.println("오리가 소래 낸 횟수: " + QuakCounter.getQuacks());

    }

    void simulate(Quakable duck) {
        duck.quack();
    }
    
}
