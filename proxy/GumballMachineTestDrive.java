package proxy;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        int count = 0;

        if(args.length < 2) {
            System.out.println("GumballMachine <name> <inventory");
            System.exit(1);
        }
        count = Integer.parseInt(args[1]);
        GumballMachine gumbalMachine = new GumballMachine(args[0], count);
        GumballMonitor monitor = new GumballMonitor(gumbalMachine);

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

        monitor.report();

    }
    
}
