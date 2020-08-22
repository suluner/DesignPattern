package context;

import strategy.Discount;

public class MovieTicket {
    private Double price;
    private Discount discount;

    public Double getPrice() {
        return this.discount.calculate(this.price);
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
