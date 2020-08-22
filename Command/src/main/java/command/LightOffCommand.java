package command;

import recevier.Light;

public class LightOffCommand implements Command{
    Light light;

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }

    public LightOffCommand(Light light) {
        this.light = light;
    }


}
