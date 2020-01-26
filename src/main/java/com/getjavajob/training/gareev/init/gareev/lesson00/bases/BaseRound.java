package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases;

/**
 * Created by Denis on 14.04.2019.
 */
public abstract class BaseRound implements Base {
    private final double radius;

    BaseRound(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
