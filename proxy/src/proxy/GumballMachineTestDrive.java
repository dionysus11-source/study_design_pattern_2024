package proxy;

import java.rmi.Naming;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = null;
        int count = 0;

        if(args.length < 2) {
            System.out.println("GumballMachine <name> <inventory");
            System.exit(1);
        }
        try {
            count = Integer.parseInt(args[1]);

            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//" + "192.168.1.32" + "/gumballmachine", gumballMachine);
            //Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
            //Naming.rebind(args[0],gumballMachine);
            System.out.println("GumballMachine이 레지스트리에 바인딩되었습니다: ");
        } catch (Exception e)  {
            e.printStackTrace();
        }
    }
    
}
