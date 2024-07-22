package iterator;

import java.util.ArrayList;
import java.util.List;

public class MenutestDrive {
    public static void main(String args[]) {
        List<Menu> menus = new ArrayList<Menu>();
        menus.add(new PancakeHouseMenu());
        menus.add(new DinnerMenu());
        menus.add(new CafeMenu());
        Waitless waitless = new Waitless(menus);
        waitless.printMenu();
    }
    
}
