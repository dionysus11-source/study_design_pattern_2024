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
        LightOnCommnad livingRoomLightOnCommnad = new LightOnCommnad(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommnad kitchenLightOnCommnad= new LightOnCommnad(kitchenLight);
        LightOffCommand kitchenLightOffCommand= new LightOffCommand(kitchenLight);
        CeilingFanHighCommnad ceilingFanHighCommnad = new CeilingFanHighCommnad(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommnad = new CeilingFanOffCommand(ceilingFan);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);
        

        remoteControl.setCommand(0, livingRoomLightOnCommnad, livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommnad, kitchenLightOffCommand);
        remoteControl.setCommand(2, ceilingFanHighCommnad, ceilingFanOffCommnad);
        remoteControl.setCommand(3, garageDoorOpenCommand, garageDoorOffCommand);
        remoteControl.setCommand(4, stereoOnWithCDCommand, stereoOffCommand );

        System.out.println(remoteControl);
        
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(4);

    }
    
}
