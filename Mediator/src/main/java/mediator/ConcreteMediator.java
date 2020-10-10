package mediator;

import colleague.Colleague;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator{
    private List<Colleague> colleagues;

    public ConcreteMediator(){
        this.colleagues = new ArrayList<Colleague>();
    }
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleague.setMediator(this);
            this.colleagues.add(colleague);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        colleagues.forEach(c -> {
            if (!c.equals(colleague)) {
                c.receive();
            }
        });
    }
}
