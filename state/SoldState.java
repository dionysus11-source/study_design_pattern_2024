package state;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState (GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertQuarter'");
    }

    @Override
    public void ejectQuater() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ejectQuater'");
    }

    @Override
    public void turnCrank() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnCrank'");
    }

    @Override
    public void dispense() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispense'");
    }
    
}
