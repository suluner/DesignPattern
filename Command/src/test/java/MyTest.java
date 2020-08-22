import command.*;
import invoker.SimpleRemoteController;
import recevier.CeilingFan;
import recevier.Light;

public class MyTest {
    public static void main(String[] args) {
        SimpleRemoteController simpleRemoteController = new SimpleRemoteController();
        Command lightOnCommand = new LightOnCommand(new Light());
        Command lightOffCommand = new LightOffCommand(new Light());
        simpleRemoteController.setCommand(0, lightOnCommand, lightOffCommand);
        simpleRemoteController.onButtonWasPressed(0);
        simpleRemoteController.undoButtonWasPressed();

        CeilingFan ceilingFan = new CeilingFan("客厅");
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        Command ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        Command[] partyOn = {lightOnCommand, ceilingFanHighCommand};
        Command[] partyOff = {lightOffCommand, ceilingFanOffCommand};
        Command partyOnMacro = new MacroCommand(partyOn);
        Command partyOffMacro = new MacroCommand(partyOff);
        simpleRemoteController.setCommand(1, partyOnMacro, partyOffMacro);

        simpleRemoteController.onButtonWasPressed(1);
        simpleRemoteController.offButtonWasPressed(1);

        simpleRemoteController.undoButtonWasPressed();
    }
}
