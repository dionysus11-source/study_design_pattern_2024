package iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position;

    public PancakeHouseMenuIterator() {
    }

    @Override
    public boolean hasNext() {
		return items.size() > position;
    }

    @Override
    public MenuItem next() {
        return items.get(position++);
    }
    
}
