package strategypattern;

public class FlyRocketPowered implements FlyBehavior {
    public void fly(){
        System.out.println("로켓 추친으로 날라갑니다.");
    }
}
