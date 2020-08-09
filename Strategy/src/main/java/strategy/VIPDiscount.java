package strategy;

public class VIPDiscount implements Discount{
    public Double calculate(Double price) {
        System.out.println("VIP票：5折，积分");
        return price * 0.5;
    }
}
