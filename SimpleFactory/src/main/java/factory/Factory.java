package factory;

import product.Product;
import product.ProductA;
import product.ProductB;

public class Factory {
    public static Product genProduct (String arg) {
        if(arg == "A") {
            return new ProductA();
        } else if (arg == "B"){
            return new ProductB();
        } else {
            return null;
        }
    }
}
