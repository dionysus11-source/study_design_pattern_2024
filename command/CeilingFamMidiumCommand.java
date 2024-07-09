package command;

public class CeilingFamMidiumCommand implements Command {
    CeilingFan ceilingFan;
    int prevValue;

    public CeilingFamMidiumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void excute() {
        prevValue = ceilingFan.getSpeed();
        ceilingFan.medium();
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
