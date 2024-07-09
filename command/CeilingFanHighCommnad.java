package command;

public class CeilingFanHighCommnad implements Command {
    CeilingFan ceilingFan;
    int prevValue;

    public CeilingFanHighCommnad(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
        this.prevValue = ceilingFan.getSpeed();
    }

    @Override
    public void excute() {
        prevValue = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if(prevValue == CeilingFan.HIGH){
            ceilingFan.high();
        } else if(prevValue == CeilingFan.MEDIUM){
            ceilingFan.medium();
        } else if(prevValue == CeilingFan.LOW){
            ceilingFan.low();
        } else if(prevValue == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
    
}
