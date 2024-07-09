package command;

public class LightOnCommnad implements Command {
    Light light;
    public LightOnCommnad(Light light){
        this.light = light;
    }

    @Override
    public void excute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
    
}
