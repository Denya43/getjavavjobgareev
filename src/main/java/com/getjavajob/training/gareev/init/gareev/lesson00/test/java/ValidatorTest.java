import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore.Product;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore.Validator;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore.validate.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class ValidatorTest {
    private Product checkCorrectProduct = new Product("Lovense", 3.0, 50.0,
            5.0, "ADDD", "ggg@iii.com", "+79991488228",
            "Pushkina street", "22.12.2020", 10.0);
    private Product checkUncorrectProduct = new Product("Lovense", 3.0, 50.0,
            5.0, "228", "ggg@iii.com", "+79991488228", "Pushkina street", "2019.02.22", 10.0);

    @Test
    public void validateNameTest(){
        Validator validator = new Validator(new ValidateName());
        validator.checkValidates(checkCorrectProduct);
        fail();
    }

    @Test
    public void validateNameWithExceptionTest() {
        Validator validator = new Validator(new ValidateName());
        validator.checkValidates(checkUncorrectProduct);
        fail();
    }

    @Test
    public void validateQuantityTest() {
        Validator validator = new Validator(new ValidateRequiredNum());
        validator.checkValidates(checkCorrectProduct);
        fail();
    }

     @Test
    public void validateQuantityWithExceptionTest() {
        Validator validator = new Validator(new ValidateRequiredNum());
        validator.checkValidates(checkUncorrectProduct);
        fail();
    }

    @Test
    public void validatePriceTest() {
        Validator validator = new Validator(new ValidatePrice());
        validator.checkValidates(checkCorrectProduct);
        fail();
    }

     @Test
    public void validatePriceWithExceptionTest() {
        Validator validator = new Validator(new ValidatePrice());
        validator.checkValidates(checkUncorrectProduct);
        fail();
    }

    @Test
    public void validateDiscountTest() {
        Validator validator = new Validator(new ValidateDiscont());
        validator.checkValidates(checkCorrectProduct);
    }

     @Test
    public void validateDiscountWithExceptionTest() {
        Validator validator = new Validator(new ValidateDiscont());
        validator.checkValidates(checkUncorrectProduct);
        fail();
    }

    @Test
    public void validateCustomerIDTest() {
        Validator validator = new Validator(new ValidateClientID());
        validator.checkValidates(checkCorrectProduct);
        fail();
    }

     @Test
    public void validateCustomerIDWithExceptionTest() {
        Validator validator = new Validator(new ValidateClientID());
        validator.checkValidates(checkUncorrectProduct);
        fail();
    }

    @Test
    public void validateEmailTest() {
        Validator validator = new Validator(new ValidateClientEmail());
        validator.checkValidates(checkCorrectProduct);
    }

     @Test
    public void validateEmailWithExceptionTest() {
        Validator validator = new Validator(new ValidateClientEmail());
        validator.checkValidates(checkUncorrectProduct);
        fail();
    }

    @Test

    public void validatePhoneNumberTest() {
        Validator validator = new Validator(new ValidateClientPhone());
        validator.checkValidates(checkCorrectProduct);
        fail();
    }

     @Test
    public void validatePhoneNumberWithExceptionTest() {
        Validator validator = new Validator(new ValidateClientPhone());
        validator.checkValidates(checkUncorrectProduct);
        fail();
    }

    @Test
    public void validateDeliveryDateTest() {
        Validator validator = new Validator(new ValidateDateDelivery());
        validator.checkValidates(checkCorrectProduct);
        fail();
    }

     @Test
    public void validateDeliveryDateWithExceptionTest() {
        Validator validator = new Validator(new ValidateDateDelivery());
        validator.checkValidates(checkUncorrectProduct);
        fail();
    }
}
