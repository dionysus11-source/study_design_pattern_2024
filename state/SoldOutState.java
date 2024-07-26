package state;

public class SoldOutState extends State{

    public SoldOutState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("죄송합니다. 매진되었습니다.");
    }

    @Override
    public void ejectQuater() {
        System.out.println("동전을 반환할 수 없습니다. 동전을 넣지 않았습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("죄송합니다. 매진되었습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("알맹이를 내보낼 수 없습니다");
    }

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuaterState());
    }
    
}
