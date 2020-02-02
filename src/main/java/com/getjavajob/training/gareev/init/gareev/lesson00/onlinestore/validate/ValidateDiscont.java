package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore.validate;

import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore.Product;

public class ValidateDiscont implements Validate {
    @Override
    public boolean validate(Product product) {
        Double discount = product.getDiscountSize();
        return discount > 0 && discount < product.getPrice()*0.2;
    }
}
