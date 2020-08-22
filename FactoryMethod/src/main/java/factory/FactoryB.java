package factory;

import product.Product;
import product.ProductB;

public class FactoryB implements Factory{
    public Product genProduct() {
        return new ProductB();
    }
}
