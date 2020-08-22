package invoker;

import command.Command;
import command.NoCommand;

public class SimpleRemoteController {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public SimpleRemoteController(){
        onCommands = new Command[2];
        offCommands = new Command[2];
        NoCommand noCommand = new NoCommand();
        for(int i=0;i<2;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    public void undoButtonWasPressed() {
        undoCommand.undo();
    }
}