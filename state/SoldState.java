package state;

public class SoldState extends State {

    public SoldState (GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuaterState());
        } else {
            System.out.println("oops out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
