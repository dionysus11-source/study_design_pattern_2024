package combining;

public class Quakologist implements Observer{

    @Override
    public void update(QuackObservable duck) {
        System.out.println("꽥꽥학자: " + duck + "가 방금 소리 냈다.");
    }

    
}
