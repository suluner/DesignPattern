import factory.Factory;
import factory.FactoryA;
import product.Product;

public class MyTest {
    public static void main (String args[]) {
        Factory factory = new FactoryA();
        Product pro = factory.genProduct();
        pro.use();
    }
}
