package strategy;

public class ChildrenDiscount implements Discount{
    public Double calculate(Double price) {
        System.out.println("儿童票：5折");
        return price * 0.5;
    }
}