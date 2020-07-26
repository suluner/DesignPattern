package factory;

import producta.ProductA;
import producta.ProductA2;
import productb.ProductB;
import productb.ProductB2;

public class Factory2 implements Factory{
    public ProductA genProductA() {
        return new ProductA2();
    }
    public ProductB genProductB() {
        return new ProductB2();
    }
}