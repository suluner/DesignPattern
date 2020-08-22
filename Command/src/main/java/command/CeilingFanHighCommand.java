package command;

import recevier.CeilingFan;

public class CeilingFanHighCommand implements Command{
    private CeilingFan ceilingFan;
    private int preSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        preSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.high();
    }

    public void undo() {
        if(preSpeed == CeilingFan.HIGH){
            this.ceilingFan.high();
        } else if(preSpeed == CeilingFan.MEDIUM){
            this.ceilingFan.medium();
        } else if(preSpeed == CeilingFan.LOW){
            this.ceilingFan.low();
        } else if(preSpeed == CeilingFan.OFF){
            this.ceilingFan.off();
        }
    }
}
