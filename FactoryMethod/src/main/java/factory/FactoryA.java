package factory;

import product.Product;
import product.ProductA;

public class FactoryA implements Factory{

    public Product genProduct() {
        return new ProductA();
    }
}