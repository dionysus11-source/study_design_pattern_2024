package state;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumbalMachine = new GumballMachine(5);

        System.out.println(gumbalMachine);

        gumbalMachine.insertQuater();
        gumbalMachine.turnCrank();

        System.out.println(gumbalMachine);

        gumbalMachine.insertQuater();
        gumbalMachine.ejectQuater();
        gumbalMachine.turnCrank();

        System.out.println(gumbalMachine);

        gumbalMachine.insertQuater();
        gumbalMachine.turnCrank();
        gumbalMachine.insertQuater();
        gumbalMachine.turnCrank();
        gumbalMachine.ejectQuater();

        System.out.println(gumbalMachine);

        gumbalMachine.insertQuater();
        gumbalMachine.insertQuater();
        gumbalMachine.turnCrank();
        gumbalMachine.insertQuater();
        gumbalMachine.turnCrank();
        gumbalMachine.insertQuater();
        gumbalMachine.turnCrank();

        System.out.println(gumbalMachine);
    }
    
}
