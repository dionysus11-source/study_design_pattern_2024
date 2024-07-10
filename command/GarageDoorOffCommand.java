package command;

public class GarageDoorOffCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOffCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void excute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
    
}