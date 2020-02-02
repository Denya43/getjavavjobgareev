package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore.validate;

import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore.Product;


public class ValidateClientEmail implements Validate {
    @Override
    public boolean validate(Product product) {
        String email = product.getClientEmail();
        return email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }
}
