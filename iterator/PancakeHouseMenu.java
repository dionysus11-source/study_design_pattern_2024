package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem(
            "K&B pancake set",
             "스크램블 에그와 토스트가 곁들여진 팬케이크",
              true, 2.99);
        addItem(
            "regular pancake", 
            "달걀 프라이와 소시지가 곁들여진 팬케이크",
              false, 2.99);
        addItem(
            "blueberry pancake",
             "신선한 블루베리 시럽으로 만든 팬케이크",
              true, 3.49);
        addItem(
            "waffle",
             "취향에 따라 블루베리나 딸기를 얹을 수 있는 와플",
              true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
