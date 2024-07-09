package command;

public class RemoteLoaderUndo{
    public static void main(String args[]){
        RemoteControl remoteControl = new RemoteControl();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanHighCommnad ceilingFanHighCommnad = new CeilingFanHighCommnad(ceilingFan);
        CeilingFamMidiumCommand ceilingFanMediumCommnad = new CeilingFamMidiumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommnad = new CeilingFanOffCommand(ceilingFan);
        

        remoteControl.setCommand(0, ceilingFanMediumCommnad, ceilingFanOffCommnad);
        remoteControl.setCommand(1, ceilingFanHighCommnad, ceilingFanOffCommnad);

        System.out.println(remoteControl);
        
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

    }
    
}
