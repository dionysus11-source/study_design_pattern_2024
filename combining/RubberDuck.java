package combining;

public class RubberDuck implements Quakable {
    Observable observers;

    public RubberDuck() {
        observers = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("삑삑");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observers.notifyObservers();
    }
    
    public String toString() {
        return "RubberDuck";
    }
}
