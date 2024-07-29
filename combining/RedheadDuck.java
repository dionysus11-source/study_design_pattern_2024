package combining;

public class RedheadDuck implements Quakable{
    Observable observers;

    public RedheadDuck() {
        this.observers = new Observable(this);
    }


    @Override
    public void quack() {
        System.out.println("꽥꽥");
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
        return "RedheadDuck";
    }
}
