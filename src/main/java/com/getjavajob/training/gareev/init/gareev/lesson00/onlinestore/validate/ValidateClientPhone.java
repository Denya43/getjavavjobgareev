package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore.validate;

import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore.Product;

public class ValidateClientPhone implements  Validate {
    @Override
    public boolean validate(Product product) {
        return product.getPhoneNUmber().matches("^\\+79[0-9]{9}$");
    }
}
