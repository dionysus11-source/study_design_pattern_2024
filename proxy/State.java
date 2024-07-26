package proxy;

abstract class State {
    protected GumballMachine gumballMachine;

    public State(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    public void insertQuarter() {
        System.out.println("동전을 넣을 수 없습니다");

    }
    public void ejectQuater() {
        System.out.println("동전을 반환할 수 없습니다");

    }
    public void turnCrank() {
        System.out.println("손잡이를 돌릴 수 없습니다");

    }
    public void dispense() {
        System.out.println("알맹이가 나올 수 없습니다");
    }

    public void refill() {
        System.out.println("리필할 필요가 없습니다");
    }
}
