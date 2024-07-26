package proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private static final long serialVersionUID = 2L;
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state;
    int count = 0;
    String location;

    public GumballMachine(String location, int count) throws RemoteException {
            this.soldOutState = new SoldOutState(this);
            this.noQuarterState = new NoQuarterState(this);
            this.hasQuarterState = new HasQuaterState(this);
            this.soldState = new SoldState(this);
            this.winnerState = new WinnerState(this);
            this.location = location;

        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState; 
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuater();
    }

    public void turnCrank() {
        state.turnCrank();
        if (state == winnerState || state == soldState) {
            state.dispense();
        }
    }

    public void releaseBall(){
        System.out.println("알맹이를 내보내고 있습니다.");
        if (count > 0) {
            count = count - 1;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoQuaterState() {
        return this.noQuarterState;
    }

    public State getHasQuaterState() {
        return this.hasQuarterState;
    }

    public State getSoldOutState() {
        return this.soldOutState;
    }

    public State getSoldState() {
        return this.soldState;
    }

    public State getWinnerState() {
        return this.winnerState;
    }

    public int getCount() {
        return this.count;
    }

    public String getLocation() {
        return this.location;
    }

    public State getState() {
        return this.state;
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
		if (state == soldOutState) {
			result.append("sold out");
		} else if (state == noQuarterState) {
			result.append("waiting for quarter");
		} else if (state == hasQuarterState) {
			result.append("waiting for turn of crank");
		} else if (state == soldState) {
			result.append("delivering a gumball");
		}
		result.append("\n");
		return result.toString();
	}
    
}
