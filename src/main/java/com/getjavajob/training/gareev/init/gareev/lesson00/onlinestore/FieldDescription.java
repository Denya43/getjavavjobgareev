package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore;

import java.lang.annotation.*;

/**
 * Created by Denis on 25.03.2020.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldDescription {
    String value();
}
