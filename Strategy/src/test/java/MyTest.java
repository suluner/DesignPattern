import context.MovieTicket;
import strategy.Discount;
import strategy.StudentDiscount;

public class MyTest {
    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();
        Double price = 60D;
        mt.setPrice(price);
        System.out.println("原始价格：" + price);

        Discount discount = new StudentDiscount();
        mt.setDiscount(discount);

        Double currentPrice = mt.getPrice();
        System.out.println("打折后价格：" + currentPrice);
    }
}