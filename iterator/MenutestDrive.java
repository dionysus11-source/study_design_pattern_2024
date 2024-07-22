package iterator;

public class MenutestDrive {
    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        Waitless waitless = new Waitless(pancakeHouseMenu, dinnerMenu);
        waitless.printMenu();
    }
    
}
