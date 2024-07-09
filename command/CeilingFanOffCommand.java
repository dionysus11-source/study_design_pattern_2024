package command;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void excute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.high();
    }

    
    
}
