package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore.validate;

import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore.Product;

public class ValidateName implements Validate {
    @Override
    public boolean validate(Product product) {
        String name = product.getProductName();
        return (name != null && !name.trim().isEmpty());
    }
}
