package main.java.com.getjavajob.training.gareev.init.gareev.lesson02.inputDataException;

import java.io.IOException;

/**
 * Created by Denis on 01.04.2020.
 */
public class AuthorizedCapitalException extends IOException{
    public AuthorizedCapitalException(){
        super("Incorrect authorized capital value");
    }
}
