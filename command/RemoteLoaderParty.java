package command;

public class RemoteLoaderParty{
    public static void main(String args[]){
        RemoteControl remoteControl = new RemoteControl();
        Light livingLight = new Light("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Stereo stereo = new Stereo("Living Room");

        Command livingRoomLightOnCommnad = new LightOnCommnad(livingLight);
        Command livingRoomLightOffCommand = new LightOffCommand(livingLight);
        Command ceilingFanHighCommnad = new CeilingFanHighCommnad(ceilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        Command stereoOnCommand = new StereoOnWithCDCommand(stereo); 
        Command stereoOffComand = new StereoOffCommand(stereo);

        Command[] onCommands = {livingRoomLightOnCommnad, ceilingFanHighCommnad, stereoOnCommand};
        Command[] offCommands = {livingRoomLightOffCommand, ceilingFanOffCommand,stereoOffComand};

        MacroCommand partyOnMacro = new MacroCommand(onCommands);
        MacroCommand partyOffMacro = new MacroCommand(offCommands);
        
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        
        System.out.println("----- Macro On -----");
        remoteControl.onButtonWasPushed(0);

        System.out.println("----- Macro Off -----");
        remoteControl.offButtonWasPushed(0);

    }
    
}
