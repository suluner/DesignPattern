package command;

import recevier.Light;

public class LightOnCommand implements Command{
    Light light;
    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }

    public LightOnCommand(Light light) {
        this.light = light;
    }
}
