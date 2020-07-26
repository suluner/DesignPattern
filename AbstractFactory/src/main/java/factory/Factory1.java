package factory;

import producta.ProductA;
import producta.ProductA1;
import productb.ProductB;
import productb.ProductB1;

public class Factory1 implements Factory{

    public ProductA genProductA() {
        return new ProductA1();
    }
    public ProductB genProductB() {
        return new ProductB1();
    }
}