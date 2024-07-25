package state;

public class HasQuaterState implements State {
    GumballMachine gumballMachine;

    public HasQuaterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전은 한개만 넣어주세요.");
    }

    @Override
    public void ejectQuater() {
        System.out.println("동전이 반환됩니다.");
        gumballMachine.setState(gumballMachine.getNoQuaterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이를 돌리셨습니다.");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispense'");
    }
    
}
