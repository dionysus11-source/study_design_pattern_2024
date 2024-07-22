package iterator;

import java.util.Iterator;

public class Waitless {
    Menu pancakeHouseMenu;
    Menu dinnerMenu;

    public Waitless(Menu pancakeHouseMenu, Menu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> panIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinIterator = dinnerMenu.createIterator();

        System.out.println("메뉴\n----\n아침메뉴");
        printMenu(panIterator);
        System.out.println("\n점심 메뉴\n");
        printMenu(dinIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
