package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore;

import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore.validate.*;

public class Main {
    public static void main (String... args) throws Exception {

        Product checkCorrectProduct = new Product("Lovense", 3.0, 50.0,
                5.0, "ADDD", "ggg@iii.com", "+79991488228",
                "Pushkina street", "22.12.2020", 10.0);
        Product checkUncorrectProduct = new Product("Lovense", 3.0, 50.0,
                5.0, "228", "ggg@iii.com", "+79991488228", "Pushkina street", "2019.02.22", 10.0);

        Validator validate1 = new Validator(new ValidateClientEmail(), new ValidateClientID(), new ValidateClientPhone(),
                new ValidateDateDelivery(), new ValidateDiscont(), new ValidateName(), new ValidatePrice(), new ValidateRequiredNum());
        validate1.checkValidates(checkCorrectProduct);
    }



}
