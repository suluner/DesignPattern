public class Circle extends Shape{
    private String inColor;
    private int exRadius;

    public Circle(String inColor) {
        this.inColor = inColor;
    }

    public void setExRadius(int exRadius) {
        this.exRadius = exRadius;
    }

    public void draw() {
        System.out.println(String.format("Circle with color: %s and radius: %s", inColor, exRadius));
    }
}
