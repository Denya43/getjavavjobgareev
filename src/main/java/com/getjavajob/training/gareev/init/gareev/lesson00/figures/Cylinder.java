package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.figures;


import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.Base;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.CylinderB;

/**
 * Created by Denis on 13.04.2019.
 */
public class Cylinder  {
    private final double radius;
    private final double height;
    private Base cylinderBase;

    public Cylinder(double radius, double height) {
        cylinderBase = new CylinderB(radius);
        this.radius = radius;
        this.height = height;
    }

    public double baseArea() {
        return cylinderBase.area();
    }

    public double sectionArea() {
        return baseArea();
    }

    public double fullArea() {
        return 2 * Math.PI * radius * height;
    }

    public double value() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

}
