package state;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumbalMachine = new GumballMachine(5);

        System.out.println(gumbalMachine);

        gumbalMachine.insertQuarter();
        gumbalMachine.turnCrank();

        System.out.println(gumbalMachine);

        gumbalMachine.insertQuarter();
        gumbalMachine.ejectQuarter();
        gumbalMachine.turnCrank();

        System.out.println(gumbalMachine);

        gumbalMachine.insertQuarter();
        gumbalMachine.turnCrank();
        gumbalMachine.insertQuarter();
        gumbalMachine.turnCrank();
        gumbalMachine.ejectQuarter();

        System.out.println(gumbalMachine);

        gumbalMachine.insertQuarter();
        gumbalMachine.insertQuarter();
        gumbalMachine.turnCrank();
        gumbalMachine.insertQuarter();
        gumbalMachine.turnCrank();
        gumbalMachine.insertQuarter();
        gumbalMachine.turnCrank();

        System.out.println(gumbalMachine);

        gumbalMachine.refill(5);
        
        System.out.println(gumbalMachine);

    }
    
}
