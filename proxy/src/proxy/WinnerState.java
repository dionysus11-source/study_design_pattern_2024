package proxy;

public class WinnerState extends State {
    
    public WinnerState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0 ) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            System.out.println("축하드립니다! 알맹이를 하나 더 받으실 수 있습니다");
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuaterState());
            } else{
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
    
}
