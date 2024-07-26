package state;

public class NoQuarterState extends State {

    public NoQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다");
        gumballMachine.setState(gumballMachine.getHasQuaterState());
    }
}
