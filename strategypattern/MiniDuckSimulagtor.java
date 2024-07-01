package strategypattern;

public class MiniDuckSimulagtor {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.perFormQuack();
        mallard.performFly();
    }
    
}
