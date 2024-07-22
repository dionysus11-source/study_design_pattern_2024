package iterator;

public class Waitless {
    PancakeHouseMenu pancakeHouseMenu;
    DinnerMenu dinnerMenu;

    public Waitless(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator panIterator = pancakeHouseMenu.createIterator();
        Iterator dinIterator = dinnerMenu.createIterator();

        System.out.println("메뉴\n----\n아침메뉴");
        printMenu(panIterator);
        System.out.println("\n점심 메뉴\n");
        printMenu(dinIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
