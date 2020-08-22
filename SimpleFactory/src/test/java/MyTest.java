import factory.Factory;
import product.Product;

public class MyTest{

    public static void main(String args[]) {
        Product pro = Factory.genProduct("B");
        pro.use();
    }
}