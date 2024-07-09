package command;

public class CeilingFanHighCommnad implements Command {
    CeilingFan ceilingFan;

    public CeilingFanHighCommnad(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void excute() {
        ceilingFan.high();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
    
}
