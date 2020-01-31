package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore;

import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore.validate.Validate;

import java.util.ArrayList;
import java.util.Collections;

public class Validator {

    private final ArrayList<Validate>  validates;

    public Validator(Validate... validates){
        this.validates = new ArrayList<>();
        Collections.addAll(this.validates, validates);
    }

}
