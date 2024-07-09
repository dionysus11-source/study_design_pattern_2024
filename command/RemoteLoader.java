package command;

public class RemoteLoader {
    public static void main(String args[]){
        RemoteControl remoteControl = new RemoteControl();
        Stereo stereo = new Stereo("Living Room");
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight= new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, ()->livingRoomLight.on(), ()->livingRoomLight.off());
        remoteControl.setCommand(1, ()->kitchenLight.on(), ()->kitchenLight.off());
        remoteControl.setCommand(2, ()->ceilingFan.high(), ()->ceilingFan.off());
        remoteControl.setCommand(3, ()->garageDoor.up(), ()->garageDoor.down());
        remoteControl.setCommand(4, stereoOnWithCDCommand, stereoOffCommand );

        System.out.println(remoteControl);
        
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);

    }
    
}
