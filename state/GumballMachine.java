package state;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUATER = 1;
    final static int HAS_QUATER = 2;
    final static int SOLD = 2;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUATER;
        }
    }

    public void insertQuater() {
        if (state == HAS_QUATER) {
            System.out.println("동전은 하나만 넣어주세요");
        } else if (state == NO_QUATER) {
            state = HAS_QUATER;
            System.out.println("동전을 넣으셨습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진 되었습니다. 다음 기회에 이용해주세요");
        } else if (state == SOLD) {
            System.out.println("알맹이를 내보내고 있습니다.");
        }
    }
    
    public void ejectQuater() {
        if (state == HAS_QUATER) {
            System.out.println("동전이 반환됩니다.");
            state = NO_QUATER;
        } else if (state == NO_QUATER) {
            System.out.println("동전을 넣어주세요.");
        } else if (state == SOLD_OUT) {
            System.out.println("동전을 넣지 않았습니다. 동전이 반환되지 않습니다.");
        } else if (state == SOLD) {
            System.out.println("이미 알맹이를 뽑으셨습니다.");
        }
    }

    public void turnCrank() {
        if (state == HAS_QUATER) {
            System.out.println("손잡이를 돌리셨습니다");
            state = SOLD;
            dispense();
        } else if (state == NO_QUATER) {
            System.out.println("동전을 넣어주세요.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진 되었습니다.");
        } else if (state == SOLD) {
            System.out.println("손잡이는 한번만 돌려주세요.");
        }
    }

    public void dispense() {
        if (state == SOLD) {
            System.out.println("알맹이를 내보내고 있습니다");
            count = count -1;
            if (count == 0) {
                System.out.println("더이상 알맹이가 없습니다.");
                state = SOLD_OUT;
            } else {
                state = NO_QUATER;
            }
        } else if (state == NO_QUATER) {
            System.out.println("동전을 넣어 주세요");
        } else if (state == SOLD_OUT) {
            System.out.println("매진입니다");
        } else if (state == HAS_QUATER) {
            System.out.println("알맹이를 내보낼 수 없습니다ㅣ");
        }
    }

    	public void refill(int numGumBalls) {
		this.count = numGumBalls;
		state = NO_QUATER;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004\n");
		result.append("Inventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\nMachine is ");
		if (state == SOLD_OUT) {
			result.append("sold out");
		} else if (state == NO_QUATER) {
			result.append("waiting for quarter");
		} else if (state == HAS_QUATER) {
			result.append("waiting for turn of crank");
		} else if (state == SOLD) {
			result.append("delivering a gumball");
		}
		result.append("\n");
		return result.toString();
	}
    
}
