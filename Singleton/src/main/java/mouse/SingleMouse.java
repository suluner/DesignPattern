package mouse;

public class SingleMouse {
    private static SingleMouse singleMouse = null;

    private SingleMouse(){};

    private static class SingleHolder{
        public static SingleMouse instance = new SingleMouse();
    }

    public static SingleMouse getInstance(){
        return SingleHolder.instance;
    }

    public void move(){
        System.out.println("Mouse is moving");
    }
}
