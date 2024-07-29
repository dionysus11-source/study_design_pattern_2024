package combining;

public class GooseAdapter implements Quakable {
    Goose goose;
    Observable observers;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        this.observers = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observers.notifyObservers();
    }
    
}
