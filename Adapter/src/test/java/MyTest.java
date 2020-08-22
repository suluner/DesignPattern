import adaptee.Adaptee;
import adapter.Adapter;
import adapter.Target;

public class MyTest {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter();
        target.setAdaptee(adaptee);
        target.request();
    }
}