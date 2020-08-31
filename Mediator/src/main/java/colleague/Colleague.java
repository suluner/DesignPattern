package colleague;

import mediator.Mediator;

public abstract class Colleague {
    protected Mediator mediator;

    public abstract void receive();

    //发送消息
    public abstract void send();

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
