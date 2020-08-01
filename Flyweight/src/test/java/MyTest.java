public class MyTest {
    public static void main(String[] args) {
        Shape circle = (Circle) ShapeFactory.getCircle("Red");
        circle.setExRadius(5);
        circle.draw();

        circle = (Circle) ShapeFactory.getCircle("Green");
        circle.setExRadius(6);
        circle.draw();

        circle = (Circle) ShapeFactory.getCircle("Red");
        circle.setExRadius(7);
        circle.draw();
    }
}