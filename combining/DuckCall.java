package combining;

public class DuckCall implements Quakable {
    Observable observable;

    public DuckCall(){
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("꽉꽉");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
    
    public String toString() {
        return "DuckCall";
    }
}
