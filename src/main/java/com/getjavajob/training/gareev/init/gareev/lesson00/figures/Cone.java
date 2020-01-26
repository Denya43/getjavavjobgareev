package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.figures;

import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.Base;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.ConeB;

/**
 * Created by Denis on 13.04.2019.
 */
public class Cone{
    private final double radius;
    private final double height;
    private Base coneBase;

    public Cone(double radius, double height) {
        this.coneBase = new ConeB(radius);
        this.radius = radius;
        this.height = height;
    }

    public double baseArea() {
        return coneBase.area();
    }

    public double sectionArea(double sectionHeight) {
        return Math.PI * Math.pow(radius * ((height - sectionHeight) / height), 2);
    }

    public double fullArea() {
        return Math.PI * radius * Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)) + baseArea();
    }

    public double value() {
        return (baseArea() * height) / 3;
    }

}
