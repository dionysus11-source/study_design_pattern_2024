package combining;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Flock implements Quakable {
    List<Quakable> quackers = new ArrayList<Quakable>();

    public void add(Quakable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator<Quakable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quakable quacker = iterator.next();
            quacker.quack();
        }
    }
    
}
