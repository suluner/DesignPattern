package strategy;

public class StudentDiscount implements Discount{
    public Double calculate(Double price) {
        System.out.println("学生票：8折");
        return price * 0.8;
    }
}
