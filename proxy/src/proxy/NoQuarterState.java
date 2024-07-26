package proxy;

public class NoQuarterState implements State {
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다");
        gumballMachine.setState(gumballMachine.getHasQuaterState());
    }

    public String toString() {
        return "동전 투입 대기 중";
    }

    @Override
    public void ejectQuater() {
    }

    @Override
    public void turnCrank() {
    }

    @Override
    public void dispense() {
    }
}
