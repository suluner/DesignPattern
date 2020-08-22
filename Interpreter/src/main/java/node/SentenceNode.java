package node;

public class SentenceNode extends AbstractNode{
    private AbstractNode direction;
    private AbstractNode action;
    private AbstractNode distance;

    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}
