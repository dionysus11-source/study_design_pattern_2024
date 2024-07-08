package command;

public class SimpleRemoteContorl {
    Command slot;
    public SimpleRemoteContorl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed(){
        slot.excute();
    }
}
