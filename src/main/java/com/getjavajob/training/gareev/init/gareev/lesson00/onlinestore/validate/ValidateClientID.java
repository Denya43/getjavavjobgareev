package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore.validate;

import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore.Product;

public class ValidateClientID implements Validate {
    @Override
    public boolean validate(Product product) {
        return product.getClientID().matches("^[A-ZА-Я]+$");
    }
}
