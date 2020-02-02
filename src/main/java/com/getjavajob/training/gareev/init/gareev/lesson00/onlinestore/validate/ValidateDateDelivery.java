package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore.validate;

import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore.Product;

import java.util.GregorianCalendar;

public class ValidateDateDelivery implements Validate
{
    @Override
    public boolean validate(Product product) {
       String[] date = product.getDeliveryDate().split("\\.");
       //for(String x: date) {
       //     System.out.println(x);
        //}
        GregorianCalendar gregorianCalendar = new GregorianCalendar(Integer.parseInt(date[2]), Integer.parseInt(date[1]),
                Integer.parseInt(date[0]));
        return gregorianCalendar.after(new GregorianCalendar());
    }
}
