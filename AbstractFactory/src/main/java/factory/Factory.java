package factory;

import producta.ProductA;
import productb.ProductB;

public interface Factory {
    public ProductA genProductA();
    public ProductB genProductB();
}
