import java.util.List;

public class ConcreteIterator implements Iterator{
    private List<Object> list = null;
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    public Object first() {
        index = 0;
        return this.list.get(index);
    }

    public Object next() {
        Object obj = null;
        if(this.hasNext()){
            obj = list.get(++index);
        }
        return obj;
    }

    public boolean hasNext() {
        if(index<list.size()-1){
            return true;
        }
        return false;
    }
}
