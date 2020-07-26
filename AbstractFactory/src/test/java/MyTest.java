import factory.Factory;
import factory.Factory1;
import factory.Factory2;
import producta.ProductA;
import productb.ProductB;

public class MyTest {

    public static void main (String args[]) {
        Factory factory1 = new Factory1();
        ProductA proa1 = factory1.genProductA();
        ProductB prob1 = factory1.genProductB();
        proa1.use();
        prob1.eat();

        Factory factory2 = new Factory2();
        ProductA proa2 = factory2.genProductA();
        ProductB prob2 = factory2.genProductB();
        proa2.use();
        prob2.eat();
    }
}
