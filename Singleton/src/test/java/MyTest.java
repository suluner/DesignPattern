import mouse.SingleMouse;

public class MyTest {

    public static void main(String args[]) {
        // Can not new a Instance
        SingleMouse singleMouse = SingleMouse.getInstance();
        singleMouse.move();
    }
}