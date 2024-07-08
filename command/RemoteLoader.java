package command;

public class RemoteLoader {
    public static void main(String args[]){
        RemoteControl remoteControl = new RemoteControl();
        Stereo stereo = new Stereo("Living Room");

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        remoteControl.setCommand(0, stereoOnWithCDCommand, stereoOffCommand );
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

    }
    
}
