package iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
    Map<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

    public CafeMenu() {
        addItem("베지 버거와 에어프라이" , "통밀빵, 상추 토마토가 첨가된 베지버거", true, 3.99);
        addItem("오늘의 스프" , "샐러드가 겉들여진 오늘의 스프", false, 3.69);
        addItem("부리토" , "통 핀토콩과 살사, 구아카몰", true, 4.29);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }


    
}
