package command;

public class RemoteControlTest {
    public static void main(String[] args){
        SimpleRemoteContorl remote = new SimpleRemoteContorl();
        Light light = new Light("거실 조명 ");
        LightOnCommnad lighton = new LightOnCommnad(light);
        
        GarageDoor garageDoor = new GarageDoor("차고");
        GarageDoorOpenCommand dooropen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lighton);
        remote.buttonWasPressed();
        remote.setCommand(dooropen);
        remote.buttonWasPressed();
    }
    
    
}
